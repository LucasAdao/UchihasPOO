package model;

public abstract class Senju {
    private String nome;
    private int idade;
    private Rank rank;

    public Senju(String nome, int idade, Rank rank) {
        this.nome = nome;
        this.idade = idade;
        this.rank = rank;
    }
    public Senju(){

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
    public abstract void poderSenju();
}
