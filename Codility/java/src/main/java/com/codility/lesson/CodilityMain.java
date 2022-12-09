package com.codility.lesson;

import com.codility.lesson.array.CyclicRotation;
import com.codility.lesson.array.OddOccurrencesInArray;
import com.codility.lesson.iterations.BinaryGap;
import com.codility.lesson.timecomplexity.FrogJmp;

public class CodilityMain {
    public void binaryGap() {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println("==========");
        System.out.println("solution: " + binaryGap.solution(8));
        System.out.println("==========");
        System.out.println("solution: " + binaryGap.solution(529));
        System.out.println("==========");
        System.out.println("solution: " + binaryGap.solution(1041));
        System.out.println("==========");
        System.out.println("solution: " + binaryGap.solution(561892));
    }

    public void cyclicRotation() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3); // K > N
        cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 12); // K > N
        cyclicRotation.solution(new int[]{3, 8, 9, 7, 6, 5}, 3);
        cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4); // K == N
        cyclicRotation.solution(new int[]{1}, 4);
        cyclicRotation.solution(new int[]{1,2,3,4,5,6,7}, 2);
    }

    public void oddOccurrencesInArray() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        o.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    }

    public void frogJmp() {
        int x = 10;
        int y = 999999996;
        int d = 2;

        FrogJmp f = new FrogJmp();
        f.solution(x, y, d);
    }
    public static void main(String[] args) {
        CodilityMain c = new CodilityMain();
//        c.binaryGap();
//        c.cyclicRotation();
//        c.oddOccurrencesInArray();
        c.frogJmp();
    }
}