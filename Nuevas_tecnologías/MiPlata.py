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
            for i in registerList:
                if i['saldo'] > retiros['retiro']:
                    i['saldo'] -= retiros['retiro']
                    listaRetiros.append(retiros)
                    print("retiro ", retiros, "y su saldo quedo en ", (i['saldo']))

                else:
                    input("saldo insuficiente")

        elif opc == 3:
            consignas = {}
            consignas['consigna'] = float(input("cuanto va a consignar?"))
            consignas['fecha'] = fecha.strftime('%Y-%m-%d')
            listaConsig.append(consignas)
            for i in registerList:
                i['saldo'] += consignas['consigna']
                print("consignacion de  ", consignas['consigna'], "y su saldo quedo en ", (i['saldo']))

        elif opc == 4:
            oldPassword = " "
            for i in registerList:
                while oldPassword != i['clave']:
                    oldPassword = input("ingrese la contraseña actual")
                    if i['clave'] == oldPassword:
                        print("cambio de clave")
                        password = input("ingrese nueva contraseña")
                        repassword = input("ingrese la contraseña nueva de nuevo")
                        if password == repassword:
                            i['clave'] = password
                            print('cambio exitoso')
                            menu()
                        else:
                            print("valide sus credenciales")

        elif opc == 5:
            print("Consulta de movimientos")
            print("sus retiros son", listaRetiros)
            print("sus consignaciones son", listaConsig)

        elif opc == 6:
            print("Saliendo")
            menu()

        else:
            print("ingrese una opcion válida")


def login():
    contador = 0
    while contador < 3:
        contador += 1
        user = str(input("Usuario: "))
        userpassword = str(input("Contraseña: "))
        for i in registerList:
            if i['usuario'] == user and i['clave'] == userpassword:
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

                print("Acceso concedido")
                operaciones()
                break

            else:
                print("valide sus credenciales")
                print("intento numero", contador, "le quedan", 3 - contador, "intentos")
        if contador == 3:
                print("CUENTA BLOQUEADA CONTÁCTESE CON EL CALL CENTER")
                opc = 4

def registro():
    print(f"""
    ╔═══════════════════════════════════════════╗
    ║ **Registro de Usuario**                   ║
    ╚═══════════════════════════════════════════╝
    """)
    id = input("identificacion : ")
    usuario = input("ingrese su usuario :")
    email = input("Correo electrónico : ")
    saldo = random.randint(1000, 100000)
    password = input("ingrese contraseña")
    repassword = input("Repita la contraseña")
    while password != repassword:
        password = input("Repita la contraseña")
        repassword = input("Repetir contraseña nuevamente:")
        opc = input("""
    ╔═══════════════════════════════════════════╗
    ║                                           ║
    ║           [  Registrar  ]                 ║
    ║                                           ║
    ╚═══════════════════════════════════════════╝
    oprima cualquier tecla para registrarse""")
    register = {'id': id, 'usuario': usuario, 'correo': email, 'saldo': saldo, 'clave': password}
    registerList.append(register)
    print(registerList)


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
        elif opc == 4:
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
