import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MEGA SISTEMA DE VENDAS\n");
        Produto[] arrayProdutos = new Produto[2];
        Pedido pedido = new Pedido();
        for(int i=0;i<arrayProdutos.length;i++){
            String nomeProduto =null;
            double valorProduto = 0.0;
            Scanner entradaDoNomeProduto = new Scanner(System.in);
            System.out.println("Digite o nome do Produto: ");
            nomeProduto = entradaDoNomeProduto.next();
            Scanner entradaDoValorProduto = new Scanner(System.in);
            System.out.println("Digite o valor do Produto: ");
            valorProduto = entradaDoValorProduto.nextDouble();

            arrayProdutos[i] = new Produto(nomeProduto,valorProduto);
            pedido.adicionarProduto(arrayProdutos[i]);

        }
        System.out.println("\n\n\nTotal do pedido eh: " + pedido.calcularTotalPedido());
    }
}
