package br.com.pestore.steps;

import com.google.gson.Gson;


import br.com.pestore.pojos.Login;
import br.com.pestore.servicos.Autenticacao;
import br.com.pestore.servicos.Resposta;
import br.com.pestore.servicos.Servicos;
import br.com.pestore.utils.YamlHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
	
	
	Gson gson = new Gson();
	
	Autenticacao autenticacao = new Autenticacao();
	YamlHelper yaml = new YamlHelper();
	Login login = new Login();
	Servicos verbos = new Servicos();
	Resposta resposta;
	Scenario scen;	

	@Before(value = "@ralizarLogin")
	public void before(Scenario cenario) throws Exception {
		
	}
	
	@Given("^que eu realizado o login no endpoint \"([^\"]*)\" com as info \"([^\"]*)\" \"([^\"]*)\"$")
	public void que_eu_realizado_o_login_no_endpoint_com_as_info(String loginEndpoint, String username, String password) throws Throwable {
	 
		
		resposta = verbos.getEndPointComParametros("https://petstore.swagger.io/v2/user/login", username,password);
		
		
	}

	@Then("^a API deve retornar na response codigo (\\d+) com o ID da sessao$")
	public void a_API_deve_retornar_na_response_codigo_com_o_ID_da_sessao(int statusCode) throws Throwable {
	 
		resposta.getResposta().statusCode(statusCode);
		String texto = Integer.toString(resposta.getResponse().getStatusCode());
		

		
	}
	
	@After(value = "@ralizarLogin")
	public void finalizaPDF(Scenario cenario) throws Exception {

		scen = cenario;
		

	}

}
