package br.com.pestore.steps;

import com.google.gson.Gson;

import br.com.pestore.core.PDFGenerator;
import br.com.pestore.pojos.Login;
import br.com.pestore.servicos.Autenticacao;
import br.com.pestore.servicos.Resposta;
import br.com.pestore.servicos.Servicos;
import br.com.pestore.utils.YamlHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LoginSteps {
	
	
	Gson gson = new Gson();
	PDFGenerator pdfgenerator = new PDFGenerator();
	Autenticacao autenticacao = new Autenticacao();
	YamlHelper yaml = new YamlHelper();
	Login login = new Login();
	Servicos verbos = new Servicos();
	Resposta resposta;
	Scenario scen;	

	@Before(value = "@ralizarLogin")
	public void before(Scenario cenario) throws Exception {
		pdfgenerator.iniciaPDF(cenario);
	}
	
	


	@After(value = "@ralizarLogin")
	public void finalizaPDF(Scenario cenario) throws Exception {

		scen = cenario;
		pdfgenerator.fechaPDF(scen);

	}

}
