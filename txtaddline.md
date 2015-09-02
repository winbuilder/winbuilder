# TxtAddLine #

## Syntax ##
```
TXTAddLine,<Filename>,<StringLine>,<Action> 
```
With this command we can add a text line at a given location inside a text file, you can specify this location using an action option.

  * **Action** options
    * **PrePend** - Will add the text line on the top of the text file
    * **Append** - The same as above but on the bottom of the file.
    * **Place** - Will place the text line after a specified number of lines (see example for details)

## Example: ##
With this syntax we add a line saying Hello World! in the 5th line counting from the top. If the text file doesn't have 5 lines, then it will be placed after the current last line. There is no limit to this count value.
```
TXTaddLine,C:\myFile.txt,Hello World!,place,5 
```