import model.Itachi;
import model.Rank;
import model.Sasuke;
import model.Tobi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Itachi:");
        Itachi itachi = new Itachi();
        itachi.ativarSusano();
        itachi.habilidadeDoSharigan();
        itachi.setRank(Rank.KAGE);
        System.out.println("Itachi é um " + itachi.getRank());

        System.out.println("Sasuke:");
        Sasuke sasuke = new Sasuke();
        sasuke.ativarSusano();
        sasuke.habilidadeDoSharigan();
        sasuke.setRank(Rank.KAGE);
        System.out.println("Sasuke é um " + sasuke.getRank());

        System.out.println("Tobi:");
        Tobi tobi = new Tobi();
        tobi.ativarSusano();
        tobi.habilidadeDoSharigan();
        tobi.setRank(Rank.KAGE);
        System.out.println("Tobi é um " + tobi.getRank());
    }
}