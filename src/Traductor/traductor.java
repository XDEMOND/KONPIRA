package Traductor;
import java.io.*;
public class traductor {
       public static void main(String args[])
         {
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line = "", oldtext = "";
             
             while((line = reader.readLine()) != null)
                 {
                 oldtext += line + "";
             }
             
             reader.close();
             // replace a word in a file
             //String newtext = oldtext.replaceAll("drink", "Love");
 
             //To replace a line in a file
             String newtext = oldtext.replaceAll("fi", "if");
             
           //  String newtext3 = oldtext.replaceAll("rof", "for");
 
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
         }
         
          catch (IOException ioe)
             {
             ioe.printStackTrace();
         }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line2 = "", oldtext2 = "";
             
             while((line2 = reader.readLine()) != null)
                 {
                 oldtext2 += line2 + "";
             }
             
             reader.close();
             String newtext = oldtext2.replaceAll("elihw", "while");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line3 = "", oldtext3 = "";
             
             while((line3 = reader.readLine()) != null)
                 {
                 oldtext3 += line3 + "";
             }
             
             reader.close();
             String newtext = oldtext3.replaceAll("esle", "else");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line4 = "", oldtext4 = "";
             
             while((line4 = reader.readLine()) != null)
                 {
                 oldtext4 += line4 + "";
             }
             
             reader.close();
             String newtext = oldtext4.replaceAll("rof", "for");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line5 = "", oldtext5 = "";
             
             while((line5 = reader.readLine()) != null)
                 {
                 oldtext5 += line5 + "";
             }
             
             reader.close();
             String newtext = oldtext5.replaceAll("etirw", "printf");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line6 = "", oldtext6 = "";
             
             while((line6 = reader.readLine()) != null)
                 {
                 oldtext6 += line6 + "";
             }
             
             reader.close();
             String newtext = oldtext6.replaceAll("od", "do");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line7 = "", oldtext7 = "";
             
             while((line7 = reader.readLine()) != null)
                 {
                 oldtext7 += line7 + "";
             }
             
             reader.close();
             String newtext = oldtext7.replaceAll("diov", "void");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line8 = "", oldtext8 = "";
             
             while((line8 = reader.readLine()) != null)
                 {
                 oldtext8 += line8 + "";
             }
             
             reader.close();
             String newtext = oldtext8.replaceAll("cilbup", "public");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line9 = "", oldtext9 = "";
             
             while((line9 = reader.readLine()) != null)
                 {
                 oldtext9 += line9 + "";
             }
             
             reader.close();
             String newtext = oldtext9.replaceAll("etavirp", "private");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line9 = "", oldtext9 = "";
             
             while((line9 = reader.readLine()) != null)
                 {
                 oldtext9 += line9 + "";
             }
             
             reader.close();
             String newtext = oldtext9.replaceAll("citats", "static");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line10 = "", oldtext10 = "";
             
             while((line10 = reader.readLine()) != null)
                 {
                 oldtext10 += line10 + "";
             }
             
             reader.close();
             String newtext = oldtext10.replaceAll("Niam", "int main()");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line11 = "", oldtext11 = "";
             
             while((line11 = reader.readLine()) != null)
                 {
                 oldtext11 += line11 + "";
             }
             
             reader.close();
             String newtext = oldtext11.replaceAll("hctiws", "switch");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line12 = "", oldtext12 = "";
             
             while((line12 = reader.readLine()) != null)
                 {
                 oldtext12 += line12 + "";
             }
             
             reader.close();
             String newtext = oldtext12.replaceAll("esac", "case");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line13 = "", oldtext13 = "";
             
             while((line13 = reader.readLine()) != null)
                 {
                 oldtext13 += line13 + "";
             }
             
             reader.close();
             String newtext = oldtext13.replaceAll("kaerb", "break");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line14 = "", oldtext14 = "";
             
             while((line14 = reader.readLine()) != null)
                 {
                 oldtext14 += line14 + "";
             }
             
             reader.close();
             String newtext = oldtext14.replaceAll("daer", "cin");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line15 = "", oldtext15 = "";
             
             while((line15 = reader.readLine()) != null)
                 {
                 oldtext15 += line15 + "";
             }
             
             reader.close();
             String newtext = oldtext15.replaceAll("tni", "int");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line16 = "", oldtext16 = "";
             
             while((line16 = reader.readLine()) != null)
                 {
                 oldtext16 += line16 + "";
             }
             
             reader.close();
             String newtext = oldtext16.replaceAll("rahc", "char");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line17 = "", oldtext17 = "";
             
             while((line17 = reader.readLine()) != null)
                 {
                 oldtext17 += line17 + "";
             }
             
             reader.close();
             String newtext = oldtext17.replaceAll("ced", "float");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line18 = "", oldtext18 = "";
             
             while((line18 = reader.readLine()) != null)
                 {
                 oldtext18 += line18 + "";
             }
             
             reader.close();
             String newtext = oldtext18.replaceAll("gnirts", "string");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line19 = "", oldtext19 = "";
             
             while((line19 = reader.readLine()) != null)
                 {
                 oldtext19 += line19 + "";
             }
             
             reader.close();
             String newtext = oldtext19.replaceAll("amargorp", "/*Programa*/");
             
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
         try
             {
             File file = new File("archivo.cpp");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line20 = "", oldtext20 = "";
             
             while((line20 = reader.readLine()) != null)
                 {
                 oldtext20 += line20 + "";
             }
             
             reader.close();
             String newtext = oldtext20.replaceAll("tluafed", "default");
             FileWriter writer = new FileWriter("archivo.cpp");
             writer.write(newtext);writer.close();
            }
          catch (IOException ioe)
             {
             ioe.printStackTrace();
            }
        }
       
}
