package edu.anabeatriz.java.operações;

public class Operadores {
    public static void main(String[] args) {
        //Operador de Atribuição de um valor a uma variável
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date();

        //Operadores Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; //resto de divisão
        double resultado = (10 * 7) + (20/4);
        //Concatenação de strings
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);
        String concatenacao ="?"; 
        concatenacao = 1+1+1+"1"; //31
        concatenacao = 1+"1"+1+1; //1111
        concatenacao = 1+"1"+1+"1"; //1111
        concatenacao = "1"+1+1+1; //1111
        concatenacao = "1"+(1+1+1); //13
        System.out.println(concatenacao);

        //Operadores Unários
        int numero = 5;
        System.out.println(- numero); //Imprimindo o numero negativo

        //Incrementando mais 1 no numero, imprime 6
        numero ++;
        System.out.println(numero);
        System.out.println(numero ++);//errado
        System.out.println(numero);// certo, numero virou 7
        //Ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);
		
        //Operadores Ternários
        int a, b;
        a = 5;
        b = 6;
        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado2 = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado2);

        //Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;
        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");
        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");
        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");
        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");
        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        //Comparação avançada
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println(nome1 == nome2); //true
        String nome3 = new String("JAVA");
        System.out.println(nome1 == nome3); //false
        //Equals
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true
        int numero3 = 130;
        int numero4 = 130;
        System.out.println(numero3 == numero4); //true
        //Equals
        Integer numero5 = 130;
        Integer numero6 = 130;
        System.out.println(numero5 == numero6); //false
        //A razão pela qual o resultado é false, é devido o Java tratar os valores como objetos
        //Quando queremos comparar objetos, usamos o método equals
         System.out.println(numero5.equals(numero6)); //true

        //Operadores Lógicos
        boolean condicao1=true;
        boolean condicao2=false;
        //Se Condicao1 E Condicao2 forem verdadeiras, executar código
        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;
        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
