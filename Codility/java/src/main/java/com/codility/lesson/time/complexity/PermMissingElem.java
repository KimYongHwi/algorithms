package com.codility.lesson.time.complexity;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        A = Arrays.stream(A).sorted().toArray();

        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) return i + 1;
        }

        return A.length + 1;
    }

    public static void main(String[] args) {
        PermMissingElem p = new PermMissingElem();
        System.out.println(p.solution(new int[]{1}));
        System.out.println(p.solution(new int[]{2, 3}));
        System.out.println(p.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(p.solution(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
