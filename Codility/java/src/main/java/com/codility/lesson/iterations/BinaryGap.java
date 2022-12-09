package com.codility.lesson.iterations;

import java.util.ArrayList;
import java.util.List;

/**
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
Write a function:
class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
Write an efficient algorithm for the following assumptions:
  - N is an integer within the range [1..2,147,483,647].
Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

 1000010001

 **/
public class BinaryGap {
    public int solution(int N) {
        if (N <= 0) {
            return 0;
        }

        final String binaryStr = Integer.toBinaryString(N);
        final char[] binaryChars = binaryStr.toCharArray();

        int length = 0;
        int maxLength = 0;

        if (N != 0 && ((N & (N - 1)) == 0)) {
            return 0;
        }

        for (int i = 0; i< binaryChars.length; i++) {
            if (i == 0 && binaryChars[i] == '1') {
                continue;
            }

            if (binaryChars[i] == '0') {
                length++;
            }

            if (binaryChars[i] == '1') {
                if (length > maxLength) {
                    maxLength = length;
                }

                length = 0;
            }
        }

        return maxLength;
    }

//    public int anotherSolution(int N) {
//        int gap = 0;
//        String arr [] = Integer.toBinaryString(N).split("");
//        //N이 529일 때 => 1000010001
//
//        List<Integer> numList = new ArrayList<Integer>();
//        //1의 인덱스값을 담을 INT 배열 선언
//
//        for(int i=0;i<arr.length;i++) {
//            if(arr[i].equals("1")) {
//                numList.add(i);	//1의 인덱스를 담음
//                //0,5,9
//            }
//        }
//
//        //사이 값을 구할 것이므로 size()-1번 FOR문 돌리면 됨
//        for(int i=0;i<numList.size()-1;i++) {
//            int count = numList.get(i+1)-(numList.get(i)+1);	// 5-(0+1)=4, 9-(5+1)=3
//            if(count>gap) {
//                gap=count;	//큰 값으로 대입
//            }
//        }
//
//        return gap;
//    }
}
