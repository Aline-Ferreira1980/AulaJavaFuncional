package br.com.digital.innovation.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method reference
        //apenas
        //utilizar o paramentro da forma que ele foi recebido
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");

    }
}
