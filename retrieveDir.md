# Retrieve,Dir #

Display a dialog box asking the user to select a folder.

## Syntax ##
```
Retrieve,Dir,<DirectoryOrFilename>,<%var%> 
```

## Parameters ##
|1|DirectorOrFileName|The initially selected folder|
|:|:-----------------|:----------------------------|
|2|%var%             |A user defined variable that will contain the full path of the selected directory|

## Example: ##
> You can use this example to open a dialog box asking the user to select a folder. This box will start in `c:\`. Once a file is selected, the %var% will contain the full path of this selected directory.
```
Retrieve,Dir,c:\,%var%
```