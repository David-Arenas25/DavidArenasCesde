def menu():
    menu = int(input("que desea hacer 1.suma 2.resta 3.multiplicacion 4.division"))
    num1 = int(input("ingrese el primer numero"))
    num2 = int(input("ingrese el segundo numero"))

    if menu == 1:
        suma(num1, num2)
    elif menu == 2:
        resta(num1, num2)
    elif menu == 3:
        multiplicacion(num1, num2)
    elif menu == 4:
        division(num1, num2)

    pass

def suma(num1, num2):
    resultado = num1 + num2
    print(resultado)


def multiplicacion(num1, num2):
    resultado = num2 * num2
    print(resultado)


def resta(num1, num2):
    resultado = num1 - num2
    print(resultado)


def division(num1, num2):
    try:
        num1 / num2
    except ZeroDivisionError as Error:
        print("no se puede dividir por 0")




if __name__ == '__main__':
    menu()
