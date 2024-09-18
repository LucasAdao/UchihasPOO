import model.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Itachi:");
//        Itachi itachi = new Itachi();
//        itachi.ativarSusano();
//        itachi.habilidadeDoSharigan();
//        itachi.setRank(Rank.KAGE);
//        System.out.println("Itachi é um " + itachi.getRank());
//
//        System.out.println("Sasuke:");
//        Sasuke sasuke = new Sasuke();
//        sasuke.ativarSusano();
//        sasuke.habilidadeDoSharigan();
//        sasuke.setRank(Rank.KAGE);
//        System.out.println("Sasuke é um " + sasuke.getRank());
//
//        System.out.println("Tobi:");
//        Tobi tobi = new Tobi();
//        tobi.ativarSusano();
//        tobi.habilidadeDoSharigan();
//        tobi.setRank(Rank.KAGE);
//        System.out.println("Tobi é um " + tobi.getRank());
            Tobi tobi = new Tobi();
            Tobirama tobirama = new Tobirama();
            Itachi itachi = new Itachi();
            Shisui shisui = new Shisui();
            Madara madara = new Madara();
            Hashirama hashirama = new Hashirama();
            Sasuke sasuke = new Sasuke();
            Minato minato = new Minato();
            Tsunade tsunade = new Tsunade();

            Torneio torneioChunin = new Torneio();
            torneioChunin.adicionarParticipante(minato);
            torneioChunin.adicionarParticipante(shisui);
            torneioChunin.adicionarParticipante(madara);
            torneioChunin.adicionarParticipante(itachi);
            torneioChunin.adicionarParticipante(hashirama);
            torneioChunin.adicionarParticipante(sasuke);
            torneioChunin.adicionarParticipante(tobirama);

    }
}