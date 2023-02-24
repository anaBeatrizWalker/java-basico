package edu.anabeatriz.exercicios.metodos;

/* A partir da hora, retorne a mensagem correta: bom dia, boa tarde, boa noite */

public class Relogio {

    public static void mensagem(int hora){
        
        switch (hora) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mensagemBoaMadrugada();
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagemBomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                mensagemBoaNoite();
                break;
    
            default:
                break;
        }
    }

    public static void mensagemBoaMadrugada(){
        System.out.println("Boa madrugada! :D");
    }

    public static void mensagemBomDia(){
        System.out.println("Bom diiiiiaa!!!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Buenas tardes amigo :)");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boooa noite... zzZZzz");
    }
    
}
