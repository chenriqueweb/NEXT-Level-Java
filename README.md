# NEXT-Level-Java
NEXT-Level-Java - Projeto de aprendizado

Versã: final

![Badge de Status](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)
<br>
![Badge de Release](https://img.shields.io/github/v/release/chenriqueweb/NEXT-Level-Java?label=Release&style=for-the-badge)
![Badge de Commits](https://img.shields.io/github/last-commit/chenriqueweb/NEXT-Level-Java?label=%C3%9Altimo%20Commit&style=for-the-badge)

![GitHub Org's stars](https://img.shields.io/github/stars/chenriqueweb/NEXT-Level-Java?style=social)

<hr>

## Tópicos 

- [Descrição do projeto](#descricao-do-projeto)

- [Funcionalidades](#funcionalidades)

- [Aplicação](#aplicacao)

- [Ferramentas utilizadas](#ferramentas-utilizadas)

- [Acesso ao projeto](#acesso-ao-projeto)

- [Abrir e rodar o projeto](#abrir-e-rodar-o-projeto)

- [Desenvolvedores](#desenvolvedores)


## Descricao do projeto 
<p align="justify">
 Projeto realizado para o desenvolvimento e estudo prático de uma de pesquisa de rotas de entrega à partir de um determinado CEP.
 
Um dos propósitos principais é possibilitar a capacitação de Desenvolvedores com perfil em Alta Plataforma a realizarem o aprendizado em programação Java com REST e ferramentas de apoio em Baixa Plataforma. 
</p>


### Modelo de Dados
![Proposta](https://user-images.githubusercontent.com/66568299/178820750-9d866687-cc88-4f7f-9cbe-e5de5b6b2599.png)

### Testes das APIs
Para a realização dos testes de chamadas às APIs foi disponibilizado um arquivo JSON para ser importado no Postman.

**/src/main/resources/postman/NEXT-Level_Projeto.postman_collection.json**


## Funcionalidades

:heavy_check_mark: `Funcionalidade 1:` Realizar cadastro de Empresas, Estados, Municipios, Filiais, Micrzonas, Faixas de CEP da Microzona e Rota de Entrega

:heavy_check_mark: `Funcionalidade 2:` Realizar a busca de Filiais próximas ao CEP informado (cliente).
<br>
<br>

## Aplicacao

![consulta-cep-postman-v4](https://user-images.githubusercontent.com/66568299/179292573-a72e89af-e2f0-43e3-b8dc-5ae9ff496f29.png)
<br>
<br>

## Ferramentas utilizadas

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="70" height="60"/> </a> 

<a href="https://www.eclipse.org/downloads/" target="_blank"> <img src="https://bilginc.com/blog/eclipse-nedir.jpg"
alt="java" width="70" height="60"/> </a> 

<a href="https://spring.io/tools" target="_blank"> <img src="https://bgasparotto.com/wp-content/uploads/2017/12/spring-logo.png" 
alt="java" width="70" height="60"/> </a> 

<a href="https://www.postman.com/" target="_blank"> <img src="https://user-images.githubusercontent.com/4249709/29496848-63ad446c-85b1-11e7-904e-a4ddad25e9db.png" 
alt="java" width="100" height="60"/> </a> 
<br>
<br>

## Acesso ao projeto

Você pode [acessar o código fonte do projeto](https://github.com/chenriqueweb/NEXT-Level-Java) ou [baixá-lo](https://https://github.com/chenriqueweb/NEXT-Level-Java/archive/refs/heads/main.zip).
<br>
<br>

## Abrir e rodar o projeto

Após baixar o projeto, você poderá abri-lo com o STS - Eclipse.

**1º) Compilar o projeto**
_mvn clean install_

**2º) Para executar o Projeto**
_cd target_
_java -jar Next-Level-Java.jar_

**IMPORTANTE:**
O projeto esta direcionado para o ambiente de Desenvolvimento, caso deseje outro ambiente você devera
informar um dos outros parâmetro abaixo durante a sua execução

**Homologação:**
_--spring.profiles.active=hml_

**Produção:**
_--spring.profiles.active=prd_
<br>
<br>

## Desenvolvedores

| [<img src="https://avatars.githubusercontent.com/u/66568299?v=4" width=115><br><sub>Carlos Henrique</sub>](https://github.com/chenriqueweb) 
| :---: