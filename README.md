# API RESTfull com Spring Boot 3 

* Spring Boot3 e Java 17
* Spring Web MVC
* Spring Data JPA
* Spring Validation
* Spring Hateoas

  Este é um projeto CRUD simples desenvolvido em Java com Spring Boot e utiliza o banco de dados PostgreSQL através do pgAdmin. Abaixo estão as instruções para configurar e executar o projeto, bem como realizar operações CRUD utilizando o Insomnia.

- Configuração do Ambiente

1- Java Development Kit (JDK):
Certifique-se de ter o JDK instalado em sua máquina. Você pode baixar a versão mais recente em OpenJDK.

2- Spring Boot:
O projeto utiliza o framework Spring Boot. Caso não tenha instalado, você pode obtê-lo em Spring Initializer.

3- PostgreSQL e pgAdmin:
Instale o PostgreSQL e o pgAdmin em sua máquina. Crie um banco de dados chamado "crud" no pgAdmin.

- Configuração do Projeto

Clone o repositório para sua máquina local:
git clone https://github.com/andrelessssa/CRUD-Java-Spring_Boot.git

Abra o projeto em sua IDE preferida.
Configure as propriedades do banco de dados no arquivo application.properties:
spring.datasource.url= jdbc:postgresql://localhost:5432/crud
spring.datasource.username= postgres
spring.datasource.password= An0025322
spring.datasource.driver-class-name = org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

Execute o aplicativo Spring Boot.

- Realizando Operações CRUD

Insomnia
O Insomnia é uma ferramenta popular para testar APIs. Caso não tenha instalado. Baixe na página oficial.

Criação de um novo registro:

- Método: POST
URL: http://localhost:8080/produtos

Corpo (JSON):

{
"nome" : "iphone 14",
"valor" : "2850.00"
}

Recuperação de todos os registros:

- Método: GET
URL: http://localhost:8080/produtos

Recuperação de um registro específico:

- Método: GET
URL: http://localhost:8080/produtos/id

Atualização de um registro:

- Método: PUT
URL: http://localhost:8080/produtos/id

Corpo (JSON):

{	
	"nome": "novo Valor",
	"valor": novo Valor
}

Exclusão de um registro:

- Método: DELETE
URL: http://localhost:8080/produtos



