public abstract class Edad {

    protected int resultadoHora;
    protected int resultadoDia;
    protected int resultadoMes;
    protected int resultadoSemana;
    protected int resultadoTotalDia;
    protected int resultadoTotalMes;
    protected int resultadoAño;

    public abstract void calcularEdad();

    public int getResultadoHora() {
        return this.resultadoHora;
    }

    public int getResultadoSemana() {
        return this.resultadoSemana;
    }

    public int getResultadoTotalDia() {
        return this.resultadoTotalDia;
    }

    public int getResultadoTotalMes() {
        return this.resultadoTotalMes;
    }
}
