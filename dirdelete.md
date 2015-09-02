# DirDelete #

Delete the entire contents of a directory. Deleted folders are not recoverable from the recycle bin.

## Syntax ##
```
DirDelete,<DirToDelete>[,FAST]
```

## Example: ##
```
DirDelete,c:\MyPath
```

## Remarks ##
As of WB076, the optional **`FAST`** parameter was added. When this parameter is used, WinBuilder will rename the directory to a random name, and then execute the delete process in the background.  This can improve performance when removing directories that have a large number of files in them.
  * **Note:** This background process (i.e. the remove directory command) is a child of WinBuilder. When ( or **IF** ) WinBuilder is exited before the delete is finished, the background process is also terminated, and may leave a directory with a name like `~<???>.tmp` left behind.  If this happens, just manually delete this directory.