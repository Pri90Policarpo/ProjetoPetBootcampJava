# Projeto Pet

## Visão Geral

O Projeto Pet é uma aplicação Java simples que gerencia o agendamento de serviços para animais de estimação e o controle de produtos relacionados a animais. Ele demonstra conceitos de orientação a objetos e o uso de ArrayLists para armazenar informações sobre produtos, serviços e registros de venda.

## Classes

### Main

A classe `Main` é a classe principal do projeto e contém o método `main`. No método `main`, demonstramos o seguinte:

- Criação de listas de produtos e serviços.
- Exibição das informações sobre produtos e serviços.
- Agendamento de serviços para um animal de estimação.
- Cálculo do valor total dos serviços agendados.
- Exibição de todas as informações relacionadas.

### Animal

A classe `Animal` representa um animal de estimação e possui atributos como nome, espécie, raça, data de nascimento e proprietário.

### Produto

A classe `Produto` modela produtos relacionados a animais, incluindo atributos como nome, categoria, preço e quantidade em estoque. Além disso, a classe possui um método `vender` para registrar vendas e atualizar o estoque.

### Servico

A classe abstrata `Servico` define serviços relacionados a animais e requer implementações de descrição e preço. As classes `Banho`, `Tosa` e `ConsultaVeterinaria` são exemplos de serviços concretos.

### Agenda

A classe `Agenda` permite agendar serviços para animais de estimação. Ela armazena informações sobre o animal, a lista de serviços agendados, data e horário.


## Como Rodar o Aplicativo

Para rodar o aplicativo:

1. Certifique-se de ter o Java instalado em seu sistema.

2. Clone ou baixe o repositório do Projeto Pet.

3. Compile todas as classes Java do projeto ou abra o código-fonte em um ambiente de desenvolvimento Java, como o Eclipse.

4. Execute a classe `Main` para iniciar o aplicativo.

5. Você verá os resultados das operações realizadas no método `main`, incluindo informações sobre produtos, serviços, vendas e agendamentos.

