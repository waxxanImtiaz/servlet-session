package imtiaz.io;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionFormController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        HttpSession session = req.getSession();

        session.getAttribute("");
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        PrintWriter printWriter = resp.getWriter();


        printWriter.println("<h1>This is SessionFormController</h1>");
        printWriter.println("<h2>");
        printWriter.print("Your name is ");
        printWriter.print(name);
        printWriter.println();
        printWriter.print("Your email is ");
        printWriter.print(email);
        printWriter.print("</h1>");
    }
}
