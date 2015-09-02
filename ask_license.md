# Ask\_License #

Prompt the user to accept a license agreement before continuing.

## Syntax ##
```
Ask_License,FullFilename,ID,SectionToRunBeforeExit
```

## Parameters ##
|1|FullFileName|Path to license file|
|:|:-----------|:-------------------|
|2|ID          |an identifier, defined by script developer to identify the license object. It must be unique for the script and should be simple, maybe something along the lines of 'Lic'.|
|3|SectionToRunBeforeExit|Section to run in %ScriptFile% (if License not found or not accepted) before exiting|

## Remarks ##
What happens:
  * If the license file does not exist, the script is exited.
  * If the license file exists, it is shown and the user is asked for agreement.
  * If the user does not agree, then the script is exited.
  * If the user agrees, then in %ScriptFile% a marker using the **ID** specified is set into the `[Licenses]` section, and script processing continues. See the example below.

On the next build, this marker is read and the license agreement window not shown again.

## Example ##
This is how you show the license file:
```
[process]
// Unpack just the file LicenseAgreement.txt from section Folder to %Target_Prog%\%ProgramFolder%\
Unpack,Folder,,LicenseAgreement.txt
Ask_License,%Target_Prog%\%ProgramFolder%\LicenseAgreement.txt,Lic,Reject_Licence

[Reject_Licence]
// If Licence not accepted delete %Target_Prog%\%ProgramFolder% 
DirDelete,%Target_Prog%\%ProgramFolder%
```

After the script is first run and the license is accepted the following will be appended to the script so that the next time the script is run the license will not be shown. Obviously if you redistribute your script this section must be removed.
```
[Licenses]
Lic=True
```