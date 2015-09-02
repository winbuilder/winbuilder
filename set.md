# Set #

## Syntax ##
```
Set,<%Variable%>,<NewValue>[,GLOBAL / PERMANENT] 
```
With this command we can change the value of a variable. If more variables are linked to this variable, then you might need to call
`System,RefreshVars` to ensure that all variables get refreshed values and work properly.

**WB076** added a new variable handling mechanisim that makes `System,RefreshVars` unnecessary.

Usually the variable's definition has a lifetime of the current script.
  * You can make it valid for the rest of the actual build by adding the optional parameter `GLOBAL`
  * You can make it valid for the lifetime of the project (i.e. write it's value into script.projects) by adding the optional parameter `PERMANENT`.
These aparameters are mutually exclusive.

## Example: ##
```
Set,%workdir%,c:\myPath,GLOBAL
```