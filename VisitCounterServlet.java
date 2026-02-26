import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitCounterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int visitCount = 0;

        // Get existing cookies
        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                }
            }
        }

        // Increment count
        visitCount++;

        // Create/Update cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(60 * 60 * 24); // 1 day
        res.addCookie(visitCookie);

        out.println("<h2>You visited this page " + visitCount + " times</h2>");
    }
}