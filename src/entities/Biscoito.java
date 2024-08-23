package entities;

public class Biscoito  extends Produto{
    private String sabor;


    public Biscoito(String sabor, String nome, double preco, int estoque, Categoria categoria) {
        super(nome, preco, estoque, categoria);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Biscoito{" +
                "\n Sabor: " + getSabor() +
                "\n Nome: " + getNome() +
                "\n Preço: " + getPreco() +
                "\n Estoque: " + getEstoque() +
                "\n Categoria: '" + getCategoria() + '\'' +
                '}';
    }
}
