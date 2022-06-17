from abc import ABCMeta

class PersonaAbs(ABCMeta):
    #metodo de clase
    @staticmethod
    def calcularEdad(anioNacimiento, anioActual, mesNacimiento, mesActual, diaNacimiento, diaActual, horaNacimiento, horaActual):
        horasEdad = horaActual - horaNacimiento
        if horasEdad > 0:
            horasEdad += 24
            diaActual -= 1
        else:
            horasEdad += 0

        diasEdad = diaActual - diaNacimiento
        if diasEdad > 0:
            diasEdad += 30
            mesActual -= 1
        else:
            diasEdad += 0

        semanasEdad = diasEdad // 7

        dias = semanasEdad * 7
        diasEdadTotal = diasEdad - dias

        meses = anioActual - anioNacimiento
        mesesTotal = meses * 12
        total = mesActual - mesNacimiento
        mesEdad = total + mesesTotal
        lista = [mesEdad, semanasEdad, diasEdadTotal, horasEdad]
        return lista

class pruebaArchivos:

    #poner un metodo de clase, se pondra el metodo

    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n', '').split(","))
        file.close()
        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append([int(lineas[f][0]), int(lineas[f][1]), int(lineas[f][2]), int(lineas[f][3]), int(lineas[f][4]), int(lineas[f][5]), int(lineas[f][6]), int(lineas[f][7])])
            except ValueError:
                lineas_archivo.append([0,0,0,0,0,0,0,0])
        return lineas_archivo

    def calcularEdadPersona(self, lista):
        resultados = []
        for f in range(0, len(lista)):
            resultados.append(PersonaAbs.calcularEdad(
            lista[f][0], lista[f][1], lista[f][2], lista[f][3], lista[f][4], lista[f][5], lista[f][6], lista[f][7]))
        return resultados

    def guardarresultados(self, entrada, resultados):
        file = open("resultados.txt", 'w')
        file.write('Mesese Edad#Semanas Edad#Dias Edad#Horas Edad\n')
        for f in range(0, len(entrada)):
            linea = str(entrada[f][0]) + '#' + str(entrada[f][1]) + '#' + str(entrada[f][2]) + '#' + str(entrada[f][3]) + '#' + str(entrada[f][4]) + '#' + str(entrada[f][5]) + '#' + str(entrada[f][6]) + '#' + str(entrada[f][7]) + \
                    '#' + str(resultados[f][0]) +'\n'
            file.write(linea)
        file.close
if __name__ == "__main__":
    prueba = pruebaArchivos()
    archivo = []
    archivo = prueba.leerArchivo("Entradas.txt")
    print(archivo)
    resultado = prueba.calcularEdadPersona(archivo)
    print(resultado)
    prueba.guardarresultados(archivo,resultado)