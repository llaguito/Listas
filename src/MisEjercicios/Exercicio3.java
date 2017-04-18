package MisEjercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        StringTokenizer token;
        int contadorLetra = 0;
        ArrayList <String> palabras = new ArrayList <> ();
        
        //Pedimos Grase a leer:
        System.out.print("Introduce la frase: ");
        frase = leer.nextLine();
        token = new StringTokenizer(frase);
        
        //Agregamos a la ArrayList las palabras de la frase.
        while (token.hasMoreTokens()) {
            palabras.add(token.nextToken());
        }
        
        //Imprimimos el ArrayList
        for ( int contador = 0; contador < palabras.size(); contador++ ) {
            contadorLetra = 0;
            if (palabras.contains(palabras.get(contador))) {
                for (int contador1 = 0; contador1 < palabras.size(); contador1++) {
                    if (palabras.get(contador).equalsIgnoreCase(palabras.get(contador1))) {
                        contadorLetra++;
                    }
                }
                if ( contador != 0) {
                    for ( int contador2 = 0; contador2 < contador; contador2++) {
                        if (palabras.get(contador).equalsIgnoreCase(palabras.get(contador2))) {
                            contadorLetra = 0;
                        }
                    }
                }
            }
            
            //Imprimimos resultado.
            if (contadorLetra > 1) {
                System.out.print("\nLa palabra "+palabras.get(contador)+" se repite "+contadorLetra+" veces.");
            }
        }
    }

}
