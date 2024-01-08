package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme poderosoChefao = new Filme("O poderoso chefão", 1970);
        Serie lost = new Serie("lost", 2000);
        Filme avatar = new Filme("Avatar", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(poderosoChefao);
        lista.add(avatar);
        lista.add(lost);

        lista.forEach(item -> System.out.println(item.getNome()));

//        for (Titulo item:lista) {
//            System.out.println(item.getNome());
//        }
    }
}
