public class TecoTeco extends Aviao{
    public TecoTeco(Integer quantidadeDePoltronas, double peso, String modelo) {
        super(quantidadeDePoltronas, peso, modelo);
    }

    @Override
    public void voar() {
        System.out.println("Voa pleno, Devagarinho");
    }

    @Override
    public void pousar() {
        System.out.println("Pousa bruscamente");
    }

    public void ejetaPiloto(){
        System.out.println("Piloto Ejetado do TecoTeco");
    }
}
