package Traductor;
import java.io.IOException;
import java.nio.file.*; 
public class cambio2 {
    public static void main(String args[])throws IOException{
        Path o = Paths.get("archivo.cpp");
        Path d = Paths.get("Final.cpp");
        
        Files.copy(o,d,StandardCopyOption.REPLACE_EXISTING);  
        
    } 
    
}
