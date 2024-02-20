nombre = input("ingrese el nombre del estudiante")
valor_matricula = float(input("ingrese el valor de la matricula"))
estrato = int(input("ingrese su estrato"))
descuento = 0
recargo = 0

if estrato == 1:
    descuento = 0.4
elif estrato == 2:
    descuento = 0.3
elif estrato == 3:
    descuento = 0.1
elif estrato == 4:
    recargo = 0.1
elif estrato == 5:
    recargo = 0.2
elif estrato == 6:
    recargo = 0.4

recargo_aplicado = valor_matricula * recargo
descuento_aplicado = valor_matricula * descuento

neto = valor_matricula + recargo - descuento

print(f"""
    Nombre estudiante {nombre}
    Valor d la matricula {valor_matricula}
    Estrato {estrato}
    Descuento {descuento * 100}%
    Recargo {recargo * 100}%
    Neto {neto}""")