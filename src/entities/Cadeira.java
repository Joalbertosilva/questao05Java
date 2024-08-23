package entities;

public class Cadeira extends Produto{
    private String material;

    public Cadeira(String material, String nome, double preco, int estoque, Categoria categoria){
        super(nome, preco, estoque, categoria);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "\n Nome: " + getNome() +
                "\n Preço: " + getPreco() +
                "\n Estoque: " + getEstoque() +
                "\n Material: " + getMaterial() +
                "\n Categoria: " + getCategoria() + '\'' +
                '}';
    }
}
