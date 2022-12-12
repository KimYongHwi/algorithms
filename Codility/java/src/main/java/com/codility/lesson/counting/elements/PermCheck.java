package com.codility.lesson.counting.elements;

import java.util.Arrays;
import java.util.HashSet;

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
}
