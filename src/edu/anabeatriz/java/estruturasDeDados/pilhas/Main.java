package edu.anabeatriz.java.estruturasDeDados.pilhas;

public class Main {
    public static void main(String[] args) {
        
        Pilha minhaPilha = new Pilha();

        //Empilhando
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);
        /*  ------------
                Pilha
            ------------
            [No{dado=6}]
            [No{dado=5}]
            [No{dado=4}]
            [No{dado=3}]
            [No{dado=2}]
            [No{dado=1}]
            ============
        */

        minhaPilha.pop();
        System.out.println(minhaPilha);
        /*  ------------
                Pilha
            ------------
            [No{dado=5}]
            [No{dado=4}]
            [No{dado=3}]
            [No{dado=2}]
            [No{dado=1}]
            ============
        */

        minhaPilha.push(new No(9898956));
        System.out.println(minhaPilha);
         
        /*  ------------
                Pilha
            ------------
            [No{dado=9898956}]
            [No{dado=5}]
            [No{dado=4}]
            [No{dado=3}]
            [No{dado=2}]
            [No{dado=1}]
            ============
        */
    }
}
