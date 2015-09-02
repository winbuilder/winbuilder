# PackParam #

Packs parameters into a user defined variable, each enclosed in quotes into a comma separated list.

## Syntax ##
```
PackParam,Start,%Var%[,%Num%]
```
This command packs all parameters beginning with the parameter in position `<start>` into %var%, each enclosed in quotes, and separated by comma, like:
```
"param4","param5",...
```

PackParam optionally has an additional argument ( **%num%** ). It writes the number of arguments into the variable supplied. **%Num%** is always the number of ALL arguments, independent from where the packing process has started. The parameters can be declared as "OUT" variables, that means when returning from "Run", they will be updated with the actual value.