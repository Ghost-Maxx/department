#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char str[100];
    int i, v = 0, c = 0;

    printf("Enter a string: ");
    fgets(str, 100, stdin);   //--> takng string as input using fget so space too count

    int len = strlen(str); 

    for (i = 0; i < len; i++) {
        char ch = tolower(str[i]);  //--> to convert into l0wer case

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            v++;
        } else if (isalpha(ch)) { //--> by using isalpha we are chekcing input string must be in char
            c++;
        }
    }

    printf("Vowels: %d\n", v);
    printf("Consonants: %d\n", c);

    return 0;
}