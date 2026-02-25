#Code / Program to check palindrom string or NOT
def is_palindrome(s):
    if s == s[-1::-1]:
        return "Palindrome"
    else:
        return "Not a Palindrome"

string = input("Enter a string: ")
print(is_palindrome(string))

