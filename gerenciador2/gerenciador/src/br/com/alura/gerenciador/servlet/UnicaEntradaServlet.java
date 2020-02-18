package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");

		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		String nome;
		
		try {
		    Object obj = Class.forName(nomeDaClasse).newInstance(); 
		    Acao acao = (Acao) obj;
		    nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
//		if (paramAcao.equals("ListaEmpresas")) {
//			
//			ListasEmpresas acao = new ListasEmpresas();
//			nome = acao.executa(request, response);
//			
//		} else if (paramAcao.equals("RemoveEmpresa")) {
//			
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//			
//		} else if (paramAcao.contentEquals("MostraEmpresa")) {
//			
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(request,  response);
//
//		} else if (paramAcao.contentEquals("AlteraEmpresa")) {
//			
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request,  response);
//
//		} else if (paramAcao.contentEquals("NovaEmpresa")) {
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request,  response);
//
//		} else if (paramAcao.equals("NovaEmpresaForm")) {
//
//		    NovaEmpresaForm acao = new NovaEmpresaForm();
//		    nome = acao.executa(request, response);
//		} 
		
		String[] tipoEndereco = nome.split(":");
		if(tipoEndereco[0].equals("forward")) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
		rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
	}

}
