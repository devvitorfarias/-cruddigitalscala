📖 Sobre o Desafio

Você foi desafiado a construir uma API RESTful para gerenciar produtos em um sistema de vendas online. Sua missão é implementar operações CRUD (Create, Read, Update, Delete) para a entidade "Product".

🎯 Objetivos

Criar uma API para manipulação de produtos.

Utilizar qualquer framework Java (Spring Boot, Quarkus, Micronaut, etc.).

Usar qualquer IDE e ferramentas para testar as requisições.

Garantir que as respostas estejam em formato JSON.

📌 Funcionalidades da API

1️⃣ Criar um novo produto

Endpoint: POST /api/productos

Corpo da requisição (JSON):

{
  "id": 1,
  "name": "T-shirt",
  "price": 19.99,
  "description": "Cotton T-shirt"
}

2️⃣ Listar todos os produtos

Endpoint: GET /api/productos

3️⃣ Buscar um produto pelo ID

Endpoint: GET /api/productos/{id}

Exemplo: GET /api/productos/1

4️⃣ Atualizar um produto existente

Endpoint: PUT /api/productos/{id}

Corpo da requisição (JSON):

{
  "id": 1,
  "name": "Updated T-shirt",
  "price": 25.99,
  "description": "Cotton T-shirt updated"
}

5️⃣ Excluir um produto

Endpoint: DELETE /api/productos/{id}

Exemplo: DELETE /api/productos/1

