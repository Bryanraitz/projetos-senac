Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/07/2022
Var
   // Se��o de Declara��es das vari�veis
   nome:caractere
   sexo:caractere
   estadocivil:caractere
   tempocasado:inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
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