package C8;

import java.util.Scanner;

public class ForStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for (int i = 0; i<=number; i+=2)
      {
          System.out.println(i);
      }


      //Exemplul2
        int n = sc.nextInt();

        //for (<INITIALIZARE_ITERATOR>; <CONDITIE_ITERATOR>; <ACTUALIZARE_ITERATOR>)
        for (int it=n-n%2; it>=0; it-=2) {
            // <INSTRUCTIUNI>;
            System.out.println(it);
        }



        //Exemplul3
        int readNumber = sc.nextInt();
        int sum = 0; // initializat la 0, deoarece vom aduna la
        // valoarea sa, pe rand, numerele citite

        while (readNumber > 0) {
           sum += readNumber;
           readNumber = sc.nextInt();
       }

       System.out.println("Suma numerelor introduse este: " + sum);

       String strFromInput = sc.nextLine();

  //cat timp strFromInput nu este egal cu keyword-ul 'stop'
       while (!strFromInput.equals("stop")) {
           System.out.println(strFromInput);
           strFromInput = sc.nextLine();
       }

       //Exercitiul1
        System.out.println("Introdu un numar:");
        int numberInput = sc.nextInt();

         System.out.println("Introdu un mesaj:");

        String message = sc.nextLine();
              sc.nextLine();

        for(int i=1; i<=numberInput; i++)
              System.out.println((i) + ". Programming is really fun" + message);


        //Exercitiul2

        System.out.println("Introdu un numar:");
        int numberN = sc.nextInt();

        for (int i = 0 ; i<=10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Introdu un numar:");
        int numar = sc.nextInt();

        for (int i = 0 ; i<=numar; i++)
        {
            if(i%2==1){
            System.out.println(i);
            }
        }


        System.out.println("Introdu un numar:");
        int numberAdd = sc.nextInt();

        for (int i = 0 ; i<=numberAdd; i++)
        {
            if(i%5==0){
                System.out.println(i);
            }
        }


        }


    }




