public class Macaco extends Animal {

    public Macaco(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    String andar() {
        return "Macaco Anda Rapido";
    }

    public static void comerBanana(){
        System.out.println("Macaco esta Comendo Banana");
    }
}