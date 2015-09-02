# FileCopy #

Copy source file(s) to a specified destination.

## Syntax ##
```
FileCopy,<FromFile>,<ToPath>[,PRESERVE][,NOWARN][,SHOW][,NOREC]
```

## Parameters ##
|1|FromFile|The file to copy. Wildcards `(*.*)` are allowed.|
|:|:-------|:-----------------------------------------------|
|2|ToPath  |The destination path.  It may be just a directory, and if so, the file name will be preserved. If a filename is specified as a part of the destination, the file will be renamed. If the file exists in the target directory it will be overwritten and a warning will be written to the log.|
|-|PRESERVE _(Optional)_|Do not overwrite existing files. A warning will be written to the log.|
|-|NOWARN _(Optional)_|Do not write a warning message to the log if the file exists.|
|-|SHOW _(Optional)_| When using wildcards the progress bar shows single file processing, and the actual copied file name is shown.|
|-|NOREC _(Optional)_|When using wildcards only files in the initial folder will be copied, sub-directories will be ignored.|

## Remarks ##
  * The optional parameters PRESERVE, NOWARN, SHOW and NOREC can be used simultaneously. The order does not matter.
  * When using wildcards the warning mechanism is switched off.
  * Trying to copy wildcard source to a single destination file raises an error.

## Example: ##

In this example FileCopy will copy all text files (`*.txt`) from MyPath and it's subdirectories to AnotherPath (using the C: drive)
```
FileCopy,c:\MyPath\*.txt,c:\AnotherPath
```