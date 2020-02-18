package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.service(req, resp);
		System.out.println("Cadastrando nova empresa");
		// Obs.: Método getParameter sempre retorna uma string
		String nomeEmpresa = req.getParameter("nome");
		String dataEmpresa = req.getParameter("data");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat prov = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = prov.parse(dataEmpresa);
		} catch(Exception e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// Gera uma nova requisição
		return "redirect:entrada?acao=ListaEmpresas";
		
//		//chamar o JSP
//		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
//		req.setAttribute("empresa", empresa.getNome());
//		rd.forward(req, resp);
		
		// PrintWriter out = resp.getWriter();
        // out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
	}
	
}
