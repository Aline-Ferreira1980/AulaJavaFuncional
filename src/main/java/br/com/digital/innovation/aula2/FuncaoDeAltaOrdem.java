package br.com.digital.innovation.aula2;

public class FuncaoDeAltaOrdem {
    public static void main(String[] args) {

        Calculo soma = (a,b)->a+b;
        Calculo subtracao = (a,b)->a-b;
        Calculo divisao = (a,b)->a/b;
        Calculo mult = (a,b)->a*b;

        System.out.println(executarOperacao(soma ,1,3));
        System.out.println(executarOperacao(subtracao ,4,3));
        System.out.println(executarOperacao(divisao ,4,2));
        System.out.println(executarOperacao(mult ,7,3));


    }
    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}
@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);

}

//por parametro recebe outra função
// ou que ela retorna uma função
