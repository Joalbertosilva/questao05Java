package entities;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private Categoria categoria;

    public Produto(String nome, double preco, int estoque, Categoria categoria ){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
