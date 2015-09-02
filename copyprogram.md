# CopyProgram #

Copy all files from a specified directory to `%ProgramFolder%`

## Syntax ##
```
CopyProgram,SourceFolder,[TargetFolder],[Filename],[FileToDelete]
```

## Parameters ##
|1|SourceFolder|Source folder containing script files to copy. All files in this folder will be copied.|
|:|:-----------|:--------------------------------------------------------------------------------------|
|2|TargetFolder|Optional target folder to which the source folder will be copied. If it does not exist the folder will be created. It defaults to:<br><code>%Target_Prog%\%ProgramFolder%</code>
<tr><td>3</td><td>FileName    </td><td>Used to test if filename exist in the source folder. If not a message will appear and the function will be skipped. It defaults to:<br><code>%ProgramExe%"</code></td></tr>
<tr><td>4</td><td>FileToDelete</td><td>Optional file name to delete in target folder                                          </td></tr></tbody></table>

## Remarks ##
It will usually be used when the script files are contained in a sub folder of the script folder or in the script folder itself. In the latter case you would use the FileToDelete parameter to delete the script file from the target folder.

## Example ##
This will copy all files from a sub directory of the script directory named `%ProgramFolder%`. It will show an error if pcidevs.txt does not exist in this source directory.
```
CopyProgram,%ScriptDir%\%ProgramFolder%,,pcidevs.txt
```