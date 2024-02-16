destino = ''
personasGuajira = 0
totalNiños = 0
totalAdultos = 0
totalguajira = 0

nombre = 0
niños = 0
subtotal = 0

personasLlanos = 0
personasCanon = 0

totalLlanos = 0
totalCanon = 0

for i in range (10):
    menu = input(f"""
            a donde quieres viajar -->
            1- La guajira
            2- Cañón de chicamocha
            3- Llanos orientales
            elije el numero correspondiente""")

    nombre = input('ingrese su nombre')
    adultos = int(input('cuantos adultos van a viajar'))
    niños = int(input("cuantos niños van a viajar"))


    if menu == "1":

        destino= 'La Guajira'
        subtotalAdultos = adultos * 1450000

        subtotalNiños = niños*870000

        subtotal = subtotalNiños + subtotalAdultos

        personasGuajira += niños + adultos
        totalNiños += niños
        totalAdultos += adultos
        totalguajira += subtotal
    elif menu == "2":
        destino = 'El cañón de Chicamocha'
        subtotalAdultos = adultos * 1600000
        subtotalNiños = niños * 960000

        subtotalCanon = subtotalNiños + subtotalAdultos

        personasCanon += niños + adultos
        totalNiños += niños
        totalAdultos += adultos
        totalCanon += subtotalCanon
    elif menu == "3":
        destino = 'Los Llanos Orientales'
        subtotalAdultos = adultos * 1200000
        subtotalNiños = niños * 720000

        subtotalLlanos = subtotalNiños + subtotalAdultos

        personasLlanos += niños + adultos
        totalNiños += niños
        totalAdultos += adultos
        totalLlanos += subtotalLlanos

    print(f"""
    nombre {nombre}
    destino: {destino}
    adultos {adultos}
    niños {niños}
    subtotal {subtotal}""")

totalDinero = totalCanon + totalLlanos + totalguajira

print(f"""
        cantidad de personas que viajan para la Guajira {personasGuajira} 
        
          cantidad de personas que viajan al cañon dec Chicamocha {personasCanon}
          
          total personas que viajan a los Llanos Orientales {personasLlanos}
          
          total de dinero de los viajes para la Guajira {totalguajira}
          
          total de dinero de los viajes para el cañon de chicamocha {totalCanon}
          
          total de dinero de los viajes para los Llanos Orientales {totalLlanos}
          
          total de niños {totalNiños}
           
          total de adultos {totalAdultos}
          
          total dinero todos los destinos {totalDinero}""")
