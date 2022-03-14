package C8;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        //Exercitiul1
        Scanner sc = new Scanner(System.in);

       System.out.println("Introdu cifra aferenta lunii unui an:");
       int lunaAnului = sc.nextInt();

       if(lunaAnului==1) {
          System.out.println("Ianuarie");
       }
       else if (lunaAnului==2)
       {
           System.out.println("Februarie");
       }
       else if (lunaAnului==3)
       {
           System.out.println("Martie");
       }
       else if (lunaAnului==4)
       {
           System.out.println("Aprilie");
       }
       else if (lunaAnului==5)
       {
           System.out.println("Mai");
       }
       else if (lunaAnului==6)
       {
           System.out.println("Iunie");
       }
       else if (lunaAnului==7)
       {
           System.out.println("Iulie");
       }
       else if (lunaAnului==8)
       {
           System.out.println("August");
       }
       else if (lunaAnului==9)
       {
           System.out.println("Septmebrie");
       }
       else if (lunaAnului==10)
       {
           System.out.println("Octombrie");
       }
       else if (lunaAnului==11)
       {
           System.out.println("Noiembrie");
       }
       else if (lunaAnului==12)
       {
           System.out.println("Decembrie");
       }
       else {
           System.out.println("Luna introdusa nu este valida");
       }


      // //Exercitiul2
       System.out.println("Te rugam sa introduci un numar");
       int number = sc.nextInt();

       if(number%2==0){
           System.out.println("Numarul " + number + " introdus este par");
       }
           else {
               System.out.println("Numarul " + number + " introdus este impar");
       }

        //Exercitiul3

        System.out.println("Te rugam sa introduci codul PIN: ");
        int pinClient = sc.nextInt();
        int pinCorect = 1234;

        int soldCont = 200;





        if(pinClient==pinCorect){

            System.out.println("PIN corect");
            System.out.println("Introduceti suma pe care doriti sa o scoateti");
            int suma = sc.nextInt();;
            if (suma <=soldCont)
            {
                System.out.println("Tranzactie in curs de procesare");
                System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (Nu) sau 1(DA)");
                int raspuns = sc.nextInt();
                int soldRamas = soldCont - suma;
                if (raspuns == 1){
                    System.out.println("Soldul disponobil este: " + soldRamas );
                }
                else {
                    System.out.println("Multumim pentru ca ati ales Banca DevBank");
                }
            }
            else if(suma >soldCont) {
                System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
            }
        }
           else {

               System.out.println("PIN gresit");
        }
    }
}
