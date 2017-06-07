package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TemplateServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter pw = resp.getWriter();
        
        pw.write(answer(req.getParameter("template")));
        
        pw.close();
    }
    
    
    String answer(String parameter) {
        
        return "team name " + (parameter != null ? parameter : "no param");
    }
}
