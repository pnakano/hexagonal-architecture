# Curso - Arquitetura Hexagonal

## Descrição
Projeto desenvolvido durante o curso " Arquitetura Hexagonal/Ports and Adapters na prática" de Danilo Arantes.

O objetivo do projeto é fazer uma demonstração prática da arquitetura hexagonal, definindo a estrutura do projeto de forma que a regra de negócio fique o mais desacoplada possível, evitando inclusive o uso de frameworks e plugins como Spring e Lombok. Dessa forma, a comunicação é realizada através das Ports (interfaces) de entrada e saída. 

Esse projeto também aplica o princípio de responsabilidade única do SOLID, isolando cada processo em seu próprio conjunto de UseCase/Ports/Adapters, e utiliza ArchUnit para realizar testes unitários que validem o padrão da arquitetura do projeto. 

<p><img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&amp;logo=spring&amp;logoColor=white" alt="shields"><img src="https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white" alt="shields"><img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&amp;logo=docker&amp;logoColor=white" alt="shields"><img src="https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka" alt="shields"></p>

### Conteúdo do curso

- Conceitos de arquitetura hexagonal
- Criação de uma aplicação seguindo os padrões da arquitetura hexagonal
- Consulta de diferentes microserviços mockados via wiremock
- Utilização de Docker para criação do ambiente da aplicação (wiremock para simular o serviço de consulta de CEP, kafka para mensageria e mongodb para persistência de dados)
- Criação de testes unitário com ArchUnit para validação do padrão de arquitetura 

## Requisitos

- [JDK 17](https://www.oracle.com/br/java/technologies/javase/jdk17-archive-downloads.html)
- [Docker](https://hub.docker.com/)

## Build

Criação dos containers de banco de dados do mongodb, kafka e wiremock

```shell
docker compose up -d
```

## Run

`com.pamelanakano.hexagonal_architecture.HexagonalArchitectureApplication`


## Links

* [UDEMY | Arquitetura Hexagonal/Ports and Adapters NA PRÁTICA](https://www.udemy.com/course/arquitetura-hexagonal-ou-ports-and-adapters-na-pratica/)