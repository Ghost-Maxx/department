import numpy as np

a = np.array([[1, 20, 30],
              [4, 9, 23],
              [43, 21, 4]])

b = np.array([[1, 2, 3],
              [4, 1, 5],
              [4, 1, 2]])

print("Array A:\n", a)
print("\nArray B:\n", b)

print("\nAddition (A + B):\n", a + b)
print("\nSubtraction (A - B):\n", a - b)
print("\nMultiplication (A * B):\n", a * b)

division = np.round(a / b, 2)
print("\nDivision (A / B):\n", division)

print("\nPower (A ** B):\n", pow(a,b))
