package model;

public enum Rank {
    KAGE("O ninja mais poderoso da Aldeia" , 10),
    ANBU("Os ninjas que são braço direito do hokage" , 7),
    JOUNIN("Os ninjas senior, que ensinam outros ninja" , 5),
    CHUNIN("Os ninjas pleno, que não precisam de tanta supervisão" , 3),
    GENIN("Os ninjas juniors, que geralmente tem um jounin com eles" , 1);

    private String info;
    private int expertise;

    private Rank(String info, int expertise) {
        this.info = info;
        this.expertise = expertise;
    }
}
