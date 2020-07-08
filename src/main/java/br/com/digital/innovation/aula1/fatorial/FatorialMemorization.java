package br.com.digital.innovation.aula1.fatorial;

import java.util.HashMap;
import java.util.Map;

class FatorialMemorization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        long F =System.nanoTime();
        System.out.println("Fatorial de 1 "+ (F-I));//retorna o valor de nanosegundos, quanto tempo leva pra ser processado

        I=System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        F=System.nanoTime();
        System.out.println("Fatorial de 2 "+ (F-I)); //retorna o valor de nanosegundos, quanto tempo leva pra ser processado levando em consideração a recursividade

        }
        public static Integer fatorialComMemorization(Integer value){
        if (value ==1){
            return value;
        }else {
            if (MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            }else {
                Integer resultado = value * fatorialComMemorization(value-1);
                MAPA_FATORIAL.put(value,resultado);
                return resultado;
            }
        }
        }
}
