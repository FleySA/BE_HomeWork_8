package com.telran.org.homework_8;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayOfPairs {
    public static void main(String[] args) {
        String[][] arrayOfPairs = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};

        Arrays.sort(arrayOfPairs, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int nameComparison = o1[0].compareTo(o2[0]);
                if (nameComparison != 0) {
                    return nameComparison;
                } else {
                    return o1[1].compareTo(o2[1]);
                }
            }
        });
    }
}
