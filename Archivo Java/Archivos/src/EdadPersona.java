public class EdadPersona {
    private int anioNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;
    private int horaNacimiento;
    private int anioActual;
    private int mesActual;
    private int diaActual;
    private int horaActual;
    private int restaHora;
    private int restaDia;
    private int restaSemana;
    private int restaTotalDia;
    private int restaMes;
    private int restaTotalMes;
    private int restaAnio;
    private int resultadoHora;
    private int resultadoDia;
    private int resultadoSemana;
    private int resultadoTotalMes;

    public EdadPersona (int anioNacimiento, int mesNacimiento, int diaNacimiento, int horaNacimiento, int anioActual, int mesActual, int diaActual, int horaActual) {
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.horaNacimiento = horaNacimiento;
        this.anioActual = anioActual;
        this.mesActual = mesActual;
        this.diaActual = diaActual;
        this.horaActual = horaActual;
        this.calcularEdad();
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getAnioActual() {
        return anioActual;
    }

    public void setAnioActual(int anioActual) {
        this.anioActual = anioActual;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getMesActual() {
        return mesActual;
    }

    public void setMesActual(int mesActual) {
        this.mesActual = mesActual;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getDiaActual() {
        return diaActual;
    }

    public void setDiaActual(int diaActual) {
        this.diaActual = diaActual;
    }

    public int getHoraNacimiento() {
        return horaNacimiento;
    }

    public void setHoraNacimiento(int horaNacimiento) {
        this.horaNacimiento = horaNacimiento;
    }

    public int getHoraActual() {
        return horaActual;
    }

    public void setHoraActual(int horaActual) {
        this.horaActual = horaActual;
    }

    public int getRestaHora() {
        return restaHora;
    }

    public void setRestaHora(int restaHora) {
        this.restaHora = restaHora;
    }

    public int getRestaDia() {
        return restaDia;
    }

    public void setRestaDia(int restaDia) {
        this.restaDia = restaDia;
    }

    public int getRestaSemana() {
        return restaSemana;
    }

    public void setRestaSemana(int restaSemana) {
        this.restaSemana = restaSemana;
    }

    public int getRestaTotalDia() {
        return restaTotalDia;
    }

    public void setRestaTotalDia(int restaTotalDia) {
        this.restaTotalDia = restaTotalDia;
    }

    public int getRestaMes() {
        return restaMes;
    }

    public void setRestaMes(int restaMes) {
        this.restaMes = restaMes;
    }

    public int getRestaTotalMes() {
        return restaTotalMes;
    }

    public void setRestaTotalMes(int restaTotalMes) {
        this.restaTotalMes = restaTotalMes;
    }

    public int getRestaAnio() {
        return restaAnio;
    }

    public void setRestaAnio(int restaAnio) {
        this.restaAnio = restaAnio;
    }

    public int getResultadoHora() {
        return resultadoHora;
    }

    public void setResultadoHora(int resultadoHora) {
        this.resultadoHora = resultadoHora;
    }

    public int getResultadoDia() {
        return resultadoDia;
    }

    public void setResultadoDia(int resultadoDia) {
        this.resultadoDia = resultadoDia;
    }

    public int getResultadoSemana() {
        return resultadoSemana;
    }

    public void setResultadoSemana(int resultadoSemana) {
        this.resultadoSemana = resultadoSemana;
    }

    public int getResultadoTotalMes() {
        return resultadoTotalMes;
    }

    public void setResultadoTotalMes(int resultadoTotalMes) {
        this.resultadoTotalMes = resultadoTotalMes;
    }

    public void calcularEdad(){
        restaHora = this.horaActual - this.horaNacimiento;
        if (restaHora < 0) {
            restaHora += 24;
            this.diaActual -= 1;
        }else{
            restaHora += 0;
        }
        this.resultadoHora = restaHora;

        restaDia = this.diaActual - this.diaNacimiento;
        if (restaDia < 0) {
            restaDia += 30;
            this.mesActual -= 1;
        }else{
            restaDia += 0;
        }
        this.resultadoDia = restaDia;
        int restaSemana = this.resultadoDia/7;
        this.restaTotalDia = restaDia - (restaSemana * 7);
        this.resultadoDia = restaTotalDia;
        this.resultadoSemana = restaSemana;

        restaMes = this.mesActual - this.mesNacimiento;
        if (this.restaMes < 0) {
            this.restaMes += 12;
            this.anioActual -= 1;
        }else{
            this.restaMes += 0;
        }
        this.restaAnio = (anioActual - anioNacimiento) * 12;
        this.restaTotalMes = restaMes + restaAnio;
        this.resultadoTotalMes = this.restaTotalMes;
    }

    public static void main(String[] args) {
        EdadPersona noPuedoMarta = new EdadPersona(2003,3,8,12,2022,6,14,21);
        System.out.println(noPuedoMarta.getRestaTotalMes());
        System.out.println(noPuedoMarta.getResultadoSemana());
        System.out.println(noPuedoMarta.getResultadoHora());
        System.out.println(noPuedoMarta.getResultadoHora());
    }
}
