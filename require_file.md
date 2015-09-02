# Require\_File #

This function is used to copy a source file from a source folder to a target folder expanding the file if its compressed. It will in addition copy any language resource files associated with the file.

## Syntax ##
```
Require_File,SourceFile,[SourceFolder],[TargetFolder],[PRESERVE]|[OverWrite],[NOWARN],[MUISource]
```

## Parameters ##
|1|SourceFile|Name of the file to copy. For XP based projects this should be the final expanded file name not the compressed file name.<br> This may optionally contain a path which will be relative to the SourceFolder / TargetFolder parameters.<br>
<tr><td>2</td><td>SourceFolder</td><td>Folder containing the file to copy. This defaults to %Source_Sys%.                                                                                                                                                                    </td></tr>
<tr><td>3</td><td>TargetFolder</td><td>Folder to which the file is to be copied. This defaults to %Target_Sys%.                                                                                                                                                              </td></tr>
<tr><td>4</td><td>PRESERVE  </td><td>By default if the target file exists it will be overwritten - this can be explicitly requested by . This parameter is used to not copy the file if it already exists in the target folder. A warning will be generated in the log file if the target file exists. The optional NOWARN parameter can be used to suppress this warning.</td></tr>
<tr><td>5</td><td>NOWARN    </td><td>By default a warning will be generated in the log file if the target file exists. This parameter is used to suppress the warning.                                                                                                     </td></tr>
<tr><td>6</td><td>MUISource </td><td>For XP based projects only this parameter optionally allows the folder containing the language specific files associated with the source file to be specified.                                                                        </td></tr></tbody></table>

<h2>Remarks ##
  * The expansion of compressed files functionality is specific to XP based projects where many source files are compressed. These compressed files use the cabinet archiving method and usually have an identifiable `_` as the last character on their extensions. (e.g. `myFile.Tx_` ).

  * Vista/Win7 source does not use explicitly compressed source files instead the source is contained within a WIM file which is compressed.

## Tips ##
  * The PRESERVE parameter must be parameter 4. The NOWARN parameter must be parameter 5.

## Example ##
This always copies shlwapi.dll, only copies swenum.sys if it does not exist in the target directory but logs a warning, only copies swenum.sys if it does not exist in the target directory and supresses the warning if it already exists in the target directory.
```
Require_File,shlwapi.dll
Require_File,shlwapi.dll,,,PRESERVE
Require_File,shlwapi.dll,,,PRESERVE,NOWARN
```

This always copies swenum.sys from the %Source\_Sys%\drivers folder to the %target\_sys%\drivers folder
```
Require_File,drivers\swenum.sys
```