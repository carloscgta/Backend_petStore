package br.com.pestore.servicos;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class Autenticacao {

	private Response resposta;

	public Autenticacao() {
		// TODO Auto-generated constructor stub
	}

	public Resposta login(String endPoint, Object mensagem) {

		resposta = given().contentType("application/json").body(mensagem).when().log().all().post(endPoint);
		return new Resposta(resposta);

	}
}
