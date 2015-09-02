# StrFormat,`[`CEIL / FLOOR`]` #
## Syntax ##
```
StrFormat,<Action>,<%var%>,<%size%>
```
These functions will round up or down the variables value as specified to the nearest "size".  Here "size" may be:
  * number (e.g. 512)
  * the character 'k' meaning 1024 (i.e. = kilobyte)
  * the character 'm' meaning 1024  **1024 (i.e. = megabyte)**

The action selected is either:
  * Ceil = round up
  * Floor = round down

## Example: ##
In this given example we are rounding up the value of %var% to the next multiple of %size%. The result is written back into %var% with the value of 40.
```
Set,%var%,37
Set,%size%,10
StrFormat,CEIL,%Var%,%size%
```