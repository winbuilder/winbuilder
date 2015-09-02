# Compatibility #

  * WinBuilder.exe is supported on Most modern windows operating systems. It may use Internet Explorer to access help pages and use the Web tab.

  * It won't require any .NET framework or any similar component. It is mostly a standalone application without special external dependencies. (you can even disable network access).

  * WinBuilder itself can run quite happily both on FAT32 or NTFS partitions BUT certain projects require a NFTS filesystem. Be sure to check the requirements of the project that you are using!

  * On Vista and later versions,  it will be necessary (in most cases) to disable UAC (User Account Control) to allow creation of the needed registry hives when building a new boot disk.