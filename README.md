# Projeto: Gerenciamento de Livros e Leitores

## Descrição
Este projeto em Java simula um sistema de gerenciamento de livros e leitores. Ele permite criar objetos do tipo **Pessoa** e **Livro**, associando cada livro a um leitor específico. O projeto também implementa a interface **Publicacao**, que define métodos para manipulação do estado e das páginas do livro.

## Estrutura do Projeto

### Classes

1. **Main**: 
   - Contém o método `main`, onde são instanciados os objetos **Pessoa** e **Livro**.
   - Exemplo de uso dos métodos implementados, como abrir livros, folhear páginas e exibir detalhes.

2. **Pessoa**:
   - Representa uma pessoa com os atributos:
     - `nome`: Nome da pessoa.
     - `idade`: Idade da pessoa.
     - `sexo`: Gênero da pessoa.
   - Métodos principais:
     - `fazerAniver()`: Incrementa a idade da pessoa.

3. **Livro**:
   - Representa um livro com os atributos:
     - `titulo`, `autor`, `totPaginas`, `pagAtual`, `aberto`, e `leitor` (associado a uma instância de **Pessoa**).
   - Métodos principais:
     - `abrir()`, `fechar()`, `folhear(int p)`, `avançarPag()`, `voltarPag()`, e `detalhes()`.

4. **Publicacao (Interface)**:
   - Define métodos abstratos que devem ser implementados na classe **Livro**:
     - `abrir()`, `fechar()`, `folhear(int p)`, `avançarPag()`, `voltarPag()`, `detalhes()`, `status()`.

## Funcionalidades

- Criar instâncias de **Pessoa** e **Livro**.
- Associar cada livro a um leitor específico.
- Abrir e fechar livros.
- Folhear páginas e avançar ou voltar páginas.
- Exibir os detalhes completos do livro, incluindo informações sobre o leitor associado.

## Tecnologias Utilizadas
- Linguagem: Java
- Paradigma: Programação Orientada a Objetos

## Melhorias Futuras
- Implementar persistência de dados para salvar e carregar informações de livros e leitores.
- Adicionar interface gráfica para facilitar a interação do usuário.
- Criar novas funcionalidades, como busca de livros por título ou autor.