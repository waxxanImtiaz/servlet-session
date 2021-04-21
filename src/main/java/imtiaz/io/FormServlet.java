package imtiaz.io;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("This is servlet init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter out = servletResponse.getWriter();

        out.println("<h1>This is Imtiaz Ali </h1>");
    }

    @Override
    public String getServletInfo() {
        return "This is FormServlet";
    }

    @Override
    public void destroy() {
        System.out.println("Servlet is destroyed");
    }
}
