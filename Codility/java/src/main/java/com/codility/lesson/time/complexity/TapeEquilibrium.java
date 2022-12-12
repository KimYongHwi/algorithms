package com.codility.lesson.time.complexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

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
}
