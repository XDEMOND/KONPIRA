public class PruebaArchivos {
   
    public static void main(String [] args){
        String origen = "file.txt";
        String destino = "archivo.cpp";
        System.out.println("Proceso de copiar archivo: " + CopiarArchivo.getInstance().copiar(origen, destino));
    }
}