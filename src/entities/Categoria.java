package entities;

public class Categoria {
    private String titulo;

    public Categoria(String titulo){
        this.titulo = titulo;
    }
    public Categoria(){

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return getTitulo();
    }
}
