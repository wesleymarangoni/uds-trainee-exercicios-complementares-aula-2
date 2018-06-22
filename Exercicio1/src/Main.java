public class Main {

    public static void main(String[] args) {
        Animal macaco = new Macaco ("Jr", 10);
        System.out.println (macaco.andar ());
        ((Macaco) macaco) .comerBanana ();
    }
}
