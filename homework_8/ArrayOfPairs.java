package com.telran.org.homework_8;

import java.util.Arrays;

public class ArrayOfPairs {
    public static void main(String[] args) {
        String[][] arrayOfPairs = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};

        Arrays.sort(arrayOfPairs, (o1, o2) -> {
            int nameComparison = o1[0].compareTo(o2[0]);
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return o1[1].compareTo(o2[1]);
            }
        });

        for (String[] pair : arrayOfPairs) {
            System.out.print(Arrays.toString(pair));
        }
    }
}
