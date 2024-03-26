import ConsultarMovimientos
from ConsultarSaldo import ConsultarSaldo
from Retiro import Retiro
from Consigna import Consigna
from ConsultarMovimientos import ConsultarMovimientos
from CambioClave import CambioClave
from Persona import Persona
class MenuApp():
    def operaciones(self):
        if self.inicio == True:
            opc = 0
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
                    ConsultarSaldo.consultaDeSaldo(self)

                elif opc == 2:
                    Retiro.realizarRetiro(self)

                elif opc == 3:
                    Consigna.realizarConsginacion(self)

                elif opc == 4:
                    CambioClave.CambiarClave(Persona,MenuApp)

                elif opc == 5:
                   ConsultarMovimientos.consultaDeMovimientos(self)

                elif opc == 6:
                    print("Saliendo")
                    MenuApp.menuPrincipal(self)

                else:
                    print("ingrese una opcion válida")
        else: print("Debe iniciar sesion para ver este contendio")

    def menuPrincipal(self):
        self.registerList = []
        self.register ={}
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
                self.registro(self, MenuApp)
            elif opc == 4:
                print("Hasta pronto")
                break
            else:
                if self.register == {} and self.registerList == []:
                    print("No hay registros")
                else:
                    if opc == 2:
                        login()
                    elif opc == 3:
                        MenuApp.operaciones(Persona)
