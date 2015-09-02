# Require\_FileQ #

This function is used to copy or expand a single file to %target\_sys% based on app script architecture.

## Syntax ##
```
Require_FileQ,SourceFile
```

## Parameters ##
|1|SourceFile|Name of the file to copy. This should be the final expanded file name not the compressed file name. |
|:|:---------|:---------------------------------------------------------------------------------------------------|


## Remarks ##
This is a simplified and much faster to execute version of [Require\_File](require_file.md). Wildcards are not supported.

  * For 32 bit source the 32 bit version of the system file will always be copied. For 64 bit source the default will be to copy the 64 bit version of the system dll. If a script only supports 32 bit then copying of the 32bit system can be forced by setting the %CapiScriptArch% variable.

  * The expansion of compressed files functionality is specific to XP based projects where many source files are compressed. These compressed files use the cabinet archiving method and usually have an identifiable `_` as the last character on their extensions. (e.g. `myFile.Tx_` ).

  * Vista/Win7 source does not use explicitly compressed source files instead the source is contained within a WIM file which is compressed.

## Example ##

> This always copies shlwapi.dll.
```
Require_FileQ,shlwapi.dll
```

> This always copies the 32 bit clbcatq.dll regardless of the source architecture.
```
Set,%CapiScriptArch%,x86
Require_FileQ,clbcatq.dll
```

> If the source architecture is 64 bit and for some reason it is required to copy both versions of a file in a single script then this will copy both versions of clcatq.dll. If the source is 32 bit it will copy the same file twice.
```
Require_FileQ,clbcatq.dll
Set,%CapiScriptArch%,x86
Require_FileQ,clbcatq.dll
```