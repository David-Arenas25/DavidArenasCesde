from datetime import datetime
class Consigna():
    def __init__(self,consignas,listaConsignas):
        self.consginas = consignas
        self.listaConsignas = listaConsignas

    def realizarConsginacion(self):
        self.consignas = {}
        self.consignas['consigna'] = float(input("cuanto va a consignar?"))
        fecha = datetime.now()
        self.consignas['fecha'] = fecha.strftime('%Y-%m-%d')
        for i in self.registerList:
            i['saldo'] += self.consignas['consigna']
            self.listaConsignaciones.append(self.consignas)
            print("consignacion de  ", self.consignas['consigna'], "y su saldo quedo en ", (i['saldo']))