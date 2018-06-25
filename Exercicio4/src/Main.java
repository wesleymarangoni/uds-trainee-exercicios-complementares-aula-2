public class Main {
    public static void main(String[] args) {
        Jato meuJato = new Jato(16,4110,"Jato Fera");
        TecoTeco meuTecoTeco = new TecoTeco(2,1310,"TecoTeco nx");
        SuperTecoTeco tecoSuper = new SuperTecoTeco(10,2210,"Super Teco Morfador");
        System.out.println("-----------------------------TECOTECO-----------------------------------");
        meuTecoTeco.voar();
        System.out.println("Modelo Avião "+meuTecoTeco.modelo);
        System.out.println("Quantidade de Poltronas "+ meuTecoTeco.quantidadeDePoltronas);
        System.out.println("Peso: "+ meuTecoTeco.peso);
        System.out.println("-----------------------------JATO---------------------------------------");
        meuJato.voar();
        System.out.println("Modelo Avião "+meuJato.modelo);
        System.out.println("Quantidade de Poltronas "+meuJato.quantidadeDePoltronas);
        System.out.println("Peso: "+meuJato.peso);
        System.out.println("----------------------------SUPER-TECOTECO------------------------------");
        tecoSuper.voar();
        System.out.println("Modelo Avião "+tecoSuper.modelo);
        System.out.println("Quantidade de Poltronas "+tecoSuper.quantidadeDePoltronas);
        System.out.println("Peso: "+tecoSuper.peso);
        tecoSuper.virandoSuperTeco();


    }
}
