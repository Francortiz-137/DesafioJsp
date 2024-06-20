package cl.praxis.desafiojsp.servlet;

import cl.praxis.desafiojsp.utiles.UtilesGeneral;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "numerosParesServlet",value = "/numerosPares")
public class NumerosParesServlet extends HttpServlet {

    public NumerosParesServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {

        int num = Integer.parseInt(request.getParameter("num"));

        UtilesGeneral utilesgeneral = new UtilesGeneral();
        boolean esPar = utilesgeneral.esPar(num);
        String stringEsPar= esPar? "Par": "Impar";

        String message = "El numero " + num + " es: " + stringEsPar;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void destroy() {
    }
}