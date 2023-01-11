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
        File directorio = new File("carpeta");
        directorio.mkdir();
        File archivo = new File(directorio,"archivo.txt");
        if(archivo.exists()){
            System.out.println("El archivo ya existe...eliminando");
            archivo.delete();
        }
        else{
            System.out.println("El archivo no existe");
        }
        try {
            archivo.createNewFile();
            System.out.println("Creando archivo...");
        } catch (IOException ex) {
            System.out.println("Error en la creación del archivo");
        }
        System.out.println(archivo.getAbsolutePath());
        System.out.println(archivo.getPath());
        
        System.out.println("Elementos en directorio");
        for(String elemento:directorio.list()){
            System.out.println(elemento);
        }
        
        System.out.println("files en directorio");
        for(File elemento:directorio.listFiles()){
            System.out.println(elemento);
        }
    }
    
}
