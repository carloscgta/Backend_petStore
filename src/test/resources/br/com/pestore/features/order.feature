#Author: carloscgta@gmail.com
#Keywords Summary : Realizar um pedido de um animal na loja


@geral
Feature: Criar um Pet

  @criarPedidoNaLoja
  Scenario Outline: fazer um  pedido na loja
    Given eu crio um pet com os dados:
    	| id  | categoryId 	| categoryName  		| name	  	| status 		 		|	 
      | 500 |     5			 	| dog 							| Snoopy  	| available		  |
      | 600 |     7 			| galgo   		 			| Bichento  | available  		|
      | 700 |     8 			| viraLata    			| Bichento  | available  		|
    And faco a venda desses pets para tres clientes "order" com os dados  <id> <petId> <quantity> com "<status>" "<complete>" 
    Then o pedido e criado e retorna codigo 200

    Examples: 
      | id  | petId			 	| quantity  		| status	  	| complete 		 		|
      | 50 	|     5			 	| 1 						| placed  		| true		  			|
      | 60 	|     7 			| 1   		 			| placed  		| true  					|
      | 70	|     8 			| 1    					| placed		  | true			  		|
