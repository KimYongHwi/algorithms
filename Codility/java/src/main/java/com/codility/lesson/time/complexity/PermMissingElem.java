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
}
