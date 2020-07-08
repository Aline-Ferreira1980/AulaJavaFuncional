package br.com.digital.innovation.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString() ;
        Function<String,Integer> converteStringParaInteiroECalcularODobro = string -> Integer.valueOf(string)*2;
        System.out.println(retornaNomeAoContrario.apply("Aline"));
        System.out.println(converteStringParaInteiroECalcularODobro.apply("20"));
    }
}
