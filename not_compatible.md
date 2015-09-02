# Not\_Compatible `[`Removed as of CAPI 25rev61`]` #

Generate an error message if the script is used in a none compatible project.

## Syntax ##
```
Not_Compatible,OSType
```
## Parameters ##
|1|OSType|Project target type for which the current script is not compatible|
|:|:-----|:-----------------------------------------------------------------|
| | **LiveXP** |Script is not compatible with the LiveXP project                  |
| | **VistaPE** |Script is not compatible with the VistaPE project                 |
| | **Win7PE** |Script is not compatible with the Win7PE project                  |

## Example ##
This will generate an error message at build time if the script is built in the LiveXP project.
```
Not_Compatible,LiveXP
```