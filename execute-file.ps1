Param(
	[Parameter(Mandatory)]
	[string]$InputPath,
	[string]$OutputPath
)

If(-Not (Test-Path $InputPath)){
	Throw "The file directory $InputPath does not exist"
	exit
}

If(-not $OutputPath){
	If(Test-Path $InputPath -PathType 'Leaf'){
		$OutputPath = [System.IO.Path]::ChangeExtension($InputPath, "jar")
	}Else{
		$OutputPath = "main.jar"
	}
}

Write-Host "Compiling...."
& kotlinc $InputPath -include-runtime -d $OutputPath 

If($LASTEXITCODE -ne 0){
	Write-Host "The compiling was failed"
	exit 1
}



Write-Host "Running..."
& java -jar $OutputPath 

& ri -Force $OutputPath	