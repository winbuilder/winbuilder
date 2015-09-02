# StrFormat,`[`CHARTOOEM / OEMTOCHAR`]` #
## Syntax ##
```
StrFormat,<Action>,<%string%>,<%VarResult%>
```
These functions convert between the ANSI charset and the DOS charset, and are useful when dealing with special characters like "umlauts" and other similar markings. Action can be either
  * `CharToOEM` or
  * `OemToChar`