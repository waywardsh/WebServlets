package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s")
public class FServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        super.doPost(httpServletRequest, httpServletResponse);
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        httpServletResponse.setContentType("text/html");
        PrintWriter out = httpServletResponse.getWriter();
        out.println("Hello World");
//        String varTextA = "Hello World";
//        httpServletRequest.setAttribute("textA", varTextA);
//        String varTextB = "Its JSP";
//        httpServletRequest.setAttribute("textB", varTextB);
//
//        RequestDispatcher dispatcher = httpServletRequest.getRequestDispatcher("/index.jsp");
//        dispatcher.forward(httpServletRequest,httpServletResponse);
    }
}
