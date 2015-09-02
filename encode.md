# Encode #

Embed files inside a script.

## Syntax ##
```
Encode,<%ScriptFile%>,<Folder>,<Filenames> 
```

## Remarks ##
Winbuilder hs the ability to contain binary and other files inside the script files. These are stored in an ASCII encoded format so that they can be handled as text files.

You can either specify a single filename or use wildcards that match a file criteria. If the folder doesn't exist, it is created otherwise files are added to the already available folder.

## Example: ##
With this syntax we add c:\myApp.exe inside Folder to C:\myFile.script
```
Encode,C:\myFile.script,Folder,c:\myApp.exe 
```