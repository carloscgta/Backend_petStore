#Author: carloscgta@gmail.com
#Keywords Summary : Realizar Login e Criar um usuário

@geralCriarUsuarios
Feature: Criar usuarios
  				Eu como usuario quero poder acessar o endpoint /user e criar 3 usuarios

@criarUsuario
Scenario Outline: Criar usuario
	       Given que eu acesse o endpoint da aplicacao "login" para o cadastro de usuario "<username>" "<firstname>" com "<lastname>" "<email>"  "<password>" "<phone>"
	       Then a API me retorna o status code 200 para o cadastro

Examples:
|username							|firstname 	|lastname			|email													|password					|phone								|
|anamaia2020					|Ana 			 	|Maia 				|anamaia2020@gmail.com					|Solrac@89				|11930035119 					|
|rodrigomendes2020		|Rodrigo 		|Mendes 			|rodrigomendes2020@gmail.com		|Solrac@89				|11930035119					|
|tatianavasconcelos		|Tatiana 		|Vasconcelos 	|tatianavasconcelos@gmail.com		|Solrac@89				|11930035119					|
