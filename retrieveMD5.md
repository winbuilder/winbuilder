# Retrieve,MD5 #

Calculate the MD5 hash of a file.

## Syntax ##
```
Retrieve,MD5,<Filename>,<%var%> 
```

## Parameters ##
|1|Filename|The full path of the file to hash|
|:|:-------|:--------------------------------|
|2|%var%   |a user defined variable used to store the calculated hash.|

## Remarks ##
MD5 is a way to calculate a number known as a 'hash' or 'checksum' that is based on the content of a file.

It is most often used as a safety check to ensure that files are complete and unmodified when they are downloaded from a server.

## Example: ##
This function will write the value of the MD5 result on %var%, you can compare against a security value written elsewhere to prove that your file is intact.
```
Retrieve,MD5,c:\MyText.txt,%var%
```