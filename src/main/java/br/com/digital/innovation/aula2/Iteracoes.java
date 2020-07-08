package br.com.digital.innovation.aula2;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo","Oliveira", "Santos", "Instrutor","Java"};
        Integer[] numeros= {1,2,3,4,5};
       // imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes);
        //imprimirODobroDeCadaItemDaLista(numeros);

        List<String>profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }
    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir= " ";
        for(int i=0; i<nomes.length; i++){
            if (nomes[i].equals("João")){
                nomesParaImprimir += " "+nomes[i];
            }
        }

    System.out.println("Nomes do For: "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome->nome.equals("João"))
                .collect(Collectors.joining()); // pega um array de strings e transforma numa string so
        System.out.println("Nomes do Stream: "+nomesParaImprimirDaStream);

    }
    public static void imprimirTodosNomes(String...nomes){
        for(String nome: nomes){
            System.out.println(nome);
        }
        Stream.of(nomes)
                .forEach(nome->System.out.println("Impresso pelo forEach "+nome));
    }
    public static void imprimirODobroDeCadaItemDaLista(Integer...numeros){
        for (Integer numero: numeros){
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero->numero*2)
                        .forEach(System.out::println);
    }
}
