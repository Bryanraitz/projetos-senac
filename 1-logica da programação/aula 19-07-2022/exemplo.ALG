Algoritmo "algoritmnoexemplo"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Algoritmo de exemplo
// Autor(a)    : Bryan
// Data atual  : 26/07/2022
Var
   // Se��o de Declara��es das vari�veis

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
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...

   // para executar usar o comando F9
   // escreve uma mensagem na tela

   // atribuindo valor numa variavel
   idade := 22
   nome_aluno := "Bryan Raitz"
   salario := 1500

   escreval("Meu nome �:", nome_aluno)

   escreval("Minha idade �:", idade, " anos de vida")

   escreval("Meu salario �: R$", salario , " por mes")

   escreval("leitura de dados do teclado")
   
   escreval("Informe seu nome:")
   leia(nome_aluno)
   
   escreval("Meu nome �:", nome_aluno)
   
   escreval("Informe sua idade:")
   leia(idade)
   
   escreval("Minha idade e ", idade, " anos de vida")
   
Fimalgoritmo