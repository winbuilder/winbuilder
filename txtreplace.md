# TxtReplace #

## Syntax ##
```
TXTReplace,<Filename>,<OldString>,<NewString> 
```
This command will look inside a given filename and replace all text that match the value of OldString and replace them with NewString

## Example: ##
All matches to Hello World! within a text file will be replaced by Have a good day
```
TXTReplace,C:\myFile.txt,"Hello World!","Have a good day" 
```