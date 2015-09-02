## ExistRegMulti ##
The command checks for the existence of a substring in a multiple string

### Syntax ###
```
If,ExistRegMulti,<HKEY>,<Section>,<Key>,<SubString>,<Command>
```

### Example: ###
```
If,EXISTREGMULTI,HKLM,SYSTEM\ControlSet001\Control\ServiceGroupOrder,List,"FSFilter Infrastructure",Echo,YES
```

### Note ###
This command was added in Winbuilder 80; It will not work with older versions.