class Student:

    def __init__(self, name, id):
        self.name = name
        self.id = id


class Printer:

    def print_detail(s):
        print("Name of the studet:", s.name)
        print("ID of the student:", s.id)


class Task01:

    s1 = Student("Bob", "1")
    s2 = Student("Tom", "2")
    s3 = Student('Jack', '3')
    s4 = Student("Jill", '4')

    Printer.print_detail(s1)
    Printer.print_detail(s2)
    Printer.print_detail(s3)
    Printer.print_detail(s4)
