n1 = int(input("Enter the first number: "))
n2 = int(input("Enter the second number: "))
n3 = int(input("Enter the 3rd number: "))

#condition to check
if (n1>n2 and n1 > n3):
    print(f"{n1} is largest among three number")
elif (n2 > n1 and n2> n3):
    print(f"{n2} is largest among three number")
else:
    print(f"{n3} is largest among three numbers")
         