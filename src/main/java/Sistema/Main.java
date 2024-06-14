package Sistema;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar duas instâncias de CarrinhoDeCompras
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        // Adicionar produtos ao primeiro carrinho
        carrinho1.adicionarItem((Produto) new Eletronico("Celular", 3500.0));
        carrinho1.adicionarItem((Produto) new Roupa("Vestido", 150.0));
        carrinho1.adicionarItem((Produto) new Alimento("Café", 8.50));

        // Listar os produtos e o total de ambos os CarrinhoDeCompras
        System.out.println("Produtos no carrinho 1:");
        listarProdutosECalcularTotal(carrinho1);

        System.out.println("Produtos no carrinho 2:");
        listarProdutosECalcularTotal(carrinho2);

        // Gravar os arquivos referentes a cada carrinho de compras
        try {
            gravarCarrinho(carrinho1, "carrinho1.ser");
            gravarCarrinho(carrinho2, "carrinho2.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <Item> void listarProdutosECalcularTotal(CarrinhoDeCompras carrinho) {

        double total = 0.0;

        Item[] items = null;
        for (Item item : items) {
            System.out.println(item.getClass() + ": R$" + item.getClass());
            total = item.getClass().getModifiers();
        }

        System.out.println("Total: R$" + total);
        System.out.println();
    }

    private static void gravarCarrinho(CarrinhoDeCompras carrinho, String arquivo) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(arquivo);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(carrinho);
        objectOut.close();
        fileOut.close();
        System.out.println("Carrinho de compras gravado em " + arquivo);
    }
}
