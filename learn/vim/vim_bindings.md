H - Left 

J - down

K - Up

L - Right 

G - go to the bottom of the file 

gg - top of the file

{  } - move up or down a block of code 

number + hjkl - move that many numbers 

dd - delete a line 

u - undo something ( can unravel )

^R - redo

. - do the last/ prev binding again

yy - copies code to clipboard 

p - pastes it one under 

P - to paste it one up 

o - creates a \n and puts you in insert mode 

O - \n above and puts you in insert mode 

w - to move forward a word 

b - move back a word 

:{number} to reach that specific line NOTE- NOT RELATIVE !

0 - to the beginning of the line 

^ - to the beginning of the line where there is a word 

0w - emulates the behavior of ^ | an alternative*

$ - takes to the endl 

W | B - stronger w n b 

f + ( char eg- a,b,c,1,2,3,!,$,....... ) - takes you on that char 

t + ( char eg- a,b,c,1,2,3,!,$,....... ) - takes you one left to that char

% - toggle b/w {  } or (  ) or [  ]  suppose in code we want to shift from the start { to the  } curly brace 

cw - change word , this delete the word you're on and puts you on insert mode 

dw - delete words without insert mode 

D - delete the rest of the line from where it stands , relative 

C - is like D but puts you in insert mode 

dt + char - deletes till the char you specify 

* - toggle b/w the word which exists in the file , basically ctrl + f on steroids 

x - deletes a char 

A - goes to last part of the line -1

a - opens insert mode and shifts the cursor 

I - insert mode at the beginning of the line 