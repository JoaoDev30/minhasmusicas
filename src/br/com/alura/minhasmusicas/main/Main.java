package br.com.alura.minhasmusicas.main;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("White Ferrari");
        minhaMusica.setCantor("Frank Ocean");
        minhaMusica.setAlbum("Blonde");
        minhaMusica.setGenero("R&B, soul, indie e hip-hop");

        var outraMusica = new Musica();
        outraMusica.setTitulo("Don't Dreamin it's Over");
        outraMusica.setCantor("Crowded House");

        var musicaDoAlef = new Musica();
        musicaDoAlef.setTitulo("Evidências");
        musicaDoAlef.setCantor("Xitãozinho e Choróró");

        ArrayList<Musica> listMusic = new ArrayList<>(); // Lembrando que a lista começa com 0
        listMusic.add(minhaMusica); // 0
        listMusic.add(outraMusica); // 1
        listMusic.add(musicaDoAlef); // 2
        System.out.println("Tamanho da lista de música: "+listMusic.size());
        System.out.println("Qual a primeira música: "+listMusic.get(0).getTitulo());
        System.out.println(listMusic.get(0).getCantor());

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }


}