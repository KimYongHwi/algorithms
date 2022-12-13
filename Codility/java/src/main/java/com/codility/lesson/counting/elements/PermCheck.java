package com.codility.lesson.counting.elements;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        Arrays.sort(A);

        if (A.length == 1 && A[0] != 1) {
            return 0;
        }

        if (A[0] > 1) {
            return 0;
        }

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] != 1) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        PermCheck p = new PermCheck();
        System.out.println(p.solution(new int[]{4, 3, 1}));
        System.out.println(p.solution(new int[]{4, 1, 3, 2}));
        System.out.println(p.solution(new int[]{1}));
        System.out.println(p.solution(new int[]{4}));
        System.out.println(p.solution(new int[]{4, 3}));
        System.out.println(p.solution(new int[]{2, 3, 4}));
        System.out.println(p.solution(new int[]{1, 2, 2}));
    }
}
