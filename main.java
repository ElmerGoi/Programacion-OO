public class main {
    public static void main(String[] args) {
        Persona haberque= new Persona(12,8,3,2003,20,21,5,2022);
        System.out.println("La edad de la persona es: "+ haberque.getResultadoTotalMes()+" en meses");
        System.out.println("la edad de la persona es: "+ haberque.getResultadoSemana()+" en semanas");
        System.out.println("la edad de la persona es: "+ haberque.getResultadoTotalDia()+" en dias");
        System.out.println("la edad de la persona es: "+ haberque.getResultadoHora()+" en horas");
    }
}
