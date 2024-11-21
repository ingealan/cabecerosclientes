package controlador;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelos.Clientes;
import servicios.ClientesServices;
import servicios.ClientesServiceImplement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet({"/clientes.pdf", "/clienteshtml"})
public class Clientespdf extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClientesServices service = new ClientesServiceImplement();

        boolean conPDF = req.getServletPath().endsWith(".pdf");
        if (conPDF) {
            // Si la URL es para PDF, generamos el PDF
            resp.setContentType("application/pdf");
            resp.setHeader("Content-Disposition", "attachment; filename=clientes.pdf");

        }

        resp.setContentType("text/html;charset=UTF-8");
        List<Clientes> clientes = service.listar();  // Aquí obtienes los clientes
        try (PrintWriter out = resp.getWriter()) {
            out.print("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Listar Clientes</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p><a href=\"clientes.pdf\">Descargar PDF de Clientes</a></p>\n");
            out.println("<h1>Lista de Clientes</h1>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>ID CLIENTE</th>");
            out.println("<th>NOMBRE</th>");
            out.println("<th>DIRECCIÓN</th>");
            out.println("<th>TIPO DOCUMENTO</th>");
            out.println("<th>NÚMERO DOCUMENTO</th>");
            out.println("</tr>");

            // Recorremos la lista de clientes y mostramos cada uno en una fila de la tabla
            for (Clientes c : clientes) {
                out.println("<tr>");
                out.println("<td>" + c.getIdCliente() + "</td>");
                out.println("<td>" + c.getNombre() + "</td>");
                out.println("<td>" + c.getDireccion() + "</td>");
                out.println("<td>" + c.getTipoDocumento() + "</td>");
                out.println("<td>" + c.getNumeroDocumento() + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        }
    }
}