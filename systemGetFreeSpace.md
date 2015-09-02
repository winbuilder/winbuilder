# System,GetFreeSpace #

Returns the free space of Path's drive in megabytes

## Syntax ##
```
System,GETFREESPACE,<Path>,<%var%>
```
This command computes the free disk space on the drive specifice, and puts result into %var%. Note: megaybtes = free bytes / (1024 **1024)**

### Example: ###
```
System,GETFREESPACE,%BaseDir%,%var%
System,GETFREESPACE,C:,%var%
System,GETFREESPACE,C,%var% Result:
```