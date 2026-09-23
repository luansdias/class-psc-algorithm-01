import java.util.Scanner;
public class Divertidamente {
    public static void main(String[] args) { 

        Scanner leia = new Scanner(System.in);
        int amizade;
        int tristeza = 0;
        int alegria = 0;
        double a1;
        double a2;
        double a3;
        int exercicios;

        System.out.println("Quantas amizades Riley fez?");
        amizade = leia.nextInt();

        if (amizade == 0) {
            tristeza = 30;
        }

        else if (amizade >= 1) {

            alegria = amizade * 10;
        }

        System.out.println("Qual a nota da prova A1 da Riley?");
        a1 = leia.nextDouble();

        System.out.println("Qual a nota da prova A2 da Riley?");
        a2 = leia.nextDouble();

        System.out.println("Qual a nota da prova A3 da Riley?");
        a3 = leia.nextDouble();

        double media  = (a1 + a2 + a3) / 3;

        if (media >= 7 ) {

            System.out.println("Riley está aprovada!");
            alegria = alegria + 50;    
        }
        
        else {
            System.out.println("Riley está reprovada!");
            tristeza = tristeza + 50;

        }

    System.out.println("Quantos exercícios a Riley fez?");
    exercicios = leia.nextInt();

    int alegria1 = exercicios * 10;

    int sobra  = 10 - exercicios;

    int tristeza1 = sobra * 10;

    tristeza = tristeza + tristeza1;
    alegria = alegria + alegria1;

    System.out.println("A alegria de Riley é: " + alegria);
    System.out.println("A tristeza de Riley é: " + tristeza);

    if (alegria > tristeza) {

       System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
    }
       else {

        System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");

    }
    











        
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    }
}