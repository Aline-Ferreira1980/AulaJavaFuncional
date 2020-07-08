package br.com.digital.innovation.aula1.fatorial;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }
    public static double fatorialA(double valor){
        return fatorialComtailcall(valor,1);
    }
    public static double fatorialComtailcall(double valor, double numero){
        if (valor == 0) {
            return numero;
        } return fatorialComtailcall(valor-1, numero*valor);
    }


}
