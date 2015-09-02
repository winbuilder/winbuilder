# Comparison Operations for If #
# Equal  / NotEqual / Smaller / Bigger #

This set of `IF` clauses can compare numeric values as well as text strings.
```
If,<%var%>,<test>,<value>,<Command> 
```
For comparing text strings, WB078 added `EqualX` which does a case sensitive comparison.

## Example ##
In this given example we are testing if `%myVariable%` is equal to 10. If this condition is true then `FileCreateBlank,c:\myFile.txt` will be executed
```
If,%myVariable%,Equal,10,FileCreateBlank,c:\myFile.txt
```