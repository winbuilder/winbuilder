# ReadENV #

Read all settings from project.ini into local script variables of the same name as the setting. Optionally you may specify setting to load from project.ini into a local script variable.

## Syntax ##
```
ReadEnv,[GlobalSetting],[LocalVariable]
```

## Parameters ##
|1|GlobalSetting|Optionally specifies the name of a setting in project.ini to load.|
|:|:------------|:-----------------------------------------------------------------|
|2|LocalVariable|Only used if the first parameter is specified and optionally allows the name of the local script variable into which the setting is to be loaded to be specified. By default the local variable name will be the same as the setting name. |

## Example ##
The following loads all project settings, loads the Shell setting into a variable named %Shell%, loads the Shell setting into a variable named %ShellName%.
```
ReadENV
ReadENV,Shell
ReadEnv,ShellName
```