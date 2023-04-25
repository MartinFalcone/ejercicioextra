/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1extra_guia7;

import entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Cancion cancion1=new Cancion();
       Cancion cancion2=new Cancion("rw","bruno");
       Cancion cancion3=new Cancion("bruno");
       
       
       
       //cancion1.autor="pedro";
       //cancion1.titulo="aisjdiaosjd";
       
       //System.out.println(cancion1.autor+" "+cancion1.titulo);
      
       System.out.println(cancion3.getTitulo());
       System.out.println(cancion3.getAutor());
       
       
       cancion1.setTitulo("abc");
       cancion1.setAutor("pedro");
       
       
       
       
        //System.out.println(cancion1.getTitulo());
        //System.out.println(cancion1.getAutor());
    }
    
    
    
}
