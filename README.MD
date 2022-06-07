# Lojinha API Automação

Esse é um repositório que contém a automação de alguns testes de API Rest de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- Java
  https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html
- JUnit
  https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.0-M1
- RestAssured
  https://mvnrepository.com/artifact/io.rest-assured/rest-assured/5.1.0
- Maven
  https://maven.apache.org/

## Testes Automatizados

Testes para validar as partições de equivalência relacionadas ao valor do produto na Lojinha, que estão vinculadas diretamente na regra de negócio que diz que o valor do produto deve estar entre R$0,01 e R$7000,00.

## Notas Gerais

- Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
- Armazenamos os dados que dão enviados para a API através do uso de classes POJO.
- Criamos dados iniciais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmos.
- Nesse projeto fazemos uso do JUnit 5, o que nos dá a possibilidade de usar a anotação DisplayName para dar descrições em português para nossos testes.


