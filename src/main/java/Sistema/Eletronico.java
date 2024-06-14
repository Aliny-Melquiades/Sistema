package Sistema;

public class Eletronico extends ProdutoBase{

    private int garantiaMeses;

    public Eletronico(String nome, double preco) {}
    public Eletronico() {}

    @Override
    public String exibirDetalhes() {
        return "";
    }

    public int getGarantiaMeses() {
        return 0;
    }

    public void setGarantiaMeses(int garantiaMeses) {}

    public String getTipo() {
        return ""; }
}
