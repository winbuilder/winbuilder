# ExtractAllFiles #

Extract all files from a given folder inside a script.

## Syntax ##
```
ExtractAllFiles,<%ScriptFile%>,<Folder>,<DirToExtract> 
```

Uses the same syntax as the [ExtractFile](extractfile.md) command which can be used to extract a single file, but with the advantage that you can extract all files from a folder without needing to specify individual filenames.

## Example ##
Using this example we will extract all files found inside a folder in a given script file to c:\
```
ExtractAllFiles,C:\myFile.script,Folder,c:\ 
```

### See Also ###
[ExtractFile](extractfile.md)
[ExtractAllFiles](extractallfiles.md)
[ExtractAllFilesIfNotExist](extractallfilesifnotexist.md)