# RunFromRam #

Force the current script program to run directly from memory, either from a RAM drive or from a .wim file. This allows the program directory to be writable if your booting from a CD/DVD.

## Syntax ##
```
RunFromRam,[True]
```

## Parameters ##
|1|True|Optional parameter used to override the project build model so that the programs for the current script are run from the boot ram drive. If this parameter is not specified the default project build model is used. In the vista / win7 versions of PE this forces the program to be in the boot.wim.|
|:|:---|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

## Remarks ##
In general there are 2 build models:
  * Boot the windows directory from the boot media
  * Boot the windows directory from a ram drive. This option gives better performance but uses much more ram.

See also [RunFromCD](runfromcd.md)

## Example ##
```
RunFromRam,True
```