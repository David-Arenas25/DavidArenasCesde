from datetime import datetime
class Retiro():

    def __init__(self,retiros,listaRetiros):
        self.retiros = retiros
        self.listaRetiros = listaRetiros

    def realizarRetiro(self):
        self.retiros = {}
        self.retiros['retiro'] = float(input("cuanto va a retirar?"))
        fecha = datetime.now()
        self.retiros['fecha'] = fecha.strftime('%Y-%m-%d')
        for i in self.registerList:
            if i['saldo'] > self.retiros['retiro']:
                i['saldo'] -= self.retiros['retiro']
                self.listaRetiros.append(self.retiros)
                print("retiro ", self.retiros, "y su saldo quedo en ", (i['saldo']))