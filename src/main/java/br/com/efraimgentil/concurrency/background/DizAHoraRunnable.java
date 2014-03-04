package br.com.efraimgentil.concurrency.background;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Efraim Gentil (efraim.gentil@gmail.com)
 */
public class DizAHoraRunnable implements Runnable{
    
    private SimpleDateFormat sdf;
    
    public DizAHoraRunnable() {
        sdf = new SimpleDateFormat("HH:mm:ss");
        
    }
    
    @Override
    public void run() {
        System.out.println( sdf.format( new Date() ) );
    }
    
}
