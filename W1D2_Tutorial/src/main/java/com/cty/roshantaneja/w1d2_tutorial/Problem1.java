package com.cty.roshantaneja.w1d2_tutorial;

public class Problem1 {

    public static void main(String[] args) {
        // Problem 1
        // Given an array, find the second-smallest element in the array.
        int[] array = new int[] {
                4, 5, 10, -1, 3, 4
        };

        int smallest = array[0];
        int secondSmallest = array[1];

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            }
        }

        System.out.println(secondSmallest);
    }
}
