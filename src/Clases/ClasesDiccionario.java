package Clases;

import java.util.ArrayList;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class ClasesDiccionario {
    private ArrayList <String> idiomas = new ArrayList <> ();
    
    public ClasesDiccionario () {}
    
    public ClasesDiccionario ( String palabra, String palabra2, String palabra3, String palabra4 ) {
        this.idiomas.add(palabra);
        this.idiomas.add(palabra2);
        this.idiomas.add(palabra3);
        this.idiomas.add(palabra4);        
    }
    
    public String getIdioma () {
        return this.idiomas.get(0);
    }

    public void agregarPalabra (String palabra) {
        this.idiomas.add(palabra);
    }
    
    public String devolverTraduccion (int indice) {
        return this.idiomas.get(indice);
    }
    
    public int buscarPosicion (String palabra) {
        int buscador = 0;
        for ( int buscadorPalabra = 0; buscadorPalabra < idiomas.size(); buscadorPalabra++ ) {
            if (palabra.equalsIgnoreCase(idiomas.get(buscadorPalabra))) {
                buscador = buscadorPalabra;
            }
        }
        return buscador;
    }
}