/*1)Fai un programa que lea unha frase e a separe en palabras, almacenando despois a frase nun arraylist de palabras.*/

package MisEjercicios;

import Clases.Palabra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringTokenizer token;
        String texto;
        String palabrita;
        ArrayList <Palabra> palabras = new ArrayList <>();
        
        
        //Introducimos la frase
        System.out.print("Introduce la frase a almacenar: ");
        texto = leer.nextLine();
        token = new StringTokenizer(texto);

        
        //Contruimos el ArrayList usando la clase.
        while (token.hasMoreTokens()) {
            palabrita = token.nextToken();
            palabras.add(new Palabra(palabrita, palabrita.length()));
        }

        
        //Ordenamos ArrayList
        Collections.sort(palabras);
        
        //Imprimimos el ArrayList
        for ( int contador = 0; contador < palabras.size(); contador++ ) {
            System.out.print("\nPalabra: "+palabras.get(contador).getTexto()+", de tamaño: "+palabras.get(contador).getTam()+".");
        }
    }

}
