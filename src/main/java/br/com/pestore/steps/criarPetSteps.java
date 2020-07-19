package br.com.pestore.steps;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;

import com.google.gson.Gson;


import br.com.pestore.pojos.Category;
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
	Category categoryPet = new Category();
	Servicos verbos = new Servicos();
	Resposta resposta;
	Scenario scen;	
	
	

	@Before(value = "@criarPet")
	public void before(Scenario cenario) throws Exception {
		
		
		
	}

	@Given("^que tenho disponinvel o servivo pet$")
	public void que_tenho_disponinvel_o_servivo_pet() throws Throwable {
	    
		
	}

	@Given("^faco uma chamada no endpoint \"([^\"]*)\" com os dados  (\\d+) (\\d+) \"([^\"]*)\" com \"([^\"]*)\" \"([^\"]*)\"$")
	public void faco_uma_chamada_no_endpoint_com_os_dados_com(String endpointPet, int id, int categoryId, String categoryName, String name, String status) throws Throwable {
	    categoryPet.setId(categoryId);
	    categoryPet.setName(categoryName);
		pet.setCategory(categoryPet);
		pet.setId(id);
		pet.setName(name);
		pet.setStatus(status);
		String json = gson.toJson(pet);
		resposta = verbos.postEndPoint("https://petstore.swagger.io/v2/pet", json);
		
		
	}

	@Then("^o servico cria o pet retornando codigo (\\d+)$")
	public void o_servico_cria_o_pet_retornando_codigo(int statusCode) throws Throwable {
	                                  
	String texto = Integer.toString(resposta.getResponse().getStatusCode());    
	
	System.out.println("O status code retornando é: "+ texto);
	resposta.getResposta().statusCode(HttpStatus.SC_OK);
	
		
	}
	
	@After(value = "@criarPet")
	public void finalizaPDF(Scenario cenario) throws Exception {

		scen = cenario;
	}


}
