package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasSerlvet
 */
@WebServlet(urlPatterns = {"/listaEmpresas", "/empresas"})
public class ListaEmpresasSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		ArrayList<Empresa> lista = banco.getEmpresas();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		 out.println("<html><body>");
//	        out.println("<ul>");
//	        for (Empresa empresa : lista) { 
//	            out.println("<li>" + empresa.getNome() + "</li>");
//	        }        
//	        out.println("</ul>");
//	        out.println("</body></html>");
	}

}
