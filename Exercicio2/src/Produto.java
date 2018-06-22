public class Produto {
    String nome = null;
    double valorDoProduto = 0.0;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valorDoProduto = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valorDoProduto;
    }
}

