# FileDelete #

Delete the specified file(s).

## Syntax ##
```
FileDelete,<FileToDelete> [,Nowarn][,Norec]
```

## Parameters ##
|1|FileToDelete|The full path to the file(s) including sub-directories to delete. Wildcards are supported. If the file does not exist or no files match the wildcard a warning will be logged.|
|:|:-----------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|-|NOWARN _(Optional)_|Do not log a warning if the files don't exist                                                                                                                                 |
|-|NOREC _(Optional)_|Only matching files in the specified directory will be deleted. Sub-directories will be ignored.                                                                              |

  * The optional parameters Nowarn and Norec can be specified in any order.
  * **All deleted files are immediately removed. You cannot recover them from the recycle bin.**

## Example 1: ##
In this example FileDelete will delete all text files (`*.txt`) from `c:\MyPath`
```
FileDelete,c:\MyPath\*.txt
```

## Example 2: ##
```
FileDelete,c:\MyPath\*.txt,NoWarn,Norec
```
In this example FileDelete will delete all text files (`*`.txt) from the MyPath directory only. Any .txt files in any sub directories of MyPath will NOT be deleted. If no files are found a warning will not be added to the log file.

### Note: ###
The Nowarn and Norec parameters were added in Winbuilder 082. They will not work with older versions.