/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author santiago
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Creo a lista
      List <Integer> numeros= new ArrayList<Integer>(); 
      List <Persona> DAW1= new ArrayList<Persona>();
      Scanner sc=new Scanner(System.in);
      
    
  //  Clase lista <TipoDatoLista> nome lista=       
        
       Random n=new Random();
       for(int i=0;i<10;i++){
           numeros.add(n.nextInt(100));
       }
        System.out.println(numeros.toString());
       Collections.sort(numeros);
       for(int i=0;i<numeros.size();i++) {
          System.out.println(numeros.get(i));
           
       }
       
       /*
       char opc='f';
       while (opc!='s'){
        System.out.println("Desexa meter os datos de un alumno novo s/n");
        opc=sc.next().charAt(0);
       if(opc!='s'){ 
          Persona aux=new Persona();
          System.out.println("nome alumno");
          aux.setnome(sc.next());
           System.out.println(" dni");
           aux.setdni(sc.next());
            System.out.println("Altura alumno");
            aux.sealtura(sc.nextInt());
            DAW1.add(aux);
       }
    }
       
    for(int i=0;i<DAW1.size();i++){
         System.out.println(DAW1.get(i).getPersona());
        
    }   
       
       
       
     */  
       

   // TODO code application logic here
    }
    
}
