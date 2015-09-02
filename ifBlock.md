# Begin / End #
These commands are used to mark the start and end of a command block and are used with the conditional statements ([if `IF / ELSE`](.md)) to form a command block.  This is used when multiple commands are desired to be executed as the result of a single conditional test.
```
Begin
   <command>
   <command>
     ...
   <command>
End
```
Here the individual commands can be any valid script command.
Because `<command>` can also be an `If`, nested command blocks are possible.

## Example: ##
```
If,%OSName%,Equal,xp,Begin
  If,%SP%,NotEqual,sp3,Begin
    If,%pCheckBox1%,Equal,True,Run,%ScriptFile%,Process-KB893803
  End
  Else,Begin
    Set,%hotfix%,1
    Run,%ScriptFile%,Process-Copy
  End
End
Else,...
```