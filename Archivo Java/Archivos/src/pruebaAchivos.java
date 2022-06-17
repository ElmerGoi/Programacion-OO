import java.io.*;
import java.util.ArrayList;

public class pruebaAchivos {
    private ArrayList<String> contenidoArchivo = new ArrayList<String>();
    private ArrayList<EdadPersona> listaEntrada = new ArrayList<EdadPersona>();
    private final String rutaWindows = "F:\\Archivo Java\\Archivos";
    private final String rutaLinux = "/Volumes/THEMECUAS/Archivo Java/Archivos/entrada.txt";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<EdadPersona> getListaEntrada() {
        return listaEntrada;
    }

    public void LeerArchivo(){
        leerArchivos leer = new leerArchivos();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaLinux);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                int anioNacimiento = Integer.parseInt(elementosLinea[0]);
                int mesNacimiento = Integer.parseInt(elementosLinea[1]);
                int diaNacimiento = Integer.parseInt(elementosLinea[2]);
                int horaNacimiento = Integer.parseInt(elementosLinea[3]);
                int anioActual = Integer.parseInt(elementosLinea[4]);
                int mesActual= Integer.parseInt(elementosLinea[5]);
                int diaActual = Integer.parseInt(elementosLinea[6]);
                int horaActual = Integer.parseInt(elementosLinea[7]);
                listaEntrada.add(new EdadPersona(anioNacimiento, mesNacimiento, diaNacimiento, horaNacimiento, anioActual, mesActual, diaActual, horaActual));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntrada.add(new EdadPersona(0,0,0,0,0,0,0,0));
            }
        }
    }

    public void escribirArchivo(ArrayList<EdadPersona> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Año nacimiento, mes nacimiento, dia nacimiento, hora nacimiento, año nacimiento, mes nacimiento, dia nacimiento, hora nacimiento\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getAnioNacimiento() +
                        "," + lista.get(i).getMesNacimiento() +
                        "," + lista.get(i).getDiaNacimiento() +
                        "," + lista.get(i).getHoraNacimiento() +
                        "," + lista.get(i).getAnioActual() +
                        "," + lista.get(i).getMesActual() +
                        "," + lista.get(i).getDiaActual() +
                        "," + lista.get(i).getHoraActual() +
                        "," + lista.get(i).getResultadoHora() +
                        "," + lista.get(i).getResultadoDia() +
                        "," + lista.get(i).getResultadoSemana() +
                        "," + lista.get(i).getResultadoTotalMes() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaAchivos prueba = new pruebaAchivos();
        prueba.LeerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getAnioNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getMesNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getDiaNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getHoraNacimiento() +
                    "\t" + prueba.getListaEntrada().get(i).getAnioActual() +
                    "\t" + prueba.getListaEntrada().get(i).getMesActual() +
                    "\t" + prueba.getListaEntrada().get(i).getDiaActual() +
                    "\t" + prueba.getListaEntrada().get(i).getHoraActual() +
                    "\t" + prueba.getListaEntrada().get(i).getResultadoTotalMes() +
                    "\t" + prueba.getListaEntrada().get(i).getResultadoSemana() +
                    "\t" + prueba.getListaEntrada().get(i).getRestaDia() +
                    "\t" + prueba.getListaEntrada().get(i).getResultadoHora());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}
