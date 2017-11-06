/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author pablomontes
 */
public class salto {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader fr = new FileReader("archivo.cpp");
            BufferReader br = new BufferReader(fr);
            String cadena;
            int numero;
            while((cadena= br.readLine())!=null){
                System.out.println(""+cadena);
            }
        }catch(Exception ex){
            
        }
        
    }
}
