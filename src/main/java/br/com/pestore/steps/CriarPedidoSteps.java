package br.com.pestore.steps;

import java.util.List;
import java.util.Map;

import org.apache.http.HttpStatus;
import org.junit.Assert;

import com.google.gson.Gson;


import br.com.pestore.pojos.Category;
import br.com.pestore.pojos.Order;
import br.com.pestore.pojos.Pet;
import br.com.pestore.servicos.Autenticacao;
import br.com.pestore.servicos.Resposta;
import br.com.pestore.servicos.Servicos;
import br.com.pestore.utils.YamlHelper;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CriarPedidoSteps {

Gson gson = new Gson();
	
	Autenticacao autenticacao = new Autenticacao();
	YamlHelper yaml = new YamlHelper();
	Pet pet = new Pet();
	Order order = new Order();
	Category categoryPet = new Category();
	Servicos verbos = new Servicos();
	Resposta resposta;
	Resposta respostaPedido;
	Scenario scen;	
	
	int idPetCriado;
	int idPedidoCriado;

	@Before(value = "@criarPedidoNaLoja")
	public void before(Scenario cenario) throws Exception {
		
		
	}
	
	@Given("^eu crio um pet com os dados:$")
	public void eu_crio_um_pet_com_os_dados(DataTable Pets) throws Throwable {
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
		List<Map<String, String>> listPetsDados = Pets.asMaps(String.class, String.class);

		for(int i=0; i<listPetsDados.size(); i++) {
			System.out.println(listPetsDados.get(i));
			
			int id = Integer.parseInt(listPetsDados.get(i).get("id"));
			pet.setId(id);
			int categoryId = Integer.parseInt(listPetsDados.get(i).get("categoryId"));
			categoryPet.setId(categoryId);
			
		    categoryPet.setName(listPetsDados.get(i).get("categoryId"));
			pet.setCategory(categoryPet);
			
			pet.setName(listPetsDados.get(i).get("name"));
			pet.setStatus(listPetsDados.get(i).get("status"));
			String json = gson.toJson(pet);
			resposta = verbos.postEndPoint("https://petstore.swagger.io/v2/pet", json);
			
			idPetCriado= Integer.parseInt(resposta.salvarObjetosBody("id"));
	
		}
	}

	@Given("^faco a venda desses pets para tres clientes \"([^\"]*)\" com os dados  (\\d+) (\\d+) (\\d+) com \"([^\"]*)\" \"([^\"]*)\"$")
	public void faco_a_venda_desses_pets_para_tres_clientes_com_os_dados_com(String endpointPedido, int id, int petId, int quantity, String status, boolean complete) throws Throwable {
	  
		
		order.setId(id);
		order.setPetId(idPetCriado);
		order.setQuantity(quantity);
		order.setStatus(status);
		order.setComplete(complete);
		
		String json = gson.toJson(order);
		resposta = verbos.postEndPoint("https://petstore.swagger.io/v2/store/order", json);

		idPedidoCriado= Integer.parseInt(resposta.salvarObjetosBody("id"));
		
		
	}

	@Then("^o pedido e criado e retorna codigo (\\d+)$")
	public void o_pedido_e_criado_e_retorna_codigo(int arg1) throws Throwable {
	  
		String idPedido = Integer.toString(idPedidoCriado);
			System.out.println("https://petstore.swagger.io/v2/store/order/"+idPedido);
			respostaPedido = verbos.getEndPoint("https://petstore.swagger.io/v2/store/order/"+idPedido);
			
				
			
			
	}
	
	
	
	@After(value = "@criarPedidoNaLoja")
	public void finalizaPDF(Scenario cenario) throws Exception {

		scen = cenario;
	}

	
	
}
