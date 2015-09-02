# `_`Calculate #

Execute an AutoIT command that returns a value.

## Syntax ##
```
_Calculate,AutoIT Command(expression),ReturnVar
```

## Parameters ##
|1|AutoIt Command(expression)|AutoIt command to execute|
|:|:-------------------------|:------------------------|
|2|ReturnVar                 |This is the name of the variable to receive the return value of the AutoIt command. It must be specified without the %|

## Remarks ##
This command uses a program called sCalculate to execute the AutoIt command. This program will be automatically downloaded to the winbuilder tools directory if it does not exist.

## Tips ##
  * Always use simple quote in the command expression - i.e. use `[#$c]` in place of `[,]`
  * Use the variable synatax (i.e. `%ReturnVar%`  with the `%`) to access the return result in your code.
  * See !AutoIT docs at http://www.autoitscript.com/autoit3/docs/ for more information.

## Example ##
This will show a simple message box with Abort / Retry / Ignore buttons for 5 seconds
```
_Calculate,MsgBox(2#$c'Test Calculate'#$c'Choice:'#$c5),Choice
```

This will display an input box to ask the user to enter a string.
```
_Calculate,InputBox('Question'#$c 'Where were you born?'#$c 'Planet Earth'#$c ''#$c -1#$c -1#$c -1#$c -1),Answer
```