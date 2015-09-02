# System,GetEnv #
Gets the value of a **system** Environment(a.k.a.ENV) variable -
## Syntax ##
```
System,GETENV,<EnvironmentVariable>,%var%
```

## Remarks ##
The name of the `<EnvironmentVariable>` _**must not**_ be enclosed in percent signs (`%`).

## Example: ##
```
System,GETENV,Temp,%var%
Echo,%var%
```