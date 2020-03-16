package br.com.casadocodigo.loja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.loja.models.Produto;

public class ProdutoValidation implements Validator{
	
//	public boolean valida(Produto produto) {
//		if(produto.getTitulo() == null || produto.getTitulo().isEmpty() ) {
//			return false;
//		}
//		return true;
//	}

	//verifica se o objeto é uma instância da classe ou não
	@Override
	public boolean supports(Class<?> arg0) {
		return Produto.class.isAssignableFrom(arg0);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
		
		Produto produto = (Produto) target;
		if(produto.getPaginas() <= 0) {
			errors.rejectValue("paginas", "field.required");
		}
		
	}
	

}
