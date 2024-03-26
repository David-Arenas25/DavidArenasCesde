import random
class Persona():
    def __init__(self, identificacion, usuario,password, repassword):
        self.identificacion = identificacion
        self.usuario = usuario
        self.password = password
        self.repassword = repassword
        self.saldo = random.randint(1000,1000000)
        self.register = {}
        self.registerList = []
        self.listaConsignaciones = []
        self.listaRetiros = []
        self.inicio = False

    def login(self, menu):
        self.inicio = False
        contador = 0
        while contador < 3 and self.inicio == False:
            contador += 1
            user = input("Usuario: ")
            userpassword = input("Contraseña: ")
            for i in self.registerList:
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
                    self.inicio = True
                    menu.operaciones(self)


            [print(" valide sus credenciales intento numero", contador, "le quedan", 3 - contador, "intentos")
            for i in self.registerList if i['usuario'] == user and i['clave'] == userpassword]

            if contador == 3:
                print("CUENTA BLOQUEADA CONTÁCTESE CON EL CALL CENTER")
                self.inicio = False
                exit()


    def registro(self,menu):
        print(f"""
        ╔═══════════════════════════════════════════╗
        ║ **Registro de Usuario**                   ║
        ╚═══════════════════════════════════════════╝
        """)
        self.identificacion = input("identificacion : ")
        self.usuario = input("ingrese su usuario :")
        self.saldo = random.randint(1000, 100000)
        self.password = input("ingrese contraseña")
        self.repassword = input("Repita la contraseña")
        self.registerList = []
        self.listaRetiros = []
        self.listaConsignaciones = []
        while self.password != self.repassword:
            self.password = input("Repita la contraseña")
            self.repassword = input("Repetir contraseña nuevamente:")
            opc = input("""
        ╔═══════════════════════════════════════════╗
        ║                                           ║
        ║           [  Registrar  ]                 ║
        ║                                           ║
        ╚═══════════════════════════════════════════╝
        oprima cualquier tecla para registrarse""")
        self.register = {'id': self.identificacion, 'usuario': self.usuario, 'saldo': self.saldo, 'clave': self.password}
        self.registerList.append(self.register)
        print(self.registerList)
        self.login(self, menu)