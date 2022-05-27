from Herencia.Persona import Fecha, Persona


def main():
    personita = Persona(2003, 2022, 3, 5, 8, 26, 12, 19)
    print(personita.getdiasEdadTotal())
    print(personita.gethorasEdad())
    print(personita.getsemanasEdad())
    print(personita.getmesEdad())


if __name__ == "__main__":
    main()


