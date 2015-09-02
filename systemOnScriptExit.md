# System,OnScriptExit #

Specify the command to be executed after the last statement in the current script has been executed.

## Syntax ##
```
System,ONSCRIPTEXIT,<Command> 
```
This statement can be written anywhere inside the running part of the script.

If the command is 'Run', the 'type' of the exit is passed as parameter #1, and can be one of the following values:
  * DONE - normal finish
  * STOP - the user clicked the STOP button
  * ERROR - the script has been finished because of an error
  * COMMAND - the script has been finished because of a System,Halt or System,Exit command
  * EXCEPTION - a system exception occurred during process, e.g. 'index out of bounds'

## Example: ##
```
System,ONSCRIPTEXIT,Message,"Everything Done!",INFORMATION 
```

```
System,ONSCRIPTEXIT,Run,%ScriptFile%,MYEXIT
// force an error:
FileCopy,y,x

[MYEXIT]
If,#1,EQUAL,ERROR,Beep,ERROR
If,#1,EQUAL,STOP,Beep,WARNING
If,#1,EQUAL,DONE,Beep,OK
If,#1,EQUAL,COMMAND,Beep,CONFIRMATION 
```