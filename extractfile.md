# ExtractFile #

Extract a single file from a folder inside a given script.

## Syntax ##
```
ExtractFile,<%ScriptFile%>,<Folder>,<Filename>,<DirToExtract> 
```
## Parameters ##
|`%scriptfile%`|a variable that refers the filename of the script, it is used when you want to extract a file from the same script that you are running. You can also replace this variable with other filenames and extract files from them.|
|:-------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|`Folder`      |is a directory where the file is placed under the attachments structure which is similar to a very simple filesystem, this way you can add several folders inside a script to organize your files the way you prefer.        |
|`Filename`    |is the name of the file that you want to extract. No path is required, only the file name.                                                                                                                                   |
|`DirToExtract`|is the target folder where you want to place this file.                                                                                                                                                                      |

## Example: ##
Using this example we will extract a given myFile.txt from myFile.script to the c:\ directory
```
ExtractFile,C:\myFile.script,Folder,myFile.txt,c:\ 
```

### See Also ###
[ExtractAllFiles](extractallfiles.md)
[ExtractAllFilesIfNotExist](extractallfilesifnotexist.md)