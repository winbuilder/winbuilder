# INI Manipulation #

This category contains commands that were created to work with INI based text files. INI files group information using a few rules, it is also very easy to understand and edit when needed.

We use INI files to exchange information between scripts or store data whenever needed. In most cases INI language files use extension .ini - but our commands are not limited to just this type of extension and can be used on any text file that uses a INI derivated language like .script language.

Quick explaintion of some INI concepts:
  * A group of data (section) is always contained between `[]` (e.g. `[MySection]` ) and will only finish whenever another section is found or when the file has no more lines to read.
  * Each entry has a Title and is followed by it's respective data. Both are separated by an equal sign (e.g. Color=Blue)

Available INI functions
  * [IniWrite](iniwrite.md)
  * [IniRead](iniread.md)
  * [IniDelete](inidelete.md)
  * [IniAddSection](iniaddsection.md)
  * [IniDeleteSection](inideletesection.md)
  * [IniWriteTextLine](iniwritetextline.md)
  * [IniMerge](inimerge.md)