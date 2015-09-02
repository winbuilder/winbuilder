# Not #

This syntax was introduced to simplify the addition of future conditions.  It basically changes the "sense" of the check from true to false.
In other words, the statement `If,Not,%var1%,EQUAL,%var2%,command` is equivalent to `If,%var1%,NOTEQUAL,%var2%,command`.

## Syntax ##
```
If,Not,<Condition>,<Command>
```

## Note: ##
#### Many of the earlier conditional tests had an explicit form of negative test.  That syntax is still supported for compatibility, however, all tests of the form `<NotXxxxxx>` are internally converted to `<Not,Xxxxxx>` before being processed by WinBuilder ####

## Example: ##
```
If,Not,%var1%,EQUAL,%var2%,FileCreateBlank,C:\myFile.txt
```