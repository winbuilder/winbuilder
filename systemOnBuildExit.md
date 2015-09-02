# System,OnBuildExit #
Specify the command to be executed after the last script in the project has been processed.
## Syntax ##
```
System,OnBuildEXIT,Command
```
This statement can be written anywhere inside the running part of any script. The last executed statement is the one that will be used when the last script has completed.
This means different scripts can define different actions or deactivate this process (with `System,ONBUILDEXIT` - i.e. no command specified).

For more examples, see [System,ONSCRIPTEXIT](systemONSCRIPTEXIT.md), which has a similar function.