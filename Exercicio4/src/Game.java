import java.util.Random;
import java.util.Scanner;

public class Game {
    public static int escolha;
    public static void menuDoJogo(){
        while(Jogador.getQuantidadePontos() > 0) {
            System.out.println("-----------------------------------------------------------------PONTOS: " + Jogador.getQuantidadePontos());
            System.out.println("Jogo Da Roleta do Par ou Impar \n" +
                    "teste sua sorte\n\n");
            System.out.println("###[1]- PAR   - ###\n");
            System.out.println("###[2]- IMPAR - ###\n");
            System.out.println("###[0]- SAIR - ###\n");
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
            verificaEscolha(escolha);

        }
    }
    private static void verificaEscolha(Integer escolha) {
        if (escolha.equals(0) ){
            System.out.println("Saindo do Jogo");
            System.exit(0);
        }
        if (escolha < 0 || escolha > 2 ){
            System.out.println("Digito Invalido");
            menuDoJogo();
        }
        sorteioNumero();
    }

    public static Integer sorteioNumero( ){
        Random random = new Random();
        Integer numeroSorteadoRandom = random.nextInt(100);
        resultadoDaRodada(escolha,numeroSorteadoRandom,verificaNumeroParOuImpar(numeroSorteadoRandom));
        return numeroSorteadoRandom;
    }

    public static void resultadoDaRodada(Integer escolha, Integer numeroSorteadoRandom,boolean numeroPar) {

        if(escolha.equals(1) && numeroPar == true){
            System.out.println("Voce Acertou o numero é Par, o Numero Sorteado foi  " + numeroSorteadoRandom +" [+10 pontos]");
            Jogador.recebePontuacao(10);
            menuDoJogo();
        }else if (escolha.equals(1) && numeroPar == false){
            System.out.println("Voce Errou o numero é Impar, o Numero Sorteado foi  " + numeroSorteadoRandom +" [-10 pontos]");
            Jogador.retiraPontuacao(10);
            menuDoJogo();
        }

        if(escolha.equals(2) && numeroPar == false){
            Jogador.recebePontuacao(10);
            System.out.println("Voce Acertou o numero é Impar, o Numero Sorteado foi  " + numeroSorteadoRandom +" [+10 pontos]");
            menuDoJogo();
        }else if (escolha.equals(2) && numeroPar == true){
            System.out.println("Voce Errou o numero é Impar, o Numero Sorteado foi  " + numeroSorteadoRandom +" [-10 pontos]");
            Jogador.retiraPontuacao(10);
            menuDoJogo();
        }
    }

    public static boolean verificaNumeroParOuImpar(Integer numeroSorteadoRandom ){

        if (numeroSorteadoRandom % 2 == 0){
            return true;
        }else{
            return false;
        }

    }

}
