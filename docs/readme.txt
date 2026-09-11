Prithee - by Zaid Al Falah

Program Description (as provided by the homework doc)
/////////////////////////////////////////////////////

Given the sonnet below, write a program that prints out the sonnet and stops at a random word, 
printing a series of underscores instead, and not printing the rest of the sonnet. 
The program should prompt the user for the next word. Once the user responds, the program should indicate 
correct or error, and restart the sonnet, stopping at a different word. The program continues this 
prompting until the user gets three words correct or three words incorrect. 

Shall I compare thee to a summer’s day?
Thou art more lovely and more temperate:
Rough winds do shake the darling buds of May,
And summer’s lease hath all too short a date;
Sometime too hot the eye of heaven shines,
And often is his gold complexion dimm’d;
And every fair from fair sometime declines,
By chance or nature’s changing course untrimm'd;
But thy eternal summer shall not fade,
Nor lose possession of that fair thou ow’st;
Nor shall death brag thou wander’st in his shade,
When in eternal lines to time thou grow’st:
   So long as men can breathe or eyes can see,
   So long lives this, and this gives life to thee.

/////////////////////////////////////////////////////

The program is run without command-line arguments, and will prompt
the user for a guess, which must match the missing word exactly (case
sensitive). Case sensitivity is by design.

/////////////////////////////////////////////////////

The object structure is as follows
Main:
main() : void
prithee() : bool

/////////////////////////////////////////////////////

It is worth noting that the prithee() function returns a boolean corresponding to the success of the user in winning
the game (true = a win, false = a loss).
