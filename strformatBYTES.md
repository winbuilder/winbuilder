# StrFormat,BYTES #
## Syntax ##
```
StrFormat,bytes,<%VarResult%> 
```
This command is used to convert a specific number of bytes from the given text to a more human readable format. Any amount of bytes specified will be converted to Kb, Mb, Gb and Tb.

## Example: ##
```
StrFormat,bytes,1440000,%myVar%
```
In this example %myVar% will contain "1.44Mb "