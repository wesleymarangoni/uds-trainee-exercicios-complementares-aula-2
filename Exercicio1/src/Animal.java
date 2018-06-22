public abstract class Animal {
    String nome = null;
    Integer idade = null;

    public Animal(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    abstract String andar();



}