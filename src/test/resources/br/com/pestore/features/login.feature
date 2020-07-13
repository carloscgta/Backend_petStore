#Author: carloscgta@gmail.com
#Keywords Summary : Realizar Login e Criar um usuário

@geralLogin
Feature: Login
  				Eu como usuario quero poder realizar login para gerar o ID da sessao

@ralizarLogin
Scenario Outline: realizar Login para gerar ID da sessao
	       Given que eu realizado o login no endpoint "login" com as info "<username>" "<password>"
	       Then a API deve retornar na response codigo 200 com o ID da sessao

Examples:
|username							|password					|
|anamaia2020					|Solrac@89				|
