# StrFormat,`[`INC / DEC / MULT / DIV`]` #
## Syntax ##
```
StrFormat,<Action>,<%var%>,<n>
```
These commands are used to modify the value of a given number based on the arithmetic operation you select. It's also important to specify the value `<n>` to use to perform this operation.

  * **Note: Only positive values allowed as the value of `<n>`** - in other words, you can't decrement by a negative value - use increment instead!

The result is written back to the variable (%var%).
  * **Note: While negative numbers are supported by this variable value, they can not be used as constant arguments to the command (as mentioned above).**

List of possible Action values
  * inc - increase (%var% + n)
  * dec - decrease (%var% - n)
  * mult - multiply (%var%  `*` n )
  * div - division (%var% / n)
where **n** is the last parameter on this command and should always be a numeric value.

## Example: ##
In this example we have a variable called `%LoopAgain%` with a value of 10. Once we increase the value of this value with the last parameter of this command we will get the same variable `%LoopAgain%` with a value of 15. This same example applies for all other available actions.
```
StrFormat,Inc,%LoopAgain%,5
```