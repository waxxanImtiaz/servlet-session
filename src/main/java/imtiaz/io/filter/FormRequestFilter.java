package imtiaz.io.filter;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FormRequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initiated");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("Filter is executed");
        System.out.println("Filter executed");

        String name = servletRequest.getParameter("name");

        if (!name.equalsIgnoreCase("Imtiaz Ali")){
            printWriter.println("Invalid username");
        }
        else
            filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroyed");
    }
}
