public class SuperTecoTeco extends TecoTeco {
    String cor = null;
    public SuperTecoTeco(Integer quantidadeDePoltronas, double peso, String modelo) {
        super(quantidadeDePoltronas, peso, modelo);
    }

    public void virandoSuperTeco(){
        System.out.println("Agora tenho asas duplas\n e combustivel Diesel");
    }
}
