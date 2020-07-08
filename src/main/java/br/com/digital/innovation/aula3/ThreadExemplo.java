package br.com.digital.innovation.aula3;

public class ThreadExemplo {
    public static void main(String[] args) {
        GerarPDF iniciarGeradorPDF = new GerarPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.start();
    }

}
    class GerarPDF extends Thread{
    @Override
       public void run(){
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF gerado");
     }
    }
    class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF){
        this.iniciarGeradorPDF= iniciarGeradorPDF;
    }
    @Override
        public void run(){
        while (true){
            try {
                Thread.sleep(500);
                if(!iniciarGeradorPDF.isAlive()){
                break;
            }
            System.out.println("Loading...");
        }catch(InterruptedException e){
                e.printStackTrace();
            }
            }
    }

}
