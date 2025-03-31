# Social Midia API

## 📌 Introdução
Esta API foi desenvolvida utilizando Spring Boot para fornecer funcionalidades essenciais de uma rede social. Inclui autenticação, gestão de usuários, postagens e interações.

## 📋 Requisitos
Antes de iniciar, certifique-se de ter os seguintes requisitos instalados:

- **Java 21**
- **Maven**
- **MySQL** ou **H2 Database** (para ambiente de desenvolvimento)
- **Postman** (opcional, para testar requisições HTTP)

## 🚀 Instalação e Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/social-midia-api.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd social-midia-api
   ```
3. Configure o banco de dados em `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/social_midia_db
   spring.datasource.username=root
   spring.datasource.password=seu_password
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

## 🔗 Documentação da API (Swagger)
A documentação da API pode ser acessada via:
```
http://localhost:8080/swagger-ui/index.html
```

## 🔥 Endpoints Principais

### Autenticação
- `POST /auth/login` - Autentica um usuário
- `POST /auth/register` - Registra um novo usuário

### Usuários
- `GET /users/{id}` - Obtém detalhes de um usuário
- `PUT /users/{id}` - Atualiza informações de um usuário
- `DELETE /users/{id}` - Remove um usuário

### Postagens
- `POST /posts` - Cria uma nova postagem
- `GET /posts/{id}` - Obtém detalhes de uma postagem
- `DELETE /posts/{id}` - Remove uma postagem

## 🧪 Testes
Para executar os testes unitários, utilize:
```bash
mvn test
```

## 🤝 Contribuição
Pull requests são bem-vindos! Para grandes alterações, abra uma issue primeiro para discutir o que deseja modificar.

## 📜 Licença
Este projeto está sob a MIT License - veja o arquivo `LICENSE` para mais detalhes.

