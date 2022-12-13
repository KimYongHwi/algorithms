package com.codility.lesson.time.complexity;

import java.util.ArrayList;
import java.util.Arrays;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int total = Arrays.stream(A).sum();
        int left = 0;
        int right = 0;
        ArrayList<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            right = total - left;

            sumList.add(Math.abs(left - right));
        }

        return sumList.stream().min((n1, n2) -> n1.compareTo(n2)).get();
    }

    public static void main(String[] args) {
        TapeEquilibrium t = new TapeEquilibrium();
        System.out.println(t.solution(new int[]{1, 2}));
        System.out.println(t.solution(new int[]{2, 3}));
        System.out.println(t.solution(new int[]{2, 3, 9}));
        System.out.println(t.solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println(t.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(t.solution(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
