package com.codility.lesson.prefix.sums;

import java.util.ArrayList;

/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
public class CountDiv {
    // Time complexity O(1)
    public int solution(int A, int B, int K) {
        int start = A;
        int end = B;
        int answer = 0;

        while (start <= end) {
            if (start % K == 0) {
                answer++;
                break;
            } else {
                start++;
            }
        }

        answer += (B - start) / K;

        return answer;
    }

    public static void main(String[] args) {
        CountDiv c = new CountDiv();

        System.out.println("example1: " + c.solution(6, 11, 2)); // 3
        System.out.println("example2: " + c.solution(7, 12, 4)); // 2
        System.out.println("example3: " + c.solution(7, 13, 4)); // 2
        System.out.println("extreme1: " + c.solution(0, 1, 11)); // 1
        System.out.println("extreme2: " + c.solution(8, 9, 5)); // 0
        System.out.println("extreme3: " + c.solution(0, 1, 2)); // 1
        System.out.println("extreme4: " + c.solution(0, 0, 11)); // 1
        System.out.println("large_number: " + c.solution(0, 2000000000, 1)); // 2000000001
    }
}
