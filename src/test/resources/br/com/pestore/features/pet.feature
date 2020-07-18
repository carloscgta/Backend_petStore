#Author: carloscgta@gmail.com
#Keywords Summary : Realizar Login e Criar um usuário


@geralCriarPet
Feature: Criar um Pet

  @criarPet
  Scenario Outline: Criar um Pet
    Given que tenho disponinvel o servivo pet
    And faco uma chamada no endpoint "pet" com os dados  <id> <categoryId> "<categoryName>" com "<name>" "<status>" 
    Then o servico cria o pet retornando codigo 200

    Examples: 
      | id  | categoryId 	| categoryName  		| name	  	| status 		 		|
      | 500 |     5			 	| dog 							| Snoopy  	| available		  |
      | 600 |     7 			| galgo   		 			| Bichento  | available  		|
      | 700 |     8 			| viraLata    			| Bichento  | available  		|
      
      
      
