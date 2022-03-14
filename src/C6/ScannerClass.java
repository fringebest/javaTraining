package C6;
import  java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // // citirea datelor problemei
       // System.out.println("Introdu prenumele tau (si apasa Enter):");
       // String prenume = sc.next();
//
       // System.out.println("Introdu numele tau (si apasa Enter):");
       // String nume = sc.next();
//
       // System.out.println("Introdu varsta (si apasa Enter):");
       // int varsta = sc.nextInt();
//
       // System.out.println("Introdu inaltimea (si apasa Enter):");
       // double inaltime = sc.nextDouble();
//
       // // Afisarea rezultatelor
       // System.out.println("Datele introduse despre " + prenume + " " + nume
       //         + " sunt:\n\t- Varsta: " + varsta
       //         + "\n\t- Inaltime: " + inaltime);
//
       // //Exercitiu1
//
//
       // // valori anterioare citite inainte de
       // // un 'String' cu spatii (i.e. folosind nextLine())
       // // Valorile anterioare puteau avea orice tip!
       // System.out.println("Introdu o valoare de tip intreg (si apasa Enter):");
       // int aPrevValueRead = sc.nextInt();
       // System.out.println("Introdu un sir de caractere fara spatii (si apasa Enter):");
       // String anotherPrevValueRead = sc.next();
//
       // // Folosirea nextLine() pentru obtinerea rezultatului corect:
       // // 1. Deoarece citirea cu nextLine() se realizeaza dupa alte citiri anterioare
       // // este necesar sa se citeasca initial caracterul whitespace 'Enter'/'Newline'
       // // ramas de la citirea anterioara
       // //sc.nextLine();
       // // 2. Se realizeaza citirea efectiva a 'String-ului' cu spatii:
       // System.out.println("Introdu un sir de caractere cu sau fara spatii (si apasa Enter):");
       // String theStringWithSpacesToRead = sc.nextLine();
//
       // // Verificare
       // System.out.println("Variabila \"aPrevValueRead\" are valoarea: "
       //         + aPrevValueRead);
       // System.out.println("Variabila \"anotherPrevValueRead\" are valoarea: "
       //         + anotherPrevValueRead);
       // System.out.println("Variabila \"theStringWithSpacesToRead\" are valoarea: "
       //         + theStringWithSpacesToRead);
//

        //Exercitiul2

      //2 System.out.println("Introdu valoarea primului numar:");
      //2 int number1 = sc.nextInt();

      //2 System.out.println("Introdu valoarea celui de-al 2-lea numar:");
      //2 int number2 = sc.nextInt();

      //2 System.out.println("Introdu valoare numarului 3:");
      //2 int number3 = sc.nextInt();


      //2 int sumaTotala = number1 + number2 + number3;

      //2 System.out.println("Suma totala a acestor numere este: " + sumaTotala);


        //Exercitiul2


        System.out.println("Care este anul de fabricatie a masinii: ");
        int anul = sc.nextInt();

        System.out.println("Care este luna de fabricatie a masinii: ");
        String luna = sc.next();

        System.out.println("Care este ziua de fabricatie a masinii: ");
        int ziua = sc.nextInt();

        sc.nextLine();
        System.out.println("Care este numarul de inmatriculare a masinii: ");
        String numarulDeInmatriculare = sc.nextLine();

        System.out.println("Care sunt numarul de km in bord: ");
        double nrKm = sc.nextDouble();

        System.out.println("Care sunt numarul de km la achizitie: ");
        double nrKmAchizitie = sc.nextDouble();

        sc.nextLine();
        System.out.println("Care este numele soferului: ");
        String numeSofer = sc.nextLine();

        System.out.println("Soferul are permis:");
        boolean arePermis = sc.nextBoolean();

        double diferentaKm = nrKm - nrKmAchizitie;
        int vechimeMasina = 2022 - anul;

        System.out.println("Diferenta de km din momentul achizitiei pana in momentul actual " + diferentaKm);
        System.out.println("Vechime masina" + vechimeMasina);











    }
}
