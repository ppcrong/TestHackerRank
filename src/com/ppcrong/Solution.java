package com.ppcrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    // Complete the compareTriplets function below.
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

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
    public static long aVeryBigSum(long[] ar) {

        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    // Complete the sockMerchant function below.
    public static int sockMerchant(int n, int[] ar) {

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
    public static int countingValleys(int n, String s) {

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

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {

        int jumps = 0;
        if (c.length == 2) {
            return 1;
        }

        for (int i = 0; i < c.length - 1; i++) {

            if (i != 0) {
                jumps++;
            }

            if (c[i + 1] == 1 || (i < c.length - 2 && c[i + 2] == 0)) {
                i++; // ignore next cloud, go to 3rd cloud directly
            }
        }
        jumps++; // For the last step

        System.out.println(jumps);
        return jumps;
    }
}
