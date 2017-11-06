/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.io.IOException;

/**
 *
 * @author Yair
 */
public class intermedio {


public static void main(String args[])
    {
    

try {
    // Execute a command with an argument
    String command = "C:\\Users\\Yair\\Desktop\\konpaira";
    Process child = Runtime.getRuntime().exec(command);
    
} catch (IOException e) {
}

try {
    // Execute a command with an argument
    String command2 = "g++ -E Final.cpp > Final.ii";
    Process child2 = Runtime.getRuntime().exec(command2);
    
} catch (IOException e) {
}
    }
}
