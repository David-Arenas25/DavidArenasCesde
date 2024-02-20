nombre = "david"
nro_hijos = 3
valor_hora = 4166
horas_trabajadas = float(input("ingrese las horas trabajadas"))
valor_horas = valor_hora * horas_trabajadas


if nro_hijos > 3:
    bonificacion = 10 * valor_hora * nro_hijos
else:
    bonificacion = 5 * valor_hora * nro_hijos


if horas_trabajadas > 47:
    horas_extra = horas_trabajadas - 47
    valor_horas = valor_hora * (horas_trabajadas - horas_extra)

else:
    horas_extra = 0

recargo = 0.35 * valor_hora
valor_hora_extra = (valor_hora + recargo) * horas_extra
devengado = valor_hora_extra + valor_horas

print(f"""
        nombre {nombre}
        numero de hijos {nro_hijos}
        bonificacion por hijos {bonificacion}
        valor hora {valor_hora}        
        horas trabajadas {horas_trabajadas}        
        valor de las horas {valor_horas}
        horas extra {horas_extra}              
        valor de las extras {valor_hora_extra}
        devengado {devengado}
        neto {devengado + bonificacion}""")
