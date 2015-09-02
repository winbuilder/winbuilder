# System,SplitParameters #

Splits in a 'Run' or 'Exec' command a single parameter which contains commas, into several parameters.

## Syntax ##
```
System,SPLITPARAMETERS,{ON|OFF}
```

The `System,SPLITPARAMETERS,ON` command can be given once in the project, e.g. in the `[Process]` section of script.project, and is then valid for the complete project (or until it is switched off by a `System,SPLITPARAMETERS,OFF` command.  It can then be switched on again later, and off, and so on ....)

## Example: ##
```
[process]
Set,%List%,"a,b,c"
Run,%ScriptFile%,Test,%List%
System,SPLITPARAMETERS,ON
Run,%ScriptFile%,Test,%List%
System,SPLITPARAMETERS,OFF

[Test]
Echo,#1
Echo,#2
Echo,#3
```

This creates a log file result:

![http://winbuilder.googlecode.com/svn/wiki/images/SplitParameters.png](http://winbuilder.googlecode.com/svn/wiki/images/SplitParameters.png)