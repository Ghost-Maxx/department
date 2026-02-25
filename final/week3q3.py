nth = int(input("Enter the nth term for fibobachi series generation:" ))
n1 , n2 = 0, 1
if nth<=0:
    print("Enter the positive number plssss")
print("Fibonachi series :", n1, n2 , end=" ")
for i in range(2, nth):
    n3 = n1 + n2
    n1 = n2 
    n2 = n3
    print(n3, end=" ")
        
    
print()