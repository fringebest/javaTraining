package C13Strings;

public class ConvertStrings {


    //Exercitiul1
    public static int parseInt(String s) {
        int convertedInputInt = Integer.valueOf(s).intValue();
        return convertedInputInt;
    }

    public static double parseDouble(String s) {

        double convertedInputDouble = Double.valueOf(s).doubleValue();
        return convertedInputDouble;
    }

    public static boolean parseBoolean(String s) {

        boolean convertInputBoolean = Boolean.valueOf(s).booleanValue();
        return convertInputBoolean;
    }


    //Exercitiul3


    public static String convertString(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Character.isUpperCase(i)) {

            }
        }
            return str;
    }

    public static String reverseWord(String str) {

        String nume = "Maria";
        StringBuilder newName = new StringBuilder(nume);

        if(str == nume) {
            newName.append("nica");
        }
        else {
            newName.reverse();
        }

        return newName.toString();
    }

    public static void main (String[] args){

        //Exercitiul1
        System.out.println(parseBoolean("true"));
        System.out.println(parseDouble("4343.34"));
        System.out.println(parseInt("2232"));

        System.out.println("Printeaza asta: " + reverseWord("Ion"));

    }
}



