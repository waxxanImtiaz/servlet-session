package imtiaz.io;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormControllerServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");

        PrintWriter printWriter = servletResponse.getWriter();


        printWriter.println("<h1>This is FormControllerServlet</h1>");
        printWriter.println("<h2>");
        printWriter.print("Your name is ");
        printWriter.print(name);
        printWriter.println();
        printWriter.print("Your email is ");
        printWriter.print(email);
        printWriter.print("</h1>");



    }
}
