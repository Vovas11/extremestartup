package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter pw = resp.getWriter();
        
        pw.write(answer(req.getParameter("q")));
        
        pw.close();
    }
    
    
    String answer(String parameter) {
        if (parameter == null) return "team name";
        Matcher additionMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(parameter);
        if (additionMatcher.matches()) {
            return String.valueOf(Integer.parseInt(additionMatcher.group(1))
                    + Integer.parseInt(additionMatcher.group(2)));
        }
        return "team name";
    }
}
