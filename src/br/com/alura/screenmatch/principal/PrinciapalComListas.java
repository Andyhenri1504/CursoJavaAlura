package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrinciapalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefao", 1972);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar a outra forma da agua", 2023);
        meuFilme.avalia(6);

        var filmedoPaulo = new Filme("Dogville", 2003);
        meuFilme.avalia(10);


        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmedoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao " + filme.getClassificacao());
            }


        }

       List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Margot Robiet");
        buscaPorArtista.add("Andrew Garfield");
        System.out.println(buscaPorArtista);


        Collections.sort(buscaPorArtista);
        System.out.println("depois da ordenacao");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
           lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }

}
