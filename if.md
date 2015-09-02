# If Clauses #

In the WinBuilder script language you can use the `If` statement to evaluate certain conditions and create conditional branches of execution.
If a condition is true when you test it with the IF command then a command will be executed.  The general format of this command is:
```
If,<condition>,<command>
```
Starting with WB076, the ability to have an alternate command executed was added by following the `If` statement with an optional `else` command. If a condition is false when you test it with the `IF` command then the  command following the `Else` keyword will be executed.
  * Note: The `Else` command must follow the If command immediately.
```
If,<Condition>,<Command>
Else,<Command>
```
In the following example we are testing if `c:\myFile.txt` does not exist. If this is true, then `FileCreateBlank,c:\myFile.txt` will be executed, otherwise a message windows with the text `File already exists` appears.
```
If,Not,ExistFile,C:\myFile.txt,FileCreateBlank,C:\myFile.txt
Else,Message,"File already exists",INFORMATION
```
This is a very powerful construct, since the `<command>` specified can be
**ANY** valid script command.  This was further enhanced with the addition of command blocks using [Begin / End](ifBlock.md), which allows multiple commands to be executed.