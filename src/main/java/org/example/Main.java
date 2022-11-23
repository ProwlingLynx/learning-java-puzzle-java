package org.example;

import java.util.Arrays;

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
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] testCaseOne = {3,5,1,2,7,9,8,13,25,32};
        printAllElements(filterIntsGreaterThanTen(testCaseOne));
    }
}