from abc import ABC

import self


class Fecha(ABC):
    _mesEdad = int(0)
    _semanasEdad = int(0)
    _diasEdadTotal = int(0)
    _horasEdad = int(0)

    def __init__(self, mesEdad, semanasEdad, diasEdadTotal, horasEdad):
        self._mesEdad = mesEdad
        self._semanasEdad = semanasEdad
        self._diasEdadTotal = diasEdadTotal
        self._horasEdad = horasEdad

    @staticmethod
    def CalcularEdad(self):
        pass

    def getmesEdad(self):
        return self._mesEdad

    def getsemanasEdad(self):
        return self._semanasEdad

    def getdiasEdadTotal(self):
        return self._diasEdadTotal

    def gethorasEdad(self):
        return self._horasEdad


class Persona(Fecha):

    __anioNacimiento = int(0)
    __anioActual = int(0)
    __mesNacimiento = int(0)
    __mesActual = int(0)
    __diaNacimiento = int(0)
    __diaActual = int(0)
    __horaNacimiento = int(0)
    __horaActual = int(0)

    def __init__(self, mesEdad, semanasEdad, diasEdadTotal, horasEdad, anioNacimiento, anioActual, mesNacimiento,
                 mesActual, diaNacimiento, diaActual, horaNacimiento, horaActual):
        Fecha.__init__(self, mesEdad, semanasEdad, diasEdadTotal, horasEdad)
        self.__anioNacimiento = anioNacimiento
        self.__anioActual = anioActual
        self.__mesNacimiento = mesNacimiento
        self.__mesActual = mesActual
        self.__diaNacimiento = diaNacimiento
        self.__diaActual = diaActual
        self.__horaNacimiento = horaNacimiento
        self.__horaActual = horaActual
        self.CalcularEdad()

    def CalcularEdad(self):

        self._horasEdad = self.__horaActual - self.__horaNacimiento
        if self._horasEdad > 0:
            self._horasEdad += 24
            self.__diaActual -= 1
        else:
            self._horasEdad += 0

        diasEdad = self.__diaActual - self.__diaNacimiento
        if diasEdad > 0:
            diasEdad += 30
            self.__mesActual -= 1
        else:
            diasEdad += 0

        self._semanasEdad = diasEdad // 7

        dias = self._semanasEdad * 7
        self._diasEdadTotal = diasEdad - dias

        meses = self.__anioActual - self.__anioNacimiento
        mesesTotal = meses * 12
        total = self.__mesActual - self.__mesNacimiento
        self._mesEdad = total + mesesTotal
