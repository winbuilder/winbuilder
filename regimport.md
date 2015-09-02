# RegImport #

This command will import an external registry file (`*.reg`) **_to your local registry system_**.

## Syntax ##
```
RegImport,<RegFileToImport> 
```

# Warning #
  1. **As stated above, this adds information to the CURRENT systems registry.  You should be careful and use this only with sections mounted using the proper commands to mount hives otherwise you might corrupt the current systems registry!**
  1. **In addition, there is a known issue with binary data.  See [this posting](http://reboot.pro/15828/) on reboot.pro**

## Example: ##
```
RegImport,c:\myFile.reg 
```