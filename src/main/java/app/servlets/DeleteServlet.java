package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("views/delete.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("deleteN");
        String userPassword = req.getParameter("deleteP");
        User user = new User(userName, userPassword);
        Model m = Model.getInstance();
        req.setAttribute("answer", m.delete(user));
        RequestDispatcher rd = req.getRequestDispatcher("views/delete.jsp");
        rd.forward(req,resp);
    }
}
