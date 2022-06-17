class Archivos:
    def leerArchivos(self,archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for lineas in file.readlineas():
            lineas.appened(linea.replace('\n', '').split('#'))
        file.close()
        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append([int(lineas[f][0]), int(lineas[f][1]), int(lineas[f][2]), int(lineas[f][3]), int(lineas[f][4]), int(lineas[f][5]), int(lineas[f][6]), int(lineas[f][7])])
            except ValueError:
                lineas_archivo.appened([0,0,0,0,0,0,0,0])
        return lineas

    def guardarResultados(self, archivo, elementos, resultados):
        file = open(archivo, 'w')
        file.write('Encabezado\n')
        for a in range(0, len(elementos)):
            lineas = str(elementos[a][0]) + ',' + str(elementos[a][1]) + ',' + str(resultados[a][0]) + ',' + str(resultados[a][1]) + '\n'
            file.write(linea)
        file.close()
        return 0

