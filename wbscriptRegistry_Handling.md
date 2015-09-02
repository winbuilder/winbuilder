# Registry Handling #

These commands are written to write and read values from the local registry on your windows machine. You can also load the hives from the projects being built at any given time.

These registry operations are valid for any Windows Platform, you should however note that Vista (and later versions of windows) restricts the specific operation to load/unload hives - it is necessary to disable the UAC (User Account Control) before running projects that need this support.

List of available functions
  * [RegWrite](regwrite.md)
  * [RegRead](regread.md)
  * [RegDelete](regdelete.md)
  * [RegHiveLoad](reghiveload.md)
  * [RegHiveUnload](reghiveunload.md)
  * [RegImport](regimport.md)
  * [RegWriteBin](regwritebin.md)
  * [RegReadBin](regreadbin.md)
  * [RegMulti](regmulti.md)