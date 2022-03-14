package C8;

import java.util.Scanner;

public class FluxControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     System.out.println("Introduceti numarul: ");
     int number = sc.nextInt();

     System.out.println("Cifrele numarului sunt: ");

     while(number!=0)
     {
         int lastDigit = number %10;
         System.out.println(lastDigit + ",");

         number/= 10;

     }


     System.out.println("Introduceti numarul: ");

     int x = sc.nextInt();
     int sum = 0;

     while(x!=0)
     {
         int lastDigit = x%10;   // ==6   7
         sum += lastDigit;     // 0=0+6   6 + 7
         x/=10;              // 7     0

     }
     System.out.println("Suma cifrelor este: " +sum );


            //Exercitiul2



        System.out.println("Introduceti numarul de elemente:");
        int n = sc.nextInt();

// 2.2. 1
        int div7Numbers = 0;

// 2.2. 2
        int div5Numbers = 0;

        for (int i=0; i<n; i++) {
            System.out.println("Introduceti numarul " + (i+1) + "/" + n + ":");
            int crtNumber = sc.nextInt();

            // 2.2. 1
            if (crtNumber % 7 == 0) {
                div7Numbers++;
            }

            // 2.2. 2
            int copyCrt = crtNumber;
            int sumDigitsCrtNumber = 0;
            while (copyCrt != 0) {
                int uC = copyCrt % 10;
                sumDigitsCrtNumber += uC;
                copyCrt /= 10;
            }
            if (sumDigitsCrtNumber % 5 == 0) {
                div5Numbers++;
            }

        }

// 2.2. 1
        System.out.println("Numere divizibile cu 7: " + div7Numbers);

// 2.2. 2
        System.out.println("Numere care au suma cifrelor divizibila cu 5: " + div5Numbers);

    }

    {


    }
}
