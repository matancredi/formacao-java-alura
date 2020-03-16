package br.com.casadocodigo.loja.infra;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileSaver {
	
	@Autowired
	private HttpServletRequest request;

	public String write(String baseFolder, MultipartFile file) {
		try {
			String realPath = request.getServletContext().getRealPath("/"+baseFolder);
			
			//O arquivo vai ser gravado no realPath
			String path = realPath + "/" + file.getOriginalFilename();
			file.transferTo(new File(path));
			
			//Mas o caminho a ser gravado no objeto produto pode ser a partir da baseFolder
			return baseFolder + "/" + file.getOriginalFilename();

		} catch (IllegalStateException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
