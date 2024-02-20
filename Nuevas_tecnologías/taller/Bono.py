personEstratoUno = 0

personas0Hijos = 0
total0Hijos1 = 0

personasUnoDosHijos = 0
totalUnoDosHijos1 = 0

personasTresHijos = 0
totalTresHijos1 = 0

total0Hijos2 = 0
totalUnoDosHijos2 = 0
totalTresHijos2 = 0

personasEstratoDos = 0

ing = input("Desea ingresar los datos escriba SI o NO?").lower()

if ing == "si":
    for i in range(6):
        estrato = input("¿ A qué estrato perteneces? 1 ó 2 (escriba el número al estrato que pertenece)")
        nroHijos = int(input(" ¿Cuántos hijos tienes?"))

        if estrato == "1":
            personEstratoUno += 1

            if nroHijos == 0:
                personas0Hijos += 1
                bonus = 20000
                total0Hijos1 += bonus

            elif nroHijos in range(1, 3):
                personasUnoDosHijos += 1
                bonus = 25000
                totalUnoDosHijos1 += bonus

            elif nroHijos >= 3:
                personasTresHijos += 1
                bonus = 30000
                totalTresHijos1 += bonus

        elif estrato == "2":
            personasEstratoDos += 1

            if nroHijos == 0:
                personas0Hijos += 1
                bonus = 16500
                total0Hijos2 += bonus

            elif nroHijos in range(1, 3):
                personasUnoDosHijos += 1
                bonus = 21500
                totalUnoDosHijos2 += bonus

            elif nroHijos >= 3:
                personasTresHijos += 1
                bonus = 26500
                totalTresHijos2 += bonus

            else:
                print("Ingrese una opción válida")

    totalEstrato1 = total0Hijos1 + totalUnoDosHijos1 + totalTresHijos1

    totalEstrato2 = total0Hijos2 + totalUnoDosHijos2 + totalTresHijos2

    totalPagado = totalEstrato1 + totalEstrato2

    total0Hijos = total0Hijos1 + total0Hijos2

    totalUnoDosHijos = totalUnoDosHijos1 + totalUnoDosHijos2

    totalTresHijos = totalTresHijos1 + totalTresHijos2

    print(f"""
        personas estrato 1 -> {personEstratoUno}
        
        personas estrato 2 -> {personasEstratoDos}
        
        total dinero estrato 1 -> {totalEstrato1}
        
        total dinero estrato 2 ->{totalEstrato2}    
            
        cantidad de personas sin hijos: {personas0Hijos}
        
        cantidad de personas con uno o dos hijos: {personasUnoDosHijos}
        
        cantidad de personas con tres o mas hijos: {personasTresHijos}
        
        total dinero entregado a beneficiaros sin hijos: {total0Hijos}
        
        total dinero entregado a beneficiaros con 1 ó 2 hijos: {totalUnoDosHijos}
        
        total dinero entregado a beneficiaros con 3 o más hijos: {totalTresHijos}
        
        total pagado por los bonos {totalPagado}""")

else:
    print("Está bien hasta luego")
