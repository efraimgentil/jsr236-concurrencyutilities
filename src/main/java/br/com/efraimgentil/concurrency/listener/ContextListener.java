package br.com.efraimgentil.concurrency.listener;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedScheduledExecutorService;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.com.efraimgentil.concurrency.background.DizAHoraRunnable;

public class ContextListener implements ServletContextListener {
    
    private Future<?> processoAgendado;
    
    @Resource
    ManagedScheduledExecutorService scheduledExecutorService;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Inicia proceso agendado, que ira rodar log ode inicial e em seguida inifinitamenta
        // a cada 5 minutos
        processoAgendado = scheduledExecutorService.scheduleAtFixedRate( new DizAHoraRunnable() , 0l , 5l , TimeUnit.MINUTES );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //Finaliza processo agendado quando finalizar o context
        if(processoAgendado != null){
            processoAgendado.cancel(true);
        }
    }

}
