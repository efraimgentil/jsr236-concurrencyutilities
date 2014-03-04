package br.com.efraimgentil.concurrency.servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efraimgentil.concurrency.background.ImprimirNoConsoleRunnable;

/**
 * 
 * @author Efraim Gentil (efraim.gentil@gmail.com)
 */
@WebServlet("/inicia-thread")
public class ImprimirNoConsoleServlet extends HttpServlet {

    private static final long serialVersionUID = -5912094867653361412L;
    
    @Resource
    private ManagedExecutorService executorService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String texto = req.getParameter("texto");
        Integer vezes = Integer.parseInt( req.getParameter("vezes") );
        ImprimirNoConsoleRunnable dizMeuNome = new ImprimirNoConsoleRunnable( texto ,  vezes );
        executorService.submit( dizMeuNome );
        
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
    
}
