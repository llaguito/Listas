package Clases;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Palabra implements Comparable <Palabra>{
    private String texto;
    private int tam;
    
    public Palabra () {}
    
    public Palabra (String Texto, int tam) {
        this.texto = Texto;
        this.tam = tam;
    }

    public String getTexto() {
        return this.texto;
    }

    public int getTam() {
        return this.tam;
    }

    @Override
    public int compareTo(Palabra p1) {
        if ( this.getTam() < p1.getTam() ) {
            return 1;
        }
        else if ( this.getTam() > p1.getTam() ){
            return -1;
        }
        else {
            return 0;
        }
    }

}