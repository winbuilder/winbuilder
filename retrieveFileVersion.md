# Retrieve,FileVersion #

Retrieves version info from the specified file if it is available.

## Syntax ##
```
Retrieve,FILEVERSION,<Filename>,<%var%>
```

## Parameters ##
|1|Filename|The full path to the file|
|:|:-------|:------------------------|
|2|%var%   |A user defined variable used to store the version|

## Example: ##
This example fills %var% with the file version string, as it can be seen by EXE-file's properties.
```
Retrieve,FILEVERSION,"c:\Program Files\IrfanView\i_view32.exe",%var%
```