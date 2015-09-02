# Visible #

Set the visibility of a UI element.

## Syntax ##
```
Visible,<variable to change>,True/False[,Permanent]
```

This is a more simplistic command than fully controlling all the parameters of the UI, but can be useful to customize the UI based on the state of a checkbox or a radio button setting. The optional parameter sets this new value into the file, so it will be permanent.

## Example ##
```
[Process_Visible]
Echo,"Please Wait"
// When we change state of the scroll box, then change 
// visibility of label and folder box...
If,%ProjectSelectScrollBox%,Equal,"Visible - True",Begin
  Set,%Import_Custom_State%,True,Permanent
  Visible,%Import_Custom_Dir%,True,Permanent
  Visible,%Custom_Label%,True,Permanent
End
Else,Begin
  Set,%Import_Custom_State%,False,Permanent
  Visible,%Import_Custom_Dir%,False,Permanent
  Visible,%Custom_Label%,False,Permanent
End
```