package com.ppcrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int pointAlice = 0;
        int pointBob = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                pointAlice++;
            } else if (a.get(i) < b.get(i)) {
                pointBob++;
            } else {
                // do nothing
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(pointAlice);
        result.add(pointBob);
        return result;
    }

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {

        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
