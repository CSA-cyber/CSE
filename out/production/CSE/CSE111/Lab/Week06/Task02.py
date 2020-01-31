class Cat:

    def __init__(self, color= 'White', action = 'sitting'):
        self.__color = color
        self.__action = action

    def print_cat(self):

        print(self.__color+" cat is "+self.__action)

    def change_color(self, color):

        self.__color=color


class Test:

    c1 = Cat()
    c2 = Cat("Black")
    c3 = Cat("Brown",  "jumping")
    c4 = Cat('Red', 'purring')

    c1.print_cat()
    c2.print_cat()
    c3.print_cat()
    c4.print_cat()

    c1.change_color("Blue")
    c3.change_color("Purple")

    c1.print_cat()
    c3.print_cat()