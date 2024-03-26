class CambioClave():
    def CambiarClave(self, menu):
        oldPassword = " "
        for i in self.registerList:
            while oldPassword != i['clave']:
                oldPassword = input("ingrese la contraseña actual")
                if i['clave'] == oldPassword:
                    print("cambio de clave")
                    password = input("ingrese nueva contraseña")
                    repassword = input("ingrese la contraseña nueva de nuevo")
                    if password == repassword:
                        i['clave'] = password
                        print('cambio exitoso')
                        self.inicio = True
                        self.login(self,menu )
                        break
                    else:
                        print("valide sus credenciales")
