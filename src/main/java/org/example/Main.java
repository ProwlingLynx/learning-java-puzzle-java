package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int[] filterIntsGreaterThanTen (int[] nums) {
        int[] output;
        int lengthOfFilteredArray = 0;
        for (int number: nums) {
            if (number > 10) {
                lengthOfFilteredArray++;
            }
        }
        output = new int[lengthOfFilteredArray--];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > 10) {
                output[lengthOfFilteredArray--] = nums[i];
            }
        }
        return output;
    }

    public static void printSumOfAllInts(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Your total is: " + sum);
    }
    public static void printAllElements(int[]arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void printAllElements(ArrayList<String> list) {
        System.out.println(list);
    }
    public static void printAllElements(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    public static void createLineBreak() {
        System.out.println("\n<<<<<------------------------------->>>>>\n");
    }

    public static String[] shuffleAndPrintFilteredStringArray (String[] names) {
        System.out.println("Our list of names before the shuffling: ");
        System.out.println(Arrays.toString(names));
        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
        Collections.shuffle(listOfNames);
        System.out.println("Here is our list after shuffle: ");
        String outputMessage = "[ ";
        for (String s: listOfNames) {
            outputMessage += s + " ,";
        }
        System.out.println(outputMessage + " ]");
        listOfNames.removeIf(name -> name.length() < 5);
        String[] filteredNamesArray = new String[listOfNames.size()];
        for (int i = 0; i < listOfNames.size(); i++) {
            filteredNamesArray[i] = listOfNames.get(i);
        }
        return filteredNamesArray;
    }


    public static void shuffleThenDisplayAlphabet(String[] arr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(list);

        String firstLetter = list.get(0);
        System.out.println("Our lucky winner tonight is: " + firstLetter);
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String s : vowels) {
            if (firstLetter.equals(s)) {
                System.out.println("Found a vowel!");
            }
        }
        System.out.println("No vowels tonight folks!");
    }
    public static int generateRandomInt() {
        return generateRandomInt(1, 0);
    }
    public static int generateRandomInt(int limit) {
        return generateRandomInt(limit, 0);
    }

    public static int generateRandomInt(int limitUpper, int limitLower) {
        double random = Math.random();
        int diff = limitUpper - limitLower;
        return (int) (random * diff + limitLower);
    }

    public static int[] generateArrayOfRandomInts(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = generateRandomInt(100, 55);
        }
        return output;
    }
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static String generateRandomCharacterString() {
        return Character.toString(generateRandomInt(122, 97));
    }

    public static String generateRandomString(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = size; i > 0; i--) {
            sb.append(generateRandomCharacterString());
        }
        return sb.toString();
    }

    public static String[] generateArrayOfRandomStrings(int size) {
        String[] output = new String[size];
        for (int i = 0; i < size; i++) {
            output[i] = generateRandomString(5);
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] testCaseOne = {3,5,1,2,7,9,8,13,25,32};

        printSumOfAllInts(testCaseOne);
        printAllElements(filterIntsGreaterThanTen(testCaseOne));


        createLineBreak();
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Nancy");
        namesList.add("Jinichi");
        namesList.add("Fujibayashi");
        namesList.add("Momochi");
        namesList.add("Ishikawa");
        System.out.println("Before Shuffling the arrayList:\n");

        printAllElements(namesList);
        String[] testOfNames = {"Ishikawa", "Momochi", "Fujibayashi", "Jinichi", "Nancy", "add", "fail"};
        String[] result = shuffleAndPrintFilteredStringArray(testOfNames);
        createLineBreak();
        System.out.println(Arrays.toString(result));
        createLineBreak();


        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "u", "r" +
                "s", "t","v","x","y","z"};
        shuffleThenDisplayAlphabet(alphabet);

        createLineBreak();

        int[] randomArray = generateArrayOfRandomInts(10);
        System.out.println("Here is our array of random ints: \n");
        printAllElements(randomArray);
        sortArray(randomArray);
        System.out.println("And here it is sorted!\n");
        printAllElements(randomArray);

        createLineBreak();
        System.out.println("Time to make random strings~\n");
        System.out.println(generateRandomString(5));
        System.out.println("\nHeh, never know what you're going to get :)");
        createLineBreak();

        System.out.println("We can do better by turning it into an array!");
        printAllElements(generateArrayOfRandomStrings(10));

    }
}