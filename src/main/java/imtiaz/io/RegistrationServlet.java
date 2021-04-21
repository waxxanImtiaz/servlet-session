package imtiaz.io;

import sun.plugin.com.Dispatch;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        PrintWriter printWriter = servletResponse.getWriter();

        RequestDispatcher requestDispatcher =  servletRequest.getRequestDispatcher("formcontroller");

        requestDispatcher.forward(servletRequest,servletResponse);


        printWriter.println("This text is from RegistrationServlet");


        System.out.println("This is imtiaz ali");

    }
}
