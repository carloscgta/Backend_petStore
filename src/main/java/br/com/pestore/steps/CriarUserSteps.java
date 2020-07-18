package br.com.pestore.steps;

import com.google.gson.Gson;


import br.com.pestore.pojos.Login;
import br.com.pestore.pojos.User;
import br.com.pestore.servicos.Autenticacao;
import br.com.pestore.servicos.Resposta;
import br.com.pestore.servicos.Servicos;
import br.com.pestore.utils.YamlHelper;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CriarUserSteps {

	public CriarUserSteps() {
		// TODO Auto-generated constructor stub
	}
	
	Gson gson = new Gson();
	Autenticacao autenticacao = new Autenticacao();
	YamlHelper yaml = new YamlHelper();
	Login login = new Login();
	User user = new User();
	Servicos verbos = new Servicos();
	Resposta resposta;
	Scenario scen;	

	@Before(value = "@criarUsuario")
	public void before(Scenario cenario) throws Exception {
		
	}
																							
	@Given("^que eu acesse o endpoint da aplicacao \"([^\"]*)\" para o cadastro de usuario (\\d+) \"([^\"]*)\" \"([^\"]*)\" com \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" (\\d+)$")
	public void que_eu_acesse_o_endpoint_da_aplicacao_para_o_cadastro_de_usuario_com(String userEndpoint, int id, String username, String firstname, String lastname, String email, String password, String phone, int userStatus) throws Throwable {
	    
		Integer n = Integer.valueOf(id);
		user.setId(id);
		user.setUsername(username);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setUserStatus(userStatus);
		String json = gson.toJson(user);
		resposta = verbos.postEndPoint("https://petstore.swagger.io/v2/user", json);
		// IdUser

	}
	
	
	
	@Then("^a API me retorna o status code (\\d+)$")
	public void a_API_me_retorna_o_status_code(int statusCode) throws Throwable {
		String texto = Integer.toString(resposta.getResponse().getStatusCode());
		System.out.println("O status code retornando é: "+ texto);
		resposta.getResposta().statusCode(statusCode);
		
		
	}

	
	
	@After(value = "@criarUsuario")
	public void finalizaPDF(Scenario cenario) throws Exception {

		scen = cenario;
		

	}

}
