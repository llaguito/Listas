package Clases;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Prestamo implements Comparable <Prestamo> {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int paxinas;
    
    public Prestamo () {}
    
    public Prestamo (int isbn, String titulo, String autor, int paxinas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paxinas = paxinas;
    }
    
    public int getISBN () {
        return this.isbn;
    }
    
    public int getPaxinas () {
        return this.paxinas;
    }
    
    public String getAutor () {
        return this.autor;
    }
    
    public String getTitulo () {
        return this.titulo;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor (String autor) {
        this.autor = autor;
    }
    
    public void setPaxinas (int paxinas) {
        this.paxinas = paxinas;
    }

    @Override
    public int compareTo(Prestamo p1) {
        if ( this.getPaxinas() < p1.getPaxinas() ) {
            return 1;
        }
        else if ( this.getPaxinas() > p1.getPaxinas() ){
            return -1;
        }
        else {
            return 0;
        }
    }

}
