# WebGet #

## Syntax ##
```
WebGet,<FileToDownload>,<FileOnDisk>[,MD5][,Ask][,Timeout]]
```

Use this function to download files from a network server to the local machine.
  * It is assumed that both machines (local and remote) are prepared for this operation.
  * No checks are done to ensure that the local machine is online or that is has enough disk space to download the file.
  * The remote server must also be accessible and the file must be available for download.
  * Only direct download links are accepted, dynamic internet pages are not valid.

MD5 check is an additional parameter that can be added to ensure that your file matches a security check based on the MD5 hash calculation.
  * This is an optional parameter, only needed for cases when it is important to only accept a file that passes on this download integrity test.
  * If a file fails this test it won't be copied over to the final destination as FileOnDisk.

The optional parameters of **`Ask`** and **`Timeout`** are only used _**if enabled**_, and if enabled, will display a question dialog box, and wait for a response.  This can be used to let the user skip over a download operation.
  * To use this feature, the line "Ask before WebGet" in the Winbuilder Tab TOOLS\OPTIONS has to be checked.
  * To use optional timeout, the line "Use Timeout when asking" in the Winbuilder Tab TOOLS\OPTIONS has to be checked.

If the target filename folder doesn't exist, it will be created. If a file already exists it will be overwritten (read [WebGetIfnotExist](webgetifnotexist.md) for alternative behavior)

## Example: ##

In this example we download the file iview423.zip from server foo.com to the folder `c:\IrfanView\iview423.zip`
  * only if MD5sum is fd490d07cc236cb44ef29abfd9daf13d
  * with a question dialog's text string displaying 'ZIP-file'
  * and automatically accept the dialog (i.e. timeout) after 10 seconds

```
WebGet,http://foo.com/iview423.zip,c:\IrfanView\iview423.zip,fd490d07cc236cb44ef29abfd9daf13d,ZIP-file,10
```