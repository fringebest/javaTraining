package C8;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {
        //Exerctiul 2
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Introdu primul numaru: ");
        //  int left = sc.nextInt();

        //  System.out.println("Introdu al doilea numar:");
        //  int right = sc.nextInt();

        //  int contor = 0;


        //  for (int i = left; i <=right; i++) {
        //      if (i % 2 == 1) {

        //          System.out.println("numarul este: " + i);
        //          contor++;
        //      }
        //      if (contor == 5) {
        //          break;
        //      }
        //  }


        //Exercitiul3
        System.out.println("Introduceti numar intreg: ");
        int numarIntreg = sc.nextInt();
        int minNumber = 99;

      // if(numarIntreg < 99) {
      //     System.out.println("Numarul trebuie sa fie mai mare de 3 cifre");
      // }

        int counter = 0;
        while (numarIntreg > 0 ) {

            int lastDigit = numarIntreg % 10;

            System.out.println("Printeaza:" + lastDigit);
            counter++;
            numarIntreg /= 10;

            if (counter == 3) {
                break;
            }

        }



    }
}



