package app.servlets;

import app.entities.User;
import app.model.Model;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class AddServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // создал объект, с помощью которого я хочу передать управление jsp.
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        // передача управления в эту jsp страницу. Не забывать вложить в него объекты req и resp
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");
        int age = Integer.parseInt(req.getParameter("age"));
        Model.add(firstName, lastName, password,age);
        req.setAttribute ("initials", new String (firstName + " "+lastName));
        doGet(req, resp);




//        Model model = Model.getInstance();
//        model.add(user);
//        req.setAttribute("userName",user.getName());
        doGet(req,resp);
    }
}
