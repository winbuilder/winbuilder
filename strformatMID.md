# StrFormat,MID #
## Syntax ##
```
StrFormat,MID,<%string%>,<PositionOfFirstChar>,<CharsToObtain>,<%var%>
```
This command pulss a given number of characters out of the "middle" of a string

## Example: ##
In this example we have a given string tomorrow  and we want to get 4 chars beginning with the third char. The result is filled into %var% with value `morr`.
```
Set,%string%,tomorrow
StrFormat,MID,%string%,3,4,%var%
```