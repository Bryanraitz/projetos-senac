Algoritmo "aa"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : GELVAZIO CAMARGO
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Bryan R. Oechsler
// Data atual  : 27/07/2022
Var
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
   se (sexo="F") e (estadocivil="casada") entao
      escreval("Quanto tempo de casados?")
      leia(tempocasado)

   fimse
Fimalgoritmo