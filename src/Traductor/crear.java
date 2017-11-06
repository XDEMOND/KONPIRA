package Traductor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 
public class crear {
     public static void main(String[] args) throws IOException {
        String ruta = "/Users/pablomontes/Documents/Programas/konpaira/archivo.cpp";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
           // bw.write("#include<stdio.h>");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            //bw.write("#include<stdio.h>");
        }
        bw.close();
    }   
}
