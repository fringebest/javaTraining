package C8;

import java.util.Scanner;

public class WhileStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Before the 'while' statement.");

       System.out.println("Enter 'YES' to print the message OR anything else to quit.");
       String command = sc.nextLine();

       while (command.equals("YES")) {
           System.out.println("This message is printing now!");

           System.out.println("Enter 'YES' to print the message OR anything else to quit.");
           command = sc.nextLine();
       }

       System.out.println("After the 'while' statement");

       int printTimes = 5;
       int currentPrintNumber = 0;

       System.out.println("Before the 'while' statement");

       while (currentPrintNumber < printTimes) {
           System.out.println("This message is printing now");
           currentPrintNumber++;

       }

       System.out.println("After the 'while' statement ");

        //Exercitiul1
        int numberOfIterations = sc.nextInt();

        while (numberOfIterations < 1000) {
            System.out.println("This will never end...");
                numberOfIterations++;
            }


        //Exercitiul2
        //1
       int naturalNumber = sc.nextInt();

       while (naturalNumber <= 10) {

           System.out.println("Sirul de numere este: " + naturalNumber);
           naturalNumber++;

       }

       //2
       int n = sc.nextInt();
       while (n<10) {

           if(n%2==1)
           System.out.println("Sirul de numere este: " + n);
           n++;
       }

       //3
       int number = sc.nextInt();
       while (number<=10) {

           if(number%2==0)
               System.out.println("Sirul de numere este: " + number);
           number++;
       }

       //4
       int numberNew = sc.nextInt();
       while (numberNew<=10) {

           if(numberNew%5==0)
               System.out.println("Sirul de numere este: " + numberNew);
           numberNew++;

       }
       //Exercitiul 3
       System.out.println("Introduceti un numar natural pozitiv:");
       int positiveNumber = sc.nextInt();

       while(positiveNumber>0)
       {

           System.out.println("Dublul sau este: " + positiveNumber*2);
       break;
       }



        //Exercitiul4
        System.out.println("Va rugam introduceti un mesaj:");
        String message = sc.nextLine();
        int upperLimit = sc.nextInt();
        int dec = sc.nextInt();

        System.out.println("Start counting...");
        while(upperLimit >= 0 ) {
                    System.out.println(message + upperLimit);
                 upperLimit -= dec;


            }
        System.out.println("End counting...");
        }
    }


