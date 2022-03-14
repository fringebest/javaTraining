package C13Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringExercise {

    //Exercitiul1
    public String readString(String str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un string:");
        str = sc.nextLine();
        return str;
    }

    public void afisareNumarCaractere(String str){

        for(int i = 0; i<str.length(); i++){
            int count = 0;
            for(int j = 0; j<str.length(); j++){
                    if(str.charAt(i)== str.charAt(j)){
                        count++;
                    }
            }
            if (str.indexOf(str.charAt(i))==i){
                System.out.println("Character: " + str.charAt(i) + " appears: " + count + " time(s).");
            }
        }

    }

    //Recapitulare finala
    //Implementeaza o metoda generica de cautare a unui sir de caractere intr-un vector de siruri de caractere.
    // Metoda trebuie sa ia in considerare toate cazurile posibile,
    // inclusiv cazurile in care in array se pot afla valori nule, array-ul este nul sau cheia este nula.

    public static boolean searchMethod(String[] array, String value){
        if( array == null || array.length == 0){
            return false;
        }

        for (int i=0; i<array.length; i++) {
            if (array[i] != null && array[i].equals(value) ||
                    array[i] == null && value == null) {
                return true;
            }
        }
        return false;
    }


    // determina numarul maxim de aparitii ale unui element

    public static void printCharWithMaxFrecuency(String s){
        s = s.toLowerCase();
        int maxFreq = 0;

        for(int i = 0;i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))){
                continue;
            }
            int charFreq = 1;
            for(int j = i +1; j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    charFreq++;
                }
            }
            maxFreq = charFreq > maxFreq ? charFreq : maxFreq ;
        }

        for(int i = 0; i<s.length();i++){
            if(Character.isWhitespace(s.charAt(i))){
                continue;
            }

            int charFreq = 1;
            for(int j = i +1; j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    charFreq++;
                }
            }
            if(charFreq == maxFreq) {
                System.out.print("Characters " + s.charAt(i) + " appears "+ maxFreq + " times");
            }
        }

    }






    public static void main(String[] args) {

        StringExercise acctualString = new StringExercise();
        String newString = "This game was actually fun";

        acctualString.afisareNumarCaractere(newString);
        printCharWithMaxFrecuency("Aniellaiee");
    }

}
