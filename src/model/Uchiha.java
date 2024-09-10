package model;

public abstract class Uchiha {

    private String nome;
    private int idade;
    private Rank rank;

    public Uchiha(String nome, int idade, Rank rank) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
    }
    public Uchiha(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
    public abstract void ativarSusano();
    public abstract void habilidadeDoSharigan();
}
