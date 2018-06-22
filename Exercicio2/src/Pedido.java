import java.util.ArrayList;

public class Pedido {
    double totalDoPedido;
    private ArrayList<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public Double calcularTotalPedido(){
        this.totalDoPedido = 0.0;
        this.produtos.stream().forEach(produto -> {
            this.totalDoPedido += produto.getValor();

        });
        return this.totalDoPedido;
    }

    public double getTotalDoPedido() {
        return totalDoPedido;
    }

    public void setTotalDoPedido(double totalDoPedido) {
        this.totalDoPedido = totalDoPedido;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}

