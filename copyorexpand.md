# CopyOrExpand #

Copy files from Install CD's where a file can be present either in normal or compressed format.

## Syntax ##
```
CopyOrExpand,<FileToCopyOrExpand>,<DestinationFolderOrFilename>[,PRESERVE, NOWARN]
```

## Remarks ##
Compressed files often use the cabinet archiving method and usually have an identifiable character _as the last character of their extensions. (e.g. myFile.Tx`_` ). Windows XP often uses this method to compress files on the install CD._

  * If the destination file already exists, CopyOrExpand gives a warning in the log, and will overwrite the existing file.
  * If the optional **PRESERVE** parameter added, CopyOrExpand _of a single file_ will not overwrite an existing file _**however**_ a warning is still given.
  * The warning can be suppressed by an additional parameter **NOWARN**.
  * The parameters **PRESERVE**, and **NOWARN** can be used simultaneously. The order does not matter.

**`DestinationFolderOrFilename`** means that you can either specify a folder where this file will be placed with the original (expanded) filename or new filename that you prefer.

## Example ##
In this example CopyOrExpand will first try to find a file `c:\MyPath\myTextFile.txt` and if it is not found then it will look for `c:\MyPath\myTextFile.tx_` and expand this file if successfully found.
```
CopyOrExpand,c:\MyPath\myTextFile.txt,c:\MyPath\myNewerTextFile.txt
```