# System,IsTerminal #
Check to see if !WinBUilder has been started on a remote desktop
## Syntax ##
```
System,IsTerminal,<%var%>
```

This command will set the variable to true if winbuilder is being run under terminal server ( remote desktop ). This can cause problems to some projects.

## Example: ##
```
System,IsTerminal,%var%
If,%var%,Equal,True,begin
    Message,"Error: It seems you are working in a Terminalserver session. This might cause unexpected problems. ",INFORMATION,15
    Echo,"Error: It seems you are working in a Terminalserver session. This might cause unexpected problems."
End
```