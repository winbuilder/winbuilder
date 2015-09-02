# TxtDelLine #

## Syntax ##
```
TXTDelLine,<Filename>,<StringToDelete> 
```
This command will look for lines that match the `StringToDelete` value and will remove these lines from the text file.

StringToDelete doesn't need to be the value of the entire line, it only need to match the **beginning** of the line.

## Example: ##
All lines that start with "Hello" inside `C:\myFile.txt` will be removed.
```
TXTDelLine,C:\myFile.txt,Hello
```