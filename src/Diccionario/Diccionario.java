package Diccionario;

import Clases.ClasesDiccionario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Diccionario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <ClasesDiccionario> idiomas = new ArrayList <> ();
        idiomas.add(new ClasesDiccionario("Español", "Hola", "Juego", "Adios"));
        idiomas.add(new ClasesDiccionario("Ingles", "Hello", "Game", "Bye"));
        idiomas.add(new ClasesDiccionario("Francés", "Salut", "Jeu", "Au revoir"));
        String idioma;
        String palabra;
        int buscador = 0;
        int buscadorPalabra;
        
        String [] menu = {"1 - Agregar palabra y traducciones.", "2 - Traducir una palabra", "3 - Salir"};
        int respuestaMenu = 0;
    
        while ( respuestaMenu != 3 ){
            
            for ( int contadorMenu = 0; contadorMenu < menu.length; contadorMenu++ ) {
                System.out.print("\n" + menu[contadorMenu]);
            }
            
            System.out.print("\n¿Que opción escoges? ");
            respuestaMenu = leer.nextInt();
            
            switch (respuestaMenu) {
                
                case 1 :
                    for ( int contadorAgregar = 0; contadorAgregar < idiomas.size(); contadorAgregar++ ) {
            
                        System.out.print("\nIntroduce palabra en " + idiomas.get(contadorAgregar).getIdioma() + ": ");
                        palabra = leer.next();
                        idiomas.get(contadorAgregar).agregarPalabra(palabra);
                    }
                    
                    System.out.print("\nPalabras agregadas.");
                    break;
                    
                case 2 :
                   System.out.print("\nIdioma de la palabra que quieres traducir: ");
                   idioma = leer.next();
                   for ( int buscadorIdioma = 0; buscadorIdioma < idiomas.size(); buscadorIdioma++ ) {
                       if (idioma.equalsIgnoreCase(idiomas.get(buscadorIdioma).getIdioma())) {
                           buscador = buscadorIdioma;
                       }
                   }
                   
                   
                   System.out.print("\nQue palabra quieres traducir: ");
                   palabra = leer.next();
                   System.out.print("\nTraducciones: ");
                   buscadorPalabra = idiomas.get(buscador).buscarPosicion(palabra);
                   for ( int imprimirTraduccion = 0; imprimirTraduccion < idiomas.size(); imprimirTraduccion++ ) {
                        System.out.print("\n"+idiomas.get(imprimirTraduccion).getIdioma()+": "+idiomas.get(imprimirTraduccion).devolverTraduccion(buscadorPalabra));
                    }
                   
                   
                    
            }
   
        }
    }
}
