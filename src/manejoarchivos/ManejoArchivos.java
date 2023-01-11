/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hola
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo = new File("archivo.txt");
        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error en la creación del archivo");
        }
        System.out.println(archivo);
    }
    
}
