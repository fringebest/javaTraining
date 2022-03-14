package C12Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercise {

    public static String[] increaseCapacity(String[] array, int newLength){

        String[] largerArray = new String[newLength];

        for(int i = 0 ; i< array.length;i++){
            largerArray[i] = array[i];
        }
        return largerArray;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String keyword = "Stop";
//
//        int initCapacity = 2;
//        String[] array = new String[initCapacity];
//        int numberOfElements = 0;
//
//        String read = sc.next();
//        while (!(read.equals(keyword))){
//            array[numberOfElements] = read;
//            numberOfElements++;
//
//
//            if(numberOfElements == array.length) {
//                array = Arrays.copyOf(array, array.length/2);
//            }
//            read = sc.next();
//        }
//
//        System.out.println("Number of elements read and stored: " + numberOfElements);
//        System.out.println("Array dimension: " + array.length);
//        System.out.println("Elements:");
//
//        for(int i=0; i<numberOfElements ; i++){
//            System.out.println(array[i] + ", ");
//        }
//        System.out.println();

        String[] arr_str1 = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};
        String key = "Java";

        System.out.println(countOccurrencesIgnoreCase(arr_str1,key));

        String[] arr_str2 = {"Java", "C", "Python", "JAVA", "perl", "C#", "java"};
        String key2 = "TensorFlow";

        System.out.println((countOccurrencesIgnoreCase(arr_str2,key2)));



    }

    public int[] readArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti numarul de numere pt array:");
        int lengthA = sc.nextInt();
        int[] arrA = new int[lengthA];

        for (int i=0; i<arrA.length; i++) {
            System.out.println("Array: introduceti numarul " + (i + 1) + ":");
            arrA[i] = sc.nextInt();
        }

        return arrA;
    }


    public int[] diffArrays(int[] arrA, int[] arrB) {

        int[] diffArr;
        diffArr = new int[arrA.length];

        int k = 0;

        for (int i=0; i < arrA.length; i++) {

            boolean isEqual = false;

            for (int j=0; j < arrB.length; j++) {
                if (arrB[j] == arrA[i]) {
                    isEqual = true;
                    break;
                }
            }

            if (!isEqual) {
                diffArr[k] = arrA[i];
                k++;
                System.out.println(arrA[i] + " nu este in array 2");
            }
        }
        return diffArr;
    }

    public static int countOccurrencesIgnoreCase(String[] array, String key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase(key)){
                count++;
            }
        }

        System.out.println("Se repeta numarul de: " + count + " ori");
        return count;
    }


}
