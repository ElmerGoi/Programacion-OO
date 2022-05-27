public class Persona extends Edad {

    private int horaNacimiento;
    private int diaNacimiento;
    private int mesNacimiento;
    private int añoNacimiento;
    private int horaActual;
    private int diaActual;
    private int mesActual;
    private int añoActual;
    private int restaHora;
    private int restaDia;
    private int restaSemana;
    private int restaTotalDia;
    private int restaMes;
    private int restaTotalMes;
    private int restaAño;

    public Persona(int horaNacimiento, int diaNacimiento, int mesNacimiento, int añoNacimiento, int horaActual, int diaActual, int mesActual, int añoActual) {
        this.horaNacimiento = horaNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.añoNacimiento = añoNacimiento;
        this.horaActual = horaActual;
        this.diaActual = diaActual;
        this.mesActual = mesActual;
        this.añoActual = añoActual;
    }

    @Override
    public void calcularEdad() {

        restaHora = this.horaActual - this.horaNacimiento;
        if (restaHora < 16) {
            restaHora =+ 24;
            this.diaActual = -1;
        }else{
            restaHora =+ 0;
        }
        this.resultadoHora = restaHora;

        restaDia = this.diaActual - this.diaNacimiento;
        if (restaDia < 0) {
            restaDia =+ 30;
            this.mesActual = -1;
        }else{
            restaDia =+ 0;
        }
        this.resultadoDia = restaDia;
        int restaSemana = this.resultadoDia/7;
        this.restaTotalDia = restaDia - (restaSemana * 7);
        this.resultadoDia = restaTotalDia;
        this.resultadoSemana = restaSemana;

        restaMes = this.mesActual - this.mesNacimiento;
        if (this.restaMes < 0) {
            this.restaMes =+ 12;
            this.añoActual = -1;
        }else{
            this.restaMes =+ 0;
        }
        this.restaAño = (añoActual - añoNacimiento) * 12;
        this.restaTotalMes = restaMes + restaAño;
        this.resultadoTotalMes = this.restaTotalMes;
    }
}
