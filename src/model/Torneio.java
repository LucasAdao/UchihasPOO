package model;
import java.util.ArrayList;

public class Torneio<T> {
    private ArrayList<T> inscritosNoTorneio;

    public Torneio() {
       this.inscritosNoTorneio = new ArrayList<>();
    }
    public void adicionarParticipante(T participante) {
        if (inscritosNoTorneio.size() < 9){
            inscritosNoTorneio.add(participante);
        }else{
            System.out.println("O torneio já está cheio!!");
        }
    }
}
