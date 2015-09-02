# RequireSysFile (Vista / Win7 Projects only ) #

Copy a source file from the %SystemFiles% source folder to the %TargetDir% target folder.

## Syntax ##
```
RequireSysFile,SourceFile,[NOWARN],[PRESERVE]
```
## Parameters ##
|1|SourceFile|Name of the file to copy. This may optionally contain a path which will be relative to the %SystemFiles% / %TargetDir% folders.|
|:|:---------|:------------------------------------------------------------------------------------------------------------------------------|
|2|NOWARN    |By default a warning will be generated in the log file if the target file exists. This parameter is used to suppress the warning.|
|3|PRESERVE  |By default if the target file exists it will be overwritten. This parameter is used to not copy the file if it already exists in the target folder. A warning will be generated in the log file if the target file exists. The optional NOWARN parameter can be used to suppress this warning.|

## Remarks ##
  * The copy will always be from the mounted install.wim.
  * It will in addition copy any language resource files associated with the file.

## Tips ##
The NOWARN and PRESERVE parameters can be specified in any order.

# NOTE: #
This functon has been superceded by the Require\_File function which works for all common API projects.

## Example ##
This always copies shlwapi.dll, only copies swenum.sys if it does not exist in the target directory but logs a warning, only copies swenum.sys if it does not exist in the target directory and supresses the warning if it already exists in the target directory.
```
RequireSysFile,windows\system32\shlwapi.dll
RequireSysFile,windows\system32\shlwapi.dll,PRESERVE
RequireSysFile,windows\system32\shlwapi.dll,NOWARN,PRESERVE
```

This always copies swenum.sys from the %Source\_Sys%\drivers folder to the %target\_sys%\drivers folder
```
Require_File,windows\system32\drivers\swenum.sys
```