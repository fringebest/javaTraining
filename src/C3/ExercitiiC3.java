package C3;

public class ExercitiiC3 {
    public static void main(String[] args) {
        int a = 23, b;
        b=17;

        int suma = a+b;
        int diferenta = a-b;

        System.out.println(suma);
        System.out.println(diferenta);

        //Exercitiul2

        int valoare;
        valoare = 42;

        System.out.println(valoare);
        valoare = valoare + 2;
        System.out.println(valoare);

        valoare=101;
        System.out.println(valoare);

        //Exercitiul3

        String nume = "Andrei";
         int mere = 23;
         int portocale = 45;
         int gutui = 7;
         int totalFructe = mere + portocale + gutui;

         System.out.println(nume + " are initial un total de fructe de: " + totalFructe);

         int totalMereDupaMasa = 23-5;
         int totalPortocaleDupaMasa = 45-2;
         int totalGutuiDupaMasa = 7-3;
         int totalMerePortocaleDupaMasa = totalMereDupaMasa + totalPortocaleDupaMasa;

         System.out.println("Dupa masa, Andrei are un total de mere + portocale de: " + totalMerePortocaleDupaMasa);

         int totalFructeDupaMasa = totalGutuiDupaMasa + totalMereDupaMasa + totalPortocaleDupaMasa ;

         System.out.println("Numarul total de fructe ramase dupa este: " + totalFructeDupaMasa);


    }
}
