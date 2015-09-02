# RegMulti #

Modify a multi-string registry entry.

## Syntax ##
```
RegMulti,<HKEY>,<Section>,<Key>,<Action>,[<Other Parameters>]
```

Based on the action specified, you may require one or more additional parameters

**HKEY** is the "Hive Key" where the key is to be placed. These hives are files that are loaded by your machine when booting and compose the registry structure. By default, most scripts use HKLM as the work hive.  Valid HKEY values are:
  * HKLM
  * HKCU
  * HKCR
  * HKEY\_USERS
  * HKEY\_CURRENT\_CONFIG

**Section** is the complete path to the section where the key is to be read from. **Note: The Section (i.e path to the Key) specified here _MUST_ exist or an error will occur.**<sup>1</sup>

**Key** is the name of the 'child key' in that section to be read. **Note: The KEY specified here _MUST_ exist or an error will occur.**<sup>1</sup>

**Action** may be one of the following keywords:
  * APPEND - Writes a string at the end of the specified key.
```
RegMulti,<HKEY>,<Section>,<Key>,APPEND,<String>
```

  * PREPEND - Writes a string at the start of the specified key.
```
RegMulti,<HKEY>,<Section>,<Key>,PREPEND,<String>
```

  * BEFORE - Writes a string before the matching sub-string.
```
RegMulti,<HKEY>,<Section>,<Key>,BEFORE,<SubString>,<String>
```

  * BEHIND - Writes a string after the matchings sub-string.
```
RegMulti,<HKEY>,<Section>,<Key>,BEHIND,<SubString>,<String>
```

  * PLACE - Writes a string at the specified index. If the string already exists in the current value, a warning is written and the current value is left unchanged.
```
RegMulti,<HKEY>,<Section>,<Key>,PLACE,<Index>,<String>
```

  * DELETE - Removes the specified substring.
```
RegMulti,<HKEY>,<Section>,<Key>,DELETE,<SubString>
```

  * INDEX - Queries the index of the specified string. If the substring does not exist, the returned value is 0.
```
RegMulti,<HKEY>,<Section>,<Key>,INDEX,<SubString>,%Index%
```

<sup>1</sup> For more information on this and example, see [this post](http://reboot.pro/15891/).