# Desafio TDD

Este projeto foi desenvolvido como um desafio de TDD, utilizando o Spring Boot e o framework de testes JUnit. O objetivo do desafio era implementar testes automatizados para duas classes de controle: `CityController` e `EventController`, utilizando o padrão de desenvolvimento de software TDD (Desenvolvimento Orientado por Testes).

## CityController

A classe `CityController` é responsável por gerenciar as operações relacionadas às cidades, como listar, inserir e excluir. Foram implementados testes automatizados para as seguintes operações:

- `findAll`: deve retornar todas as cidades ordenadas pelo nome
- `insert`: deve inserir uma nova cidade
- `delete`: deve excluir uma cidade que não possua eventos associados e deve retornar um erro para cidades que possuam eventos associados.

## EventController

A classe `EventController` é responsável por gerenciar as operações relacionadas aos eventos, como listar, inserir e atualizar. Foram implementados testes automatizados para as seguintes operações:

- `update`: deve atualizar um evento existente, quando o ID informado existir
- `update`: deve retornar um erro quando o ID informado não existir

## Tecnologias

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- Java 11
- Spring Boot
- JUnit
- Mockito
