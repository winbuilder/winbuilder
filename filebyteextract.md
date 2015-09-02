# FileByteExtract #

Extract binary data from a file matching the search criteria for a specific byte signature.

## Syntax ##
```
FileByteExtract,<FilesToSearch>,<OutputFile>,<ByteSignature>,<BytesLength> 
```

## Remarks ##
Byte signatures are specified in groups of two digits that are expressed in hexadecimal format. Possible value range from combinations starting at 00 and ending at FF

If this byte sequence is found, then it will copy a specific number of bytes and save them as a new file.

The bytes that compose the signature are also the header bytes on the new file.

This command was originally designed to find a byte sequence inside some system files that contained resources. Please look in the forums for practical examples of usage.

## Example: ##
In this example, if a match is found then a new file will be created with the size specified in BytesLength
```
FileByteExtract,c:\MyPath\*.*,c:\MyPath\NewFile.bin,001122334455,1440000
```