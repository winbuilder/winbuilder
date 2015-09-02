# StrFormat,`[`LTRIM / RTRIM / CTRIM / NTRIM`]` #
## Syntax ##
```
StrFormat,<Action>,<%string%>,<CharsToTrim>,<%var%>
```
These commands will trim off characters from the specified sting (or variable that contains a string) and out the result into the %var% specified. The action values are:
  * LTrim - trim from the left
  * RTrim - trim from the right
  * CTrim - trim a matching character
  * NTrim - trim any numbers from the **end** of the string

## Example: ##
In this example we have a given string tomorrow and we trim 3 chars from the left. The remaining rest is filled into %var% with value orrow.
The same syntax applies for StrFormat,RTRIM trimming 3 chars from the right resulting as tomor.
```
Set,%string%,tomorrow
StrFormat,LTRIM,%string%,3,%var%
```

---


CTRIM is used to trim the first and/or the last char of a given string, **_BUT ONLY_ if the char to trim is matching with the first and/or the last char of the string.** If the char does not exist at the front or end of the string, it remains unchanged.

In this example we trim the backslash of given string `Programs\` with the result `Programs` being written into %var%.
```
Set,%string%,Programs\
StrFormat,CTRIM,%string%,\,%var%
```

---

NTRIM is used to trim numbers from the end of a string. For example, it can be used to extract the class name from interface components.
Here %var% will contain: `pTextBox` after this code is executed.
```
StrFormat,NTRIM,pTextBox12,%var%
```