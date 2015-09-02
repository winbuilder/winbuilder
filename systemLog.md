# System,Log #
Control the output log functionality
## Syntax ##
```
System,Log,{on|off}
```
When a project needs to use a certain function many, many times, it could expand inside the log.html into many unnecessary lines. This command stops / restarts logging to log.html.  It is most useful inside [API functions](wbcommonapi.md).

**It is only in effect for the remainder of the current script!**

## Example: ##
```
System,Log,off
```