# StrFormat,`[`LEFT / RIGHT`]` #
## Syntax ##
```
StrFormat,<Action>,<%string%>,<CharsToObtain>,<%var%>
```
This command gets a specified number of characters from the left or right end of a given variables content.

## Example: ##
In this example we have a given string tomorrow  and we want to get 3 chars from the left filled into %var1% with value `tom`, and 3 characters into %var2% (using `StrFormat,RIGHT`) with result row.
```
Set,%string%,tomorrow
StrFormat,LEFT,%string%,3,%var1%
StrFormat,Right,%string%,3,%var2%
```