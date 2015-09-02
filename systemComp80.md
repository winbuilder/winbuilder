# System,Comp80 #

To improve processing speed, the way variables are treated internally was changed. In some situations, this may cause incompatible results.  This setting allows the project to force compatible processing to occur.
## Syntax ##
```
System,Comp80,{On|Off}
```

## Remarks ##
  * By using `System,Comp80,OFF` you can make the current WinBuilder script processing (mostly) compatible to the processing of WinBuilder 080.
  * When compatibility is set to off, scripts are processed 2 to 3 times faster.
  * **By default the compatibility is switched off (starting with version 082).**

## Example: ##
In this example, we want to go back to the slower, but compatible way of processing variables.
```
System,Comp80,On
```