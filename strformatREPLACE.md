# StrFormat,`[`REPLACE / REPLACEX`]` #
## Syntax ##
```
StrFormat,REPLACE,<%string%>,<CharsToReplace>,<ReplacementChars>,
<%VarResult%>
```
Will "replace" a given number of characters inside a given string. It is **not** case sensitive.
  * **For a case sensitive version of this command, use (`REPLACEX`)**

## Example: ##

```
Set,%a%,BROWN
Set,%b%,yellow
Set,%source%,"The quick brown fox jumps over the lazy dog"
StrFormat,REPLACE,%source%,%a%,%b%,%VarResult%
StrFormat,REPLACEX,%source%,%a%,%b%,%VarResultSens%
```
In the first example we replace (case insensitive) brown by yellow resulting in new string being written to %VarResult%:
```
The quick yellow fox jumps over the lazy dog
```
In the second command, there is nothing replaced, because uppercase brown is not found, resulting the original string being placed into %VarResultSens%: - i.e.
```
The quick brown fox jumps over the lazy dog
```

<br>
<br>
<hr />