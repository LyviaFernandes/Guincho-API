# 🚗 Guincho API

API REST para gerenciamento de solicitações de guincho, desenvolvida com **Spring Boot**, **JPA/Hibernate** e **MySQL**.

## 📌 Funcionalidades

* Criar solicitações de guincho
* Listar todas as solicitações
* Buscar solicitação por ID
* Atualizar solicitação
* Excluir solicitação

## 🛠️ Tecnologias

* Java 20
* Intellij
* Localhost
* Postman

## 📂 Estrutura do Projeto

```
src/main/java/Lyvia/guincho
│── controller/
│    └── SolicitacaoGuinchoController.java
│── model/
│    └── SolicitacaoGuincho.java
│── repository/
│    └── SolicitacaoGuinchoRepository.java
│── service/
│    └── SolicitacaoGuinchoService.java
│── GuinchoApplication.java
```

## ⚙️ Configuração

No arquivo `application.properties` já estão definidas as configurações padrão:

```properties
spring.application.name=guincho
server.port=8000

spring.datasource.url=jdbc:mysql://localhost:3306/guincho
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> ⚠️ Ajuste `username` e `password` conforme sua instalação do MySQL.

Crie o banco de dados no MySQL antes de rodar a aplicação:

```sql
CREATE DATABASE guincho;
```

## ▶️ Como Rodar

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/guincho.git
cd guincho

# Compilar e rodar
mvn spring-boot:run
```

A aplicação estará disponível em:
👉 `http://localhost:8000`

## 📖 Endpoints

### 🔹 Listar todas as solicitações

```
GET /guincho
```

### 🔹 Buscar por ID

```
GET /guincho/{id}
```

### 🔹 Criar solicitação

```
POST /guincho
Content-Type: application/json
```

Body:

```json
{
  "placaVeiculo": "ABC1234",
  "nomeCliente": "João Silva",
  "telefone": "11999999999",
  "endereco": "Av. Paulista, 1000",
  "cidade": "São Paulo"
}
```

### 🔹 Atualizar solicitação

```
PUT /guincho/{id}
Content-Type: application/json
```

Body:

```json
{
  "placaVeiculo": "XYZ9876",
  "nomeCliente": "Maria Oliveira",
  "telefone": "11988888888",
  "endereco": "Rua das Flores, 500",
  "cidade": "Campinas"
}
```

### 🔹 Deletar solicitação

```
DELETE /guincho/{id}
```

---

## ✅ Testes

O projeto já possui a classe de testes `GuinchoApplicationTests.java` para validar a inicialização da aplicação.

---

📌 Agora é só salvar esse conteúdo em um arquivo chamado **`README.md`** na raiz do projeto.

---

Quer que eu já monte esse `README.md` como **arquivo pronto** pra você baixar e colocar direto no repositório?

