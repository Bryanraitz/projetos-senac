Algoritmo "algoritmnoexemplo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Algoritmo de exemplo
// Autor(a)    : Bryan
// Data atual  : 26/07/2022
Var
   // Seção de Declarações das variáveis

   // variavel tem 3 atributos
   // nome
   // tipo
   // valor

   // tipo inteiro
   idade:inteiro;

   // tipo caractere
   nome_aluno:caractere;

   salario:real;
   
   ativo:logico;

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   // para executar usar o comando F9
   // escreve uma mensagem na tela

   // atribuindo valor numa variavel
   idade := 22
   nome_aluno := "Bryan Raitz"
   salario := 1500

   escreval("Meu nome é:", nome_aluno)

   escreval("Minha idade é:", idade, " anos de vida")

   escreval("Meu salario é: R$", salario , " por mes")

   escreval("leitura de dados do teclado")
   
   escreval("Informe seu nome:")
   leia(nome_aluno)
   
   escreval("Meu nome é:", nome_aluno)
   
   escreval("Informe sua idade:")
   leia(idade)
   
   escreval("Minha idade e ", idade, " anos de vida")
   
Fimalgoritmo