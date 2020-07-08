package br.com.digital.innovation.aula2;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers= () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa= Pessoa::new;
        System.out.println(suppliers.get());
        System.out.println(instanciaPessoa.get());
    }
    static class Pessoa{
        private String nome;
        private Integer idade;

        public Pessoa(){
            nome = "Aline";
            idade= 23;
        }
        @Override
        public String toString(){
            return  String.format("nome: %s, idade: %d ", nome, idade);
        }
    }
}
