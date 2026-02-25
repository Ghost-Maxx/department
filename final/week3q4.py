sts = input("Enter the str for iput")
s = sts.lower()
v = {'a', 'e', 'i', 'o', 'u'}
c = sum(1 for char in s if char in v)
print("number of  vowels in str -->",c)