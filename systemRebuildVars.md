# System,RebuildVars #
Rebuild the system variable table
## Syntax ##
```
System,REBUILDVARS
```
This is the successor of `System,RefreshVars`, which was deprecated as of WB076. In most cases it is no longer necessary (**or supported**).

### Example: ###
```
Set,%First%,first
Set,%Result%,"Here is %first%"
Echo,Value of #$pResult#$p is: %Result%
// >> Here is first
Set,%First%,second
Echo,Value of #$pResult#$p is: %Result%
// >> Here is first
System,RebuildVars
Echo,Value of #$pResult#$p is: %Result%
// >> Here is second 
```