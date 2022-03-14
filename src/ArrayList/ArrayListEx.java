package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {

    public static void prettyPrintArrayList(ArrayList<String> values,
                                            String delim, String message) {
        System.out.print(message);
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + delim);
        }
        System.out.println();
    }

    public static ArrayList<String> returnElement(ArrayList<String> arrayList, String value) {

        for (int i = 0; i < arrayList.size(); i++) {
            String newValue = arrayList.get(i);
            if (newValue == value) {
                System.out.println(newValue);
            }
        }
            return arrayList;
    }



    public static void main(String[] args) {

        ArrayList<String> names =
                new ArrayList<String>(Arrays.asList("John", "Lucy", "Anna", "Kelly", "Dean", "Lucy"));

        prettyPrintArrayList(names, ", ", "Names: ");

        names.remove("Lucy");
        names.remove("Ryan");

        prettyPrintArrayList(names, ", ", "Names: ");

        names.add("Maria");
        prettyPrintArrayList(names,",","Names: ");

        returnElement(names,"John");

        System.out.println(names.get(2));
        System.out.println(names.lastIndexOf("John"));
        System.out.println(names.indexOf("Lucy"));



    }
}
