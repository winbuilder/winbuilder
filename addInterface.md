# AddInterface #


Allows interface components from another interface to be accessed locally in a script

## Syntax ##
```
AddInterface,<Script>[,<Interface>],<prefix>
```

The optional `<Interface>` is used to read alternative interfaces, e.g. Interface-Language? The default value is to use the standard interface ([Interface](Interface.md)).

The prefix is used to distinguish to already existing interface values of the same name. The generated variables can be used as %`<prefix>`_<original name>%. If prefix is omitted, also the underline in the name of the generated variables is omitted._

### Example: ###
```
AddInterface,%ScriptFile%,Interface-German,DE
```

Values of the German interface are now accessible like
```
Echo,%DE_pTextBox1%
```

if instead you used
```
AddInterface,%ScriptFile%,Interface-German,
```

Values of the German interface are now accessible like
```
Echo,%pTextBox1%
```

### Note: ###
This command was added in Winbuilder 80; It will not work with older versions.