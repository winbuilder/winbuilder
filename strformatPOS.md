# StrFormat,POS #
## Syntax ##
```
StrFormat,POS,<String>,<SubString>,<%VarResult%>
```
find the position of the given SubString inside the specified String and return the result in %VarResult%

## Example: ##
In this example we verify the position of (case insensitive) 'orl' in 'Hello World' with result 8.
```
StrFormat,POS,"Hello World",orl,%VarResult%
```
In this example we verify the position of lowercase 'l' in 'HELLO World' with result 10.
```
StrFormat,POSX,"HELLO World",l,%VarResult%
```