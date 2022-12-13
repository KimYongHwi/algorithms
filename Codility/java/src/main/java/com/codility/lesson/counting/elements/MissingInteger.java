package com.codility.lesson.counting.elements;

import java.util.HashSet;
import java.util.Set;

/*
This is a demo task.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        int answer = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) set.add(A[i]);
        }

        for (int i = 1; i <= set.size() + 1; i++) {
            if (!set.contains(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
