package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme poderosoChefao = new Filme("O poderoso chefão", 1970);
        poderosoChefao.setDuracaoEmMinutos(180);

        poderosoChefao.exibeFichaTecnica();
        poderosoChefao.avalia(8);
        poderosoChefao.avalia(5);
        poderosoChefao.avalia(10);

        Serie lost = new Serie("lost", 2000);

        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        Filme avatar = new Filme("Avatar", 2023);
        avatar.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(poderosoChefao);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(poderosoChefao);
        listaFilmes.add(avatar);
        System.out.println(listaFilmes);
    }
}