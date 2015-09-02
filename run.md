# Run / Exec #
## Syntax ##
```
Run,%ScriptFile%,<Section>[,parameters]
Exec,%ScriptFile%,<Section>[,parameters]
```

The **Run** command is used to process the commands found in a named section of a script file. You can run sections from any script including the script from where run is originally called.
> Note: use the variable `%scriptFile%` as a parameter to call another section found inside the same script.

The `Run` command command will use the same variables available in the original script from where it was called. The `Exec` command has a very similar behavior. However, it will additionally add all the variables found inside the `[variables]` section of the script file selected. Identical variables found on the new script will overwrite the existing value.

This command also allows you to use parameters - this is a very useful feature to create a section that works based on these variables and this way avoid the need to add very long similar lines of code.  In fact, this is used heavily by the common API implementation.

Inside each section that is called by the `Run` command, you can use the respective parameters - they are numbered from #1 to #9.  This means that you can use a command like
```
Run,%scriptfile%,mysection,"Hello World!"
```
and inside the `[mysection]` of the same script you could use a command like `echo,#1` to display "Hello World!" on your log. All variables are "passed by value".  That means that they are usually read only.  If you want to return an updated variable after the section has been completed, prefix it with `OUT:` to indicate that it should be updated.
**Note:The "OUT" mechanism is not supported by EXEC.**

**Note:The "OUT" tag is case sensitive. "Out" will not work.**

If a 'Run' has more than 9 parameters, they can be accessed using two new commands added in WB078
  * [GetParam](getparam.md)
  * [PackParam](packparam.md)

## Example: ##
In this example we run a section called mySection inside the same script
```
run,%scriptfile%,mySection
```
In this example, after returning from the "Run", `%first%` and `%third%` are unchanged, regardless whether inside the "Run" #1 and / or #3 are changed. `%second%` will get the actual value of #2 when "Run" is finished.
```
Run,%scriptfile%,mySection,%first%,OUT:%second%,%third%
```