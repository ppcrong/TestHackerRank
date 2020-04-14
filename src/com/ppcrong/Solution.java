package com.ppcrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        // key: color, value: num of socks
        HashMap<Integer, Integer> sockMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (sockMap.containsKey(ar[i])) {
                sockMap.put(ar[i], sockMap.get(ar[i]) + 1);
            } else {
                sockMap.put(ar[i], 1);
            }
        }

        int numOfPairs = 0;
        for (Integer i : sockMap.values()) {
            numOfPairs += i / 2;
        }
        return numOfPairs;
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int currentStep = 0;
        int sumValley = 0;
        char[] arrayChar = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int lastStep = currentStep;
            switch (arrayChar[i]) {
                case 'U':
                    currentStep++;
                    break;
                case 'D':
                    currentStep--;
                    break;
                default:
                    break;
            }
            if (i != 0 && currentStep == 0 && lastStep < 0) {
                sumValley++;
            }
        }
        return sumValley;
    }
}
