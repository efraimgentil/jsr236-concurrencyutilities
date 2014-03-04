package br.com.efraimgentil.concurrency.background;


/**
 * 
 * @author Efraim Gentil (efraim.gentil@gmail.com)
 */
public class ImprimirNoConsoleRunnable implements Runnable{
    
    private int vezes;
    private String texto;
    
    public ImprimirNoConsoleRunnable(String texto  ,int vezes) {
        this.texto = texto;
        this.vezes = vezes;
    }
    
    @Override
    public void run() {
        for(int i = 1 ; i <= vezes ; i++){
            System.out.println( i + " Texto: " + texto );
        }
    }

}
