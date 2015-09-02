# Getparam #

Writes the parameter at the given index position into **%var%**. This is needed when dealing with more than 9 passed parameters using the [Run or Exec](run.md) commands.

## Syntax ##
```
GetParam,Index,%Var%
```

## Parameters ##
|1|Index|The position of the passed argument to read|
|:|:----|:------------------------------------------|
|2|%Variable%|The Variable to write the value to         |

## Remarks ##
Parameters are accessible by only a single digit following the "#" (hash mark) character.  Given the "fixed formatting", a different process was needed to access the values of any greater parameter.

This is also an easy way to make script files more readable, since it allows you to assign a more meaningful variable name to the parameters being passed into the section.

## Example: ##
When running the command:
```
Run,%ScriptFile%,Animals,Cow,Dog,Cat,Goat,Donkey,Wombat,Turkey,Horse,Fox,Hippopotamus,Rino

[Animals]
GetParam,10,%aBigAnimal%
Echo,%aBigAnimal%
```
The value of **%aBigAnimal%** will be Hippopotamus