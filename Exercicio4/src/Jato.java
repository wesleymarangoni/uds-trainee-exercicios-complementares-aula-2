public class Jato extends Aviao {

    public Jato(Integer quantidadeDePoltronas, double peso, String modelo) {
        super(quantidadeDePoltronas, peso, modelo);
    }

    @Override
    public void voar() {
        System.out.println("O jato é loco voa muito");
    }

    @Override
    public void pousar() {
        System.out.println("O jato pousa velozão");
    }

    public void ativaModoTurbo(){
        System.out.println("Jato ta PISTOLÃO no Role Turbo Ativado");
    }
}
