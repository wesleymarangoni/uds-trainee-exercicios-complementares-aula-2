public class Jogador {
    private static Integer quantidadePontos;

    public Jogador(Integer quantidadePontos){
        this.quantidadePontos = quantidadePontos;
    }

    public static Integer getQuantidadePontos() {
        return quantidadePontos;
    }

    public void setQuantidadePontos(Integer quantidadePontos) {
        this.quantidadePontos = quantidadePontos;
    }

    public static void recebePontuacao(Integer bonificacaoRodada){
        quantidadePontos += bonificacaoRodada;
    }
    public static void retiraPontuacao(Integer bonificacaoRodada){
        quantidadePontos -= bonificacaoRodada;
    }

}
