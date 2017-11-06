package Traductor;
import java.io.IOException;
import java.nio.file.*; 
public class cambio {
    public static void main(String args[])throws IOException{
        Path o = Paths.get("file.txt");
        Path d = Paths.get("archivo.cpp");
        
        Files.copy(o,d,StandardCopyOption.REPLACE_EXISTING);  
        
    } 
    
}
