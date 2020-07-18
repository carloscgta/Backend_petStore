#Author: carloscgta@gmail.com
#Keywords Summary : Realizar Login e Criar um usuário

@geralCriarUsuarios
Feature: Criar usuarios
  				

@criarUsuario
Scenario Outline: Criar usuario
	       Given que eu acesse o endpoint da aplicacao "user" para o cadastro de usuario <id> "<username>" "<firstname>" com "<lastname>" "<email>"  "<password>" "<phone>" <userStatus>
	       Then a API me retorna o status code 200
Examples:
|id			|username							|firstname 	|lastname			|email													|password					|phone								|userStatus								|
|5			|anamaia2020					|Ana 			 	|Maia 				|anamaia2020@gmail.com					|Solrac@89				|11930035119 					|		1				|
|6			|rodrigomendes2020		|Rodrigo 		|Mendes 			|rodrigomendes2020@gmail.com		|Solrac@89				|11930035119					|	1					|
|7			|tatianavasconcelos		|Tatiana 		|Vasconcelos 	|tatianavasconcelos@gmail.com		|Solrac@89				|11930035119					|1						|


#
#@criarUsuarioPassandoJSON
#Scenario: Criar usuario Passando o JSON
#	       Given que faco uma chamada no endpoint da aplicacao "user" passando o json:
#	      """ JSON 
#	      { 
#			    "id": 2, 
#			    "username": "anamaia2028",
#			    "firstName": "Ana",
#			    "lastName": "Maia",
#			    "email": "anamaia2028@gmail.com",
#			    "password": "Solrac@89",
#			    "phone": "11930035118"
#			    
    #		} 	
    #	"""
#	       Then o servico cria o usuario retornando status code 200
	       
	       