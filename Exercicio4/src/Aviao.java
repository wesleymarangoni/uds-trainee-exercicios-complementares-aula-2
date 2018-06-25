public abstract class Aviao {
    Integer quantidadeDePoltronas = null;
    double peso = 0.0;
    String modelo = null;

    public Aviao(Integer quantidadeDePoltronas, double peso, String modelo) {
        this.quantidadeDePoltronas = quantidadeDePoltronas;
        this.peso = peso;
        this.modelo = modelo;
    }

    public abstract void voar ();
    public abstract void pousar ();

    public Integer getQuantidadeDePoltronas() {
        return quantidadeDePoltronas;
    }

    public void setQuantidadeDePoltronas(Integer quantidadeDePoltronas) {
        this.quantidadeDePoltronas = quantidadeDePoltronas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
