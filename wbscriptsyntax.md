# Syntax Rules and Escape Characters #

First some rules:
  1. WinBuilder Script Line Parameters are separated by a comma. If a comma is inside an argument, it must be 'escaped' by `#$c`
  1. Besides some special cases (e.g. parameters in [ShellExecute](shellexecute.md)) generally enclosing quotes are not needed.
  1. Enclosing quotes MUST be used if the WinBuilder Script Line Parameters contain spaces.

Since there are times when the comma or quote need to be used inside a string or parameter, WinBuilder has a character escape mechanisim. The following are the available escape characters:
  * `#$c` - Comma (`,`)
  * `#$p` - Percent (`%`)
  * `#$q` - Double quotes (`"`)
  * `#$s` - Space (` `)
  * `#$x` - Newline (`<cr/lf>`)
  * `#$z` - String separator (i.e. the unicode 0 which is only used by the [RegWriteBin](regwritebin.md) command )

Here is a short explanation of what can be done and what cannot be done and when the escaped characters should be used.
  * If the spaces are replaced by the escape #$s, the enclosing quotes should be omitted.
  * In most cases user violation of the rules are accepted by WinBuilder and processed as assumed. E.g. unnecessary enclosing quotes or a comma inside an item enclosed by quotes.

But sometimes that can bring unexpected results. Let me give an Example:

**`Item1,item2`** is understood as two items, separated by the comma.  **`Item1#$citem2`** and **`"Item1,item2"`** are both correctly written as **ONE** item with the comma inside.

Now the problem occurs when it is not possible to determine what is meant.  For example, **`Set,%Var%,"Item1","item2"`** cannot be understood uniquely by WinBuilder?. Let's exchange the English understandable words by the character 'x'

**`"xxxxx","xxxxx"`**

  * Are there two quote-enclosed xxxxx, separated by a comma?
  * Or is there on long string of 10 xes, interrupted by a nested quote pair containing a comma?
  * Or is there on long string of 10 xes, interrupted by a nested quote pair 'escaping' a comma? > Set,%var%,xxxxx#$cxxxxx

You see how important it is to follow the rules, even if WinBuilder understands most violations correctly.