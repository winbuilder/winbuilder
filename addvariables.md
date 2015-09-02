# AddVariables #

Import the contents of the `[Variables]` section from another script into the current script.

## Syntax ##
```
AddVariables,<%ScriptFile%>,<Section>,[GLOBAL]
```

## Tips ##
  * When a script is started it will read the `[variables]` section, but using this command during the script processing, you can repeat this procedure and read the variables found inside any section you wish to use.
  * Use %scriptfile% to read a section from the same file from where this command is called.
  * Older variables with the same designation are overwritten with newer values.
  * If the optional parameter ( **`GLOBAL`**) is specified, the additional variables will be known through the complete build.

## Example: ##
```
AddVariables,%scriptFile%,AlternativeVariables 
```