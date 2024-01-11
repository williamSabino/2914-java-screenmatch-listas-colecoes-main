package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme poderosoChefao = new Filme("O poderoso chefão", 1970);
        Serie lost = new Serie("lost", 2000);
        Filme avatar = new Filme("Avatar", 2023);
        Filme mazeRunner = new Filme("Maze runner", 2021);
        Filme barbie = new Filme("Barbie", 2024);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(poderosoChefao);
        lista.add(lost);
        lista.add(mazeRunner);
        lista.add(avatar);
        lista.add(barbie);

        System.out.println("Antes de ordenar");
        System.out.println(lista);
        System.out.println("Depois de ordenar");
        lista.sort(Comparator.comparing(Titulo::getNome));
        System.out.println(lista);

        
    }
}
