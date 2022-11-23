package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int[] filterIntsGreaterThanTen (int[] nums) {
        int k = 0;
        for (int i = 0 ; i < nums.length; i++) {
            k++;
        }
        System.out.println("The total is: " + k);
        nums = Arrays.stream(nums).filter(d -> d > 10).toArray();
        return nums;
    }
    public static void printAllElements(int[]arr) {
        for (int val: arr) {
            System.out.println(val);
        }
    }
    public static void printAllElements(ArrayList<String> list) {
        for (String val: list) {
            System.out.println(val);
        }
    }

    public static void shuffleList(ArrayList<String> list) {
        Collections.shuffle(list);
    }
    public static void createLineBreak() {
        System.out.println("\n<<<<<------------------------------->>>>>\n");
    }

    public static void filterLessThanFiveChars(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() < 5) {
                names.remove(i);
            }
        }
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



    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] testCaseOne = {3,5,1,2,7,9,8,13,25,32};
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

        shuffleList(namesList);
        System.out.println("And now after shuffling!\n");
        printAllElements(namesList);
        createLineBreak();

        System.out.println("Filtering out all names less than 5 chars in length\n");
        filterLessThanFiveChars(namesList);
        printAllElements(namesList);
        createLineBreak();

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "u", "r" +
                "s", "t","v","x","y","z"};
        shuffleThenDisplayAlphabet(alphabet);
    }
}