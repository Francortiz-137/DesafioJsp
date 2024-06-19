package cl.praxis.desafiojsp.servlet;

import cl.praxis.desafiojsp.utiles.UtilesGeneral;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "factorialServlet",value = "/factorial")
public class FactorialServlet extends HttpServlet {
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FactorialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    /**
     * @see HttpServlet#doGet(HttpServletRequest request,
            HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {

        int num = Integer.parseInt(request.getParameter("num"));

        UtilesGeneral utilesgeneral = new UtilesGeneral();
        int factorial = utilesgeneral.getFactorial(num);

        String message = "Factorial de " + num + " es: " + factorial;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request,
            HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void destroy() {
    }
}