# Known issues with Winbuilder.exe #
This is a list of issues/quirks/oddities with Winbuilder.exe that cannot be fixed or are difficult to fix at the present time. <br />**Please don't post bug reports about these items.**


# Known issues: #


---

## 1 ##

**Issue:** The code editor has a column limit of 1024 characters. [[Bug Report](http://reboot.pro/15569/page__pid__138997#entry138997)]


**Workaround:** the Winbuilder engine itself is quite happy to read beyond the limit when processing the script so processing is not affected. One must just use another text editor such as notepad to modify the script.


**Remarks:** This limit will be raised to 10240 in the next release (WB83-WB84)


---

## 2 ##

**Issue:** Bug with [GetParam](getparam.md) [[Forum Topic](http://reboot.pro/15223/page__view__findpost__p__135483)]

**Workaround:** Use string format
```
[process]
Run,%ScriptFile%,Pack,1,2,something with space,4,5,6,7,8,9,10,11,12,13
[pack]
PackParam,1,%packed%
GetParam,3,%Value%
Echo,%Value%
StrFormat,SPLIT,%packed%,#$c,3,%Value%
Echo,%Value%
```

**Remarks:** Fixed in a future WB release (WB83-WB84)

---

## 3 ##

**Issue:** Sometimes text labels do not show up or check boxes disappear when using themes other than "Windows Classic" [[Development Topic](http://reboot.pro/14856/page__hl__%2Bdisable+%2Bvisual+%2Bthemes__fromsearch__1)]

**Workaround:** Use the windows classic them or disable Visual Styles in the Compatibility options for Winbuilder.exe

**Remarks:** This is a known issue with the current Delphi 7 compiler.

---

## 4 ##

**Issue:** When using [RegImport](regimport.md) reg binary values are written incorrectly. [[Bug Report](http://reboot.pro/15828/page__pid__141850#entry141850)]

**Workaround:** Convert the .reg file to WB script using [Reg2Wbs](http://reboot.pro/files/file/48-reg2wbs/) or [RegCPE](http://theoven.org/index.php?topic=106.0). You can also use shellexecute to merge the .reg into the hive `ShellExecute,hide,regedit.exe,"/s #$qMyRegFile.reg#$q"`

**Remarks:** This is an issue with the Delphi7 function
`TRegFile.LoadFromFile(<filepath>);` and cannot be corrected without updating the compiler to a newer version ($$$).

---
