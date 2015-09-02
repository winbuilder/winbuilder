# Ping #

Ping will test if a given IP is valid and run a command if this test is true.

## Syntax ##
```
If,ping,<xxx.xxx.xxx.xxx>,<Command> 
```
## Example: ##
In this given example we are pinging a machine on the network. If this condition is true then `FileCreateBlank,c:\myFile.txt` will be executed. WB078 added the ability to use a hosts domain name in addition to the IP address.
```
If,ping,10.111.8.1,FileCreateBlank,c:\myFile.txt
If,ping,winbuilder.net,FileCreateBlank,c:\myFile.txt
```