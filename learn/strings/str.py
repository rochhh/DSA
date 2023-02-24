def flo_rida( text ):

    ''' 
     Because Java wants to be a bitch about Strings 
    '''

    new_text = ""
    for i in text:
        i = ord(i) + 32
        new_text = new_text + chr(i)    
    return new_text

def word_counter ( text):

    word = 1

    for i in range(len(text)):
        if text[i] == ' ' & text[i-1] != '':
            word = word + 1
    return word


def vowel_counter( text ):

    count = 0
    for i in range ( len(text) ):

        if  text[i] == 'a' | text[i] == 'e' | text[i] == 'i' | text[i] == 'o' | text[i] == 'u':
            count = count +1
        
    return count


str = "welcome Bro"

print ( word_counter(str) ) 
