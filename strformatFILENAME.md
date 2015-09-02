# StrFormat,`[`FILENAME / PATH / EXT`]` #
## Syntax ##
```
StrFormat,<Action>,<Filename>,<%VarResult%> 
```

These Commands are used to extract specific information from the given text related to filenames.

List of possible Action values
  * Filename - returns the filename portion (no path)
  * Path - gives the path of the given text
  * Ext - outputs only the extension of the filename

## Example: ##
```
Set,%DownloadURL1%,http://live.sysinternals.com/Bginfo.exe
StrFormat,PATH,%DownloadURL1%,%var1%
StrFormat,FILENAME,%DownloadURL1%,%var2%
StrFormat,EXT,%DownloadURL1%,%var3%
```
which results in
```
%var1%=http://live.sysinternals.com/
%var2%=Bginfo.exe
%var3%=.exe 
```

<br>
<br>
<hr />