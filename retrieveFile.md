# Retrieve,File #

Display a dialog box asking the user to select a file.

## Syntax ##
```
Retrieve,File,<Filename>,<%var%> 
```

## Parameters ##
|1|FileName|The initially selected folder and filter|
|:|:-------|:---------------------------------------|
|2|%var%   |A user defined variable that will contain the full path of the selected file|

## Example: ##
> This example will open a dialog box asking the user to select a file. This box will start in `c:\` and will only display files that match the filter criteria which is `*.txt` in this example. Once a file is selected, the %var% will contain the full filename of this selected file.
```
Retrieve,File,c:\*.txt,%var%
```