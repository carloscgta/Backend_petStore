package br.com.pestore.steps;

import com.google.gson.Gson;

import br.com.pestore.pojos.Pet;
import br.com.pestore.servicos.Autenticacao;
import br.com.pestore.servicos.Resposta;
import br.com.pestore.servicos.Servicos;
import br.com.pestore.utils.YamlHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class criarPetSteps {

	
	Gson gson = new Gson();
	
	Autenticacao autenticacao = new Autenticacao();
	YamlHelper yaml = new YamlHelper();
	Pet pet = new Pet();
	Servicos verbos = new Servicos();
	Resposta resposta;
	Scenario scen;	

	@Before(value = "@ralizarLogin")
	public void before(Scenario cenario) throws Exception {
		
		
	}

	@Given("^que tenho disponinvel o servivo pet$")
	public void que_tenho_disponinvel_o_servivo_pet() throws Throwable {
	    
		
	}

	@Given("^faco uma chamada no endpoint \"([^\"]*)\" com os dados  (\\d+) (\\d+) \"([^\"]*)\" com \"([^\"]*)\" \"([^\"]*)\"$")
	public void faco_uma_chamada_no_endpoint_com_os_dados_com(String arg1, int arg2, int arg3, String arg4, String arg5, String arg6) throws Throwable {
	    
		
	}

	@Then("^o servico cria o pet retornando codigo (\\d+)$")
	public void o_servico_cria_o_pet_retornando_codigo(int arg1) throws Throwable {
	   
		
	}
	
	@After(value = "@criarUsuario")
	public void finalizaPDF(Scenario cenario) throws Exception {

		scen = cenario;
	}


}
