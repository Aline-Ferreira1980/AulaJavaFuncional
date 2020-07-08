package br.com.digital.innovation.aula5;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        printarUmNomeCompleto("João", "Santos");
        printarSoma(5,6);
    }
        private static void connectAndPrintUrlJavaOracle(){
        URL url = null;
        try {
            url = new URL("https://docs.oracle.com/javase/10/language/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        URLConnection urlConnection = null;
        try {
            urlConnection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));

        }
        public static void printarUmNomeCompleto (String nome, String sobrenome){
            var nomeCompleto = String.format("%s %s ",nome,sobrenome);
            System.out.println(nomeCompleto);
        }
        public static void printarSoma(int a, int b){
        var soma = a+b;
            System.out.println(soma);
        }

    }

//Consegue

// variaveis local inicializadas
// variavel suporte do enhaced for (é o forEach)
// variavel suporte do for iterativo
// variavel try with resource

//Nao consegue

// var nao pode ser utilizado em nivel de classe
// var nao pode ser utilizado como parametro
// var nao pode ser utilizada em variaveis locais nao inicializadas



