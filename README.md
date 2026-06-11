# Apex ERP 🚀

API REST funcional desenvolvida para o gerenciamento de produtos de um sistema ERP. O projeto realiza operações essenciais de persistência de dados no banco, servindo como uma base sólida de backend.

## 🛠️ Tecnologias Utilizadas

* **Java** (Linguagem principal)
* **Spring Boot** (Ecossistema para criação da API)
* **Spring Data JPA & Hibernate** (Abstração e gerenciamento do banco de dados)
* **H2 Database** (Banco de dados em memória para testes e persistência)

## 🎯 Funcionalidades

* Cadastro de novos produtos com validação de atributos.
* Consulta e listagem completa dos produtos salvos no banco de dados.
* Estrutura baseada no padrão MVC (Model-Repository-Controller).
* Configuração de CORS ativa (`@CrossOrigin("*")`) pronta para integração com o front-end.
