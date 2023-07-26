Param(
	[Parameter(Mandatory)]
	[string]$FileName,
	[string]$OutputName
)


If(-Not (Test-Path $FileName)){
	Throw "The file directory $FileName does not exist"
	exit
}ElseIf((Get-Item $FileName).Extension -ne ".kt"){
	Throw "The file not is a kotlin file"
}

# Check the outputfile:

If(-not $OutputName){
	$OutputName = [System.IO.Path]::ChangeExtension($FileName, "jar")
}


Write-Host "Compiling...."
& kotlinc $FileName -include-runtime -d $OutputName 

Write-Host "Running..."
& java -jar $OutputName 

& ri -Force $OutputName