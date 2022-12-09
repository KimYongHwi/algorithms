package com.codility.lesson.array;

import java.util.HashMap;

public class OddOccurrencesInArray {
    // O(N) or O(N*log(N))
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }

            if (map.get(A[i]) % 2 == 0) {
                map.remove(A[i]);
            }
        }

        System.out.println(map);
        System.out.println(map.keySet().stream().findFirst().get());

        return map.keySet().stream().findFirst().get();
    }
}
