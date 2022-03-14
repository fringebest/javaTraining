package C8;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numarMagic = 6;

        System.out.println("Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10]");
        System.out.println("Incearca-ti norocul:");

        int numar = sc.nextInt();

        do {
             if (!(numar>0 && numar<=10)){
               System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
               System.out.println("Incearca-ti norocul:");
               numar=sc.nextInt();

           }

            if(numar<numarMagic)
            {
                System.out.println("Esti aproape! Dar numarul magic este mai mare.");
                System.out.println("Incearca-ti norocul:");
                numar=sc.nextInt();
            }

            if (numar>numarMagic)
            {
                {
                    System.out.println("Esti aproape! Dar numarul magic este mai mic.");
                    System.out.println("Incearca-ti norocul:");
                    numar=sc.nextInt();
                }
            }

            if(numar==numarMagic)
            {
                System.out.println("Ai ghicit, bravo!");
                numar=sc.nextInt();
                break;
            }
        }

        while(numar!=numarMagic);



    }

}
