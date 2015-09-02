# DirCopy #

This command will copy a folder and respective sub folders from a given source to a specified destination.

## Syntax ##
```
DirCopy,<FromDir>,<ToDir>[,SHOW]
```

## Remarks ##
  * DirCopy will overwrite any previously existing folder.
  * The optional SHOW parameter will show the OS internal progress window.

## Example ##
In this example DirCopy will copy the complete directory MyPath to AnotherPath
```
DirCopy,c:\MyPath,c:\AnotherPath
```

In this example DirCopy will copy all files and directories inside MyPath to AnotherPath
```
DirCopy,c:\MyPath\*.*,c:\AnotherPath
```