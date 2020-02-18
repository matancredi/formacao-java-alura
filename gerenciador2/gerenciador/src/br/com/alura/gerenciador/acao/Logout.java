package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao{
	
//	Quando utilizamos o removeAtribute, nosso objeto HttpSession ainda continua em memória 
//	(o cookie também continua lá). 
//	Já quando usamos o invalidate, ele remove o objeto HttpSession, 
//	todos os objetos associados e também remove o cookie!

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession sessao = req.getSession();
		
		// sessao.removeAttribute("usuarioLogado");
		sessao.invalidate();
		return "redirect:entrada?acao=LoginForm";
		
	}
}
