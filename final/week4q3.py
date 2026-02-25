lisss = {}
students = {
    "Asjad": 82,
    "neta": 74,
    "Shurti": 90,
    "Arif": 68,
    "Naveel": 78,
    "Hamzah": 69,
    "Asim": 98,
    "Bhalo": 1
}

print("Students scoring above 75:")
for name, marks in students.items():
    if marks > 75:
        print(name, ":", marks)
print("\nStudents scoring below 75: ")
for name, marks in students.items():
    if marks < 75:
        print(name, ":", marks)