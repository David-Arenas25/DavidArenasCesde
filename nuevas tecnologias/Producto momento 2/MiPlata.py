from colorama import Fore, Back, Style
import random
from datetime import datetime


registerList = []
register = {}
def operaciones():
    fecha = datetime.now()
    opc = 0
    listaConsig = []
    listaRetiros = []

    while opc != 6:
        print(f"""
        ╔═══════════════════════════════════════════╗
        ║ **Operaciones Bancarias**                 ║
        ╚═══════════════════════════════════════════╝
        
        1. Consultar Saldo
        2. Retirar
        3. Consignar
        4. Cambiar Clave
        5. Consultar Movimientos
        6. Salir
        
        """)

        opc = int(input())

        if opc == 1:
            for i in registerList:
                print("su saldo es ", i['saldo'])

        elif opc == 2:
            retiros = {}
            retiros['retiro'] = float(input("cuanto va a retirar?"))
            retiros['fecha'] = fecha.strftime('%Y-%m-%d')
            listaRetiros.append(retiros)
            for i in registerList:
                if i['saldo'] > retiros['retiro']:
                    i['saldo'] -= retiros['retiro']
                    print("retiro ",retiros, "y su saldo quedo en ", (i['saldo']))

                else:
                    input("saldo insuficiente")

        elif opc == 3:
            consignas = {}
            consignas['consigna'] = float(input("cuanto va a consignar?"))
            consignas['fecha'] = fecha.strftime('%Y-%m-%d')
            listaConsig.append(consignas)
            for i in registerList:
                i['saldo'] += consignas['consigna']
                print("consignacion de  ",consignas['consigna'], "y su saldo quedo en ", (i['saldo']))



        elif opc == 4:
            oldPassword = " "
            for i in registerList:
                while oldPassword != i['password']:
                    oldPassword = input("ingrese la contraseña actual")
                    if i['password'] == oldPassword:
                        print("cambio de clave")
                        password = input("ingrese nueva contraseña")
                        repassword = input("ingrese la contraseña nueva de nuevo")
                        if password == repassword:
                            i['password'] = password
                            print('cambio exitoso')
                            menu()
                        else:
                            print("valide sus credenciales")




        elif opc == 5:
            print("Consulta de movimientos")
            print("sus retiros son",listaRetiros)
            print("sus consignaciones son", listaConsig)

        elif opc == 6:
            print("Saliendo")
            menu()

        else:
            print("ingrese una opcion válida")

def login():
    contador = 0
    while contador <3:
        contador += 1
        user = input("Usuario: ")
        userpassword = input("Contraseña: ")
        for i in registerList:
            if i['id'] != user  and i['password'] != userpassword:
                print(f"""
                ╔═══════════════════════════════════════════╗
                ║ **Ingreso al Sistema**                    ║
                ╚═══════════════════════════════════════════╝
                """)



                input("""
                ╔═══════════════════════════════════════════╗
                ║                                           ║
                ║           [   Ingresar   ]                ║
                ║                                           ║
                ╚═══════════════════════════════════════════╝
                presione cualquier tecla para ingresar""")

            else:
                print("Acceso concedido")
                operaciones()
                break
        if contador == 3:
            print("CUENTA BLOQUEADA CONTÁCTESE CON EL CALL CENTER")
            opc = 4
def registro():
    repassword = " "
    register['password'] = "  "
    print(f"""
    ╔═══════════════════════════════════════════╗
    ║ **Registro de Usuario**                   ║
    ╚═══════════════════════════════════════════╝
    """)
    register['id'] = input("Identificación : ")
    register['email'] = input("Correo electrónico : ")
    register['saldo'] = random.randint(1000,100000)
    while register['password'] != repassword:
        register['password'] = input("ingrese contraseña")
        repassword = input("Repetir contraseña:")
        opc = input("""
    ╔═══════════════════════════════════════════╗
    ║                                           ║
    ║           [  Registrar  ]                 ║
    ║                                           ║
    ╚═══════════════════════════════════════════╝
    oprima cualquier tecla para registrarse""")

        if register['id'] in registerList:
            print("el usuario ya esta registrado")
            print("presione 1 para iniciar sesion")
        elif repassword != register['password']:
            print("las contraseñas no coinciden")
        else:
            registerList.append(register)
            print("registro exitoso inicie sesion!")
            login()
            break








def menu():

    opc = 0
    while opc != 4:
        print("""
        ╔══════════════════════════════════════╗
        ║  Bienvenido al Cajero Automático Mi  ║
        ║                 Plata                ║
        ╠══════════════════════════════════════╣
        ║              Opciones:               ║
        ║                                      ║
        ║          1. Registrarse              ║
        ║          2. Ingresar                 ║
        ║          3. Saldos y Movimientos     ║
        ║          4. Salir                    ║
        ║                                      ║
        ║                                      ║
        ╚══════════════════════════════════════╝
        """)
        opc = int(input('->'))
        if opc == 1:
            registro()
        zelif opc == 4:
            print("Hasta pronto")
        else:
            if register == {} and registerList == []:
                print("No hay registros")
            else:
                if opc == 2:
                    login()
                elif opc == 3:
                    operaciones()



if __name__ == '__main__':
    menu()