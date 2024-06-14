package Sistema;

public abstract class ProdutoBase {

    // Atributos:
    private String nome;
    private double preco;
    private int quantidade;

    // Métodos:

    public ProdutoBase(String nome, double preco, int quantidade) {}
    public ProdutoBase() {}

    public abstract String exibirDetalhes();

}
