# ZeGota - Validação de Dados

## Sobre o Projeto

O **ZeGota** é um projeto desenvolvido em Java utilizando o framework Spring Boot, com foco na implementação e utilização de validações de dados em aplicações back-end.

O projeto utiliza recursos do Spring Validation para garantir que as informações recebidas pela aplicação atendam aos critérios definidos antes de serem processadas ou armazenadas no banco de dados.

A aplicação também utiliza Spring Data JPA para a persistência de dados e MySQL como sistema de gerenciamento de banco de dados.

## Tecnologias Utilizadas

As principais tecnologias e ferramentas utilizadas no desenvolvimento do projeto são:

- **Java 25:** linguagem de programação utilizada no desenvolvimento da aplicação.
- **Spring Boot 4.2.0:** framework responsável pela configuração e estruturação do projeto.
- **Spring Validation:** biblioteca utilizada para implementar validações nos dados recebidos pela aplicação.
- **Spring Data JPA:** ferramenta utilizada para facilitar a comunicação entre a aplicação e o banco de dados.
- **MySQL:** sistema de gerenciamento de banco de dados relacional.
- **Maven:** ferramenta responsável pelo gerenciamento de dependências e pela construção do projeto.

## Funcionalidades e Recursos

O projeto utiliza recursos que auxiliam no desenvolvimento de uma aplicação back-end organizada e segura.

Entre os principais recursos utilizados estão:

- Validação de dados de entrada por meio do Spring Validation.
- Integração com banco de dados relacional utilizando MySQL.
- Persistência de informações por meio do Spring Data JPA.
- Desenvolvimento de aplicações web utilizando Spring Boot.
- Gerenciamento de dependências e execução por meio do Maven.

## Estrutura do Projeto

O projeto segue a estrutura padrão de uma aplicação Spring Boot com Maven.

## Estrutura do Projeto

O projeto está organizado seguindo a estrutura padrão de uma aplicação Spring Boot, separando as responsabilidades em pacotes específicos para facilitar a manutenção e a organização do código.

```text
ZeGota/
│
├── .idea/
│
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/dt2/zegota/
│   │   │       ├── controller/
│   │   │       │   └── UserController.java
│   │   │       │
│   │   │       ├── entities/
│   │   │       │   └── User.java
│   │   │       │
│   │   │       ├── repositories/
│   │   │       │   └── UserRepository.java
│   │   │       │
│   │   │       └── ZeGotaApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/dt2/zegota/
│               └── ZeGotaApplicationTests.java
│
├── target/
│
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

### Descrição dos Diretórios e Arquivos

**Pacote controller**

- `UserController.java`: responsável por receber e controlar as requisições relacionadas às operações de usuário, fazendo a comunicação entre as requisições e as demais camadas da aplicação.

**Pacote entities**

- `User.java`: representa a entidade User, responsável por definir a estrutura dos dados de usuário que serão utilizados pela aplicação.

**Pacote repositories**

- `UserRepository.java`: responsável pela comunicação com o banco de dados e pelas operações de persistência relacionadas à entidade User, utilizando os recursos do Spring Data JPA.

**Classe principal**

- `ZeGotaApplication.java`: classe responsável por iniciar a aplicação Spring Boot.

**Pasta resources**

- `static/`: destinada ao armazenamento de arquivos estáticos, como CSS, JavaScript e imagens.
- `templates/`: destinada ao armazenamento de arquivos de templates utilizados pela aplicação.
- `application.properties`: arquivo responsável pelas configurações da aplicação, incluindo as propriedades de conexão com o banco de dados.

**Pasta test**

- `ZeGotaApplicationTests.java`: contém os testes automatizados relacionados à aplicação.

**Arquivos de configuração**

- `pom.xml`: responsável pelo gerenciamento das dependências e configurações do Maven.
- `.gitignore`: define os arquivos e diretórios que não devem ser enviados ao Git.
- `mvnw` e `mvnw.cmd`: permitem executar comandos Maven sem exigir uma instalação global do Maven.
- `.gitattributes`: define atributos específicos para os arquivos do repositório.
- `HELP.md`: arquivo com informações de apoio sobre o projeto.

### Descrição das Pastas e Arquivos

- **src/main/java:** contém os arquivos Java responsáveis pela implementação da aplicação.
- **src/main/resources:** armazena os arquivos de configuração e outros recursos utilizados pelo sistema.
- **src/test/java:** contém os arquivos destinados à implementação de testes.
- **.mvn/wrapper:** contém os arquivos necessários para utilizar o Maven Wrapper.
- **pom.xml:** arquivo responsável por definir as dependências, versões e configurações do projeto.
- **mvnw:** script utilizado para executar comandos Maven em ambientes Linux e macOS.
- **mvnw.cmd:** script utilizado para executar comandos Maven no Windows.

## Como Executar o Projeto

### 1. Clonar o repositório

Abra o terminal e execute:

```bash
git clone https://github.com/Mirella-Bertoloti/validation.git
```

### 2. Acessar a pasta do projeto

```bash
cd validation
```

### 3. Configurar o banco de dados

Certifique-se de que o MySQL esteja instalado e em execução.

Configure as informações de conexão com o banco de dados no arquivo `application.properties`, localizado em:

```text
src/main/resources/application.properties
```

As configurações devem incluir o endereço do servidor, o nome do banco de dados, o usuário e a senha de acesso.

### 4. Executar a aplicação

No Windows, utilize:

```bash
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS, utilize:

```bash
./mvnw spring-boot:run
```

Após a inicialização, a aplicação estará em execução conforme as configurações definidas no projeto.

## Objetivo do Projeto

O objetivo deste projeto é aplicar conhecimentos relacionados ao desenvolvimento back-end com Java e Spring Boot, explorando principalmente os mecanismos de validação de dados, integração com banco de dados e organização de aplicações utilizando o padrão de desenvolvimento do ecossistema Spring.

O projeto também permite praticar a utilização de dependências, ferramentas de gerenciamento e recursos fundamentais para o desenvolvimento de aplicações Java.
