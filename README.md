# Prisma-Flow

---
## 🚀 Guia de Desenvolvimento Local

### 📦 Requisitos

- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Java 24](https://adoptium.net/)
- [Apache Maven 3.8+](https://maven.apache.org/)

Verifique se as ferramentas estão corretamente instaladas com os comandos:

```bash
docker-compose --version
docker --version
java -version
mvn -version
```

---

### 🐳 Subindo os serviços com Docker Compose

1. Certifique-se de estar na raiz do projeto.
2. Execute o comando abaixo para iniciar os containers:

```bash
docker-compose up -d
```

3. Isso irá subir dois serviços: 
* `mongo`: o banco de dados MongoDB 
* `mongo-express`: uma interface web para visualizar e manipular dados do MongoDB

### 🌐 Acessando o MongoDB Express
Após os containers estarem ativos, acesse:

http://localhost:8081

* Usuário: `admin`
* Senha: `pass`

> ⚠️ A primeira vez pode demorar alguns segundos até estar acessível. Se necessário, atualize a página após alguns instantes.
---
## ⚙️ Buildando e Executando a Aplicação (Maven)
É possível compilar e rodar o projeto sem necessidade de uma IDE.

### 🔨 Build do projeto
Para compilar o projeto e gerar o arquivo .jar, execute:

```bash
mvn clean package
```
Isso irá gerar o arquivo .jar do seu projeto dentro da pasta target, como:

```bash
target/prismaflow-0.0.1-SNAPSHOT.jar
```

### 🚀 Rodando a aplicação
Para rodar a aplicação localmente, execute o comando abaixo:

```bash
java -jar target/prismaflow-0.0.1-SNAPSHOT.jar
```
A aplicação será iniciada na porta 8080 (ou conforme configurado no application.yaml).

---