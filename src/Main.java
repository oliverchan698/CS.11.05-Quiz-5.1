import java.util.Arrays;
public class Main {
    public static void main(String[] args) { // A personal testing script since MainTest.java never works right
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array3 = {1,3,5,7,9,11,13};
        int[] array4 = {2,4,6,8,10,12,14};
        String[] array5 = {"Christmas", "IS", "comInG", "!"};
        String[] array6 = {"I", "lean", "agaINST", "tHE", "winD", "preTEnD", "tHAT", "I", "aM", "WEIGHTless"};
        System.out.println(combine(array1, array2) + ", expected [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        System.out.println(combine(array3, array4) + ", expected [1, 3, 5, 7, 9, 11, 13, 2, 4, 6, 8, 10, 12, 14]");
        System.out.println(zip(array1, array2) + ", expected [1, 6, 2, 7, 3, 8, 4, 9, 5, 10]");
        System.out.println(zip(array3, array4) + ", expected [1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,1 1, 12 ,1 3, 14]");
        System.out.println(product(array1, array2) + ", expected [6, 14, 24, 36, 50]");
        System.out.println(product(array3, array4) + ", expected [2, 12, 30, 56, 90, 132, 182]");
        System.out.println(capitalCount(array5) + ", expected [1, 2, 2, 0]");
        System.out.println(capitalCount(array6) + ", expected [1, 0, 4, 2, 1, 3, 3, 1, 1, 6]");
    }
    
    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static String combine(int[] array1, int[] array2) {
        int[] lorem = new int[array1.length + array2.length];
        for (int i = 0; i < (Math.max(array1.length, array2.length)); i++) {
            if (i < array1.length) {
                lorem[i] = array1[i];
            }
            if (i < array2.length) {
                lorem[i + array1.length] = array2[i];
            }
        }
        return Arrays.toString(lorem);

    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     * int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array3 = {1,3,5,7,9,11,13};
        int[] array4 = {2,4,6,8,10,12,14};
     */
    public static String zip(int[] array1, int[] array2) {
        // I couldn't work out how to do this one but here's what I had
        int[] zipped = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            zipped[i] = array1[i];
            zipped[i + 1] = array2[i];
            i++;
        }
        return Arrays.toString(zipped);

    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static String product(int[] array1, int[] array2) {
        int[] products = new int[Math.min(array1.length, array2.length)];
        for (int i = 0; i < (products.length); i++) {
            products[i] = array1[i] * array2[i];
        }
        return Arrays.toString(products);

    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static String capitalCount(String[] words) {
        int[] caps = new int[words.length];
        for (int i = 0; i < caps.length; i++) {
            caps[i] = countCapitalLetters(words[i]);            
        }
        return Arrays.toString(caps);

    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        int charnum = 0;
        for (int i = 0; i < word.length(); i++) {
            charnum = (int) word.charAt(i);
            if (charnum >= 65 && charnum <= 90) {
                count++;
            }
        }
        return count;

    }

}
