# FileCreateBlank #

Create a new empty file with the filename you specify. If a file with the same filename already exists it will be overwritten.

## Syntax ##
```
FileCreateBlank,<NewFile>[,PRESERVE][,NOWARN] 
```

## Parameters ##
|1|NewFile|The full path of the empty files to create. If the file exists it will be truncated and a warning will be logged.|
|:|:------|:----------------------------------------------------------------------------------------------------------------|
|-| PRESERVE _(Optional)_|Do not over-write the file if it exists.                                                                         |
|-| NOWARN _(Optional)_| Do not log a warning if the file exists or is over-written.                                                     |

The parameters PRESERVE, and NOWARN can be used simultaneously. The order does not matter.

## Example: ##
```
FileCreateBlank,c:\MyPath\MyNewFile.txt
```