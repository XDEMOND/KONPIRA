import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class escribir {

public static void main(String[] args) throws IOException 
{
    File file = new File("archivo.cpp");   
    BufferedReader br = new BufferedReader(new FileReader(file));
    String linea = br.readLine();
    String todo = "";
    try 
    {
        while(linea !=null) 
        {
            todo = todo + linea + "\n";
            linea = br.readLine();
        }
        br.close();
    } 
    catch (IOException e) 
    {
    }
    File TextFile = new File("Final.cpp"); 
    FileWriter TextOut = new FileWriter(TextFile, true);
    TextOut.write("#include<stdlib.h>\n");
    TextOut.write("#include<stdio.h>\n");
    TextOut.write("#include<string.h>\n");
    TextOut.write("#include<iostream>\n");
    TextOut.write("#include<cstdlib>\n");
    TextOut.write("using namespace std;\n");
    TextOut.write(todo);
    TextOut.close();
}
}

