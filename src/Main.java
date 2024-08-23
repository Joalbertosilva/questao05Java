import entities.Biscoito;
import entities.Cadeira;
import entities.Categoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Categoria novaCategoria = new Categoria("Mobilia");
        Cadeira novaCadeira = new Cadeira("Madeira", "Tramontina", 50.00, 40, novaCategoria);
        System.out.println(novaCadeira);
        Categoria outraCategoria = new Categoria("Comida");
        Biscoito novoBiscoito = new Biscoito("Chocolate", "Treloso", 2.00, 30, outraCategoria);
        System.out.println();
        System.out.println(novoBiscoito);
    }
}