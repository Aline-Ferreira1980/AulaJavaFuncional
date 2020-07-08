package br.com.digital.innovation.aula1;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {
        UnaryOperator <Integer> calculaValorVezesTres =valor-> valor*3;
        int valor = 10;
        System.out.println("O resultado é :: "+calculaValorVezesTres.apply(10));// forma de lambda - paradigma funcional
    }
}
