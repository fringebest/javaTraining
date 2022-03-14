package C8;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class SwitchClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Exercitiul1
        System.out.println("Introduceti unul caracter alegere");

       String newChar = sc.nextLine();

        switch (newChar)
    {
        case "d":
            System.out.println("Cuvantul cu litera d afisat este: Dinozaur");
            break;
        case "e":
            System.out.println("Cuvantul cu litera d afisat este: Elefant");
            break;
        case "v":
            System.out.println("Cuvantul cu litera d afisat este: Volan");
            break;
        case "s":
            System.out.println("Cuvantul cu litera d afisat este: Semafor");
            break;

        default:
            System.out.println("Nu ati ales caracterul potrivit");
            break;
    }

    //Exercitiul2
    String monthOfTheYear = sc.nextLine();
        switch (monthOfTheYear)
        {
            case "Februarie":
                System.out.println("Luna Februarie are 28 de zile.");
                break;
            case "Ianuarie":
            case "Martie":
            case "Aprilie":
            case "Mai":
            case "Iunie":
            case "Iulie":
                System.out.println("Luna " + monthOfTheYear + " are 31 de zile.");
                break;
            case "August":
            case "Septembrie":
            case "Octombrie":
            case "Noiembrie":
            case "Decembrie":
                System.out.println("Luna " + monthOfTheYear + " are 30 de zile.");
                break;
            default:
                System.out.println("Numele lunii incep cu masjuscule si se continua cu litere mici");
                break;

        }

        //Exercitiul3

        System.out.println("Scrieti un nr natural number:");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {

            switch (i % 4) {
                case 0:
                    System.out.print("+" + i + " ");
                    break;
                case 1:
                    System.out.print("*" + i + " ");
                    break;
                case 2:
                    System.out.print("~" + i + " ");
                    break;
                case 3:
                    System.out.print("-" + i + " ");
                    break;
                case -3:
                case -7:
                case -11:
                case -15:
                case -19:
                    break;


            }
        }
        //Exercitiul4

        System.out.println("Te rugam sa introduci un numar n: ");
        int n = sc.nextInt();

        for(int i =0; i <= n ; i++){
            switch (i%10) {
                case 0 :
                    break;
                case 1 :
                    break;
                case 8:
                    break;
                default:
                    System.out.println(i);

            }
        }


    }
}
