package br.com.pestore.servicos;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

//given().cookie("session_id", "1234").when().get("/users/eugenp")
//.then().statusCode(200);



public class Servicos implements ServicosImpl {

	private Response resposta;
	
	public Servicos() {
		// TODO Auto-generated constructor stub
	}

	//Created by Carlos Almeida 13/07
		public Resposta getEndPointComParametros(String endPoint, String username, String password) {
			resposta =	given().params("username",username,"password", password).when().log().all().get(endPoint);
			return new Resposta(resposta);
		}
		
	@Override
	public Resposta getEndPoint(String endPoint) {
		resposta = given().contentType("application/json").when().log().all().post(endPoint);
		return new Resposta(resposta);
	}

	@Override
	public br.com.pestore.servicos.Resposta postEndPoint(String endPoint, Object mensagem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public br.com.pestore.servicos.Resposta putEndPoint(String endPoint, Object mensagem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public br.com.pestore.servicos.Resposta deleteEndpoint(String endPoint) {
		// TODO Auto-generated method stub
		return null;
	}

}
