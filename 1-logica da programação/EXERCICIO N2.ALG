Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/07/2022
Var
   // Seção de Declarações das variáveis
   nome:caractere
   sexo:caractere
   estadocivil:caractere
   tempocasado:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Digite seu nome completo")
   leia(nome)
   escreval("Informe seu sexo se feminino 'F' masculino 'M'.")
   leia(sexo)
   escreval("Informe seu estado civil 'CASADO(A)'.")
   leia(estadocivil)
   se (estadocivil="casado") ou (estadocivil="casada") entao
   fimse
   escreval("Quanto tempo de casados?")
   leia(tempocasado)
   se (tempocasado=10) entao
      escreval("Estamos todos esses 10 anos casados")
   fimse



Fimalgoritmo