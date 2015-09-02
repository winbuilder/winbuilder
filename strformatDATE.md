# StrFormat,DATE #
## Syntax ##
```
StrFormat,Date,<%var%>,<yyyy-mmm-dd hh:nn am/pm> 
```

This option is used to retrieve the current hour and date and output it to a variable using the format you prefer.
  * yyyy - year in 4 digit
  * mmm - 3 initial letters of the month
  * dd - day number
  * hh - hour number
  * nn - minute number
  * am/pm indicates to use 12 hours cycle instead of 24 hours
The last parameter will define the way these values will be written to your variable. You can omit values that aren't needed and even add custom text inside.

## Example: ##
In this example %myVar% will output the current year, month and day formatted as specified (eg. 2007-jun-07)
```
StrFormat,date,%myVar%,yyyy-mmm-dd
```