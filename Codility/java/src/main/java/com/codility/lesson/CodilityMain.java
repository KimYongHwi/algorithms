package com.codility.lesson;

import com.codility.lesson.array.CyclicRotation;
import com.codility.lesson.array.OddOccurrencesInArray;
import com.codility.lesson.counting.elements.FrogRiverOne;
import com.codility.lesson.counting.elements.MaxCounters;
import com.codility.lesson.counting.elements.PermCheck;
import com.codility.lesson.iterations.BinaryGap;
import com.codility.lesson.time.complexity.FrogJmp;
import com.codility.lesson.time.complexity.PermMissingElem;
import com.codility.lesson.time.complexity.TapeEquilibrium;

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
        cyclicRotation.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
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

    public void permMissingElem() {
        PermMissingElem p = new PermMissingElem();
        System.out.println(p.solution(new int[]{1}));
        System.out.println(p.solution(new int[]{2, 3}));
        System.out.println(p.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(p.solution(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public void tapeEquilibrium() {
        TapeEquilibrium t = new TapeEquilibrium();
        System.out.println(t.solution(new int[]{1, 2}));
        System.out.println(t.solution(new int[]{2, 3}));
        System.out.println(t.solution(new int[]{2, 3, 9}));
        System.out.println(t.solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println(t.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(t.solution(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public void frogRiverOne() {
        FrogRiverOne f = new FrogRiverOne();
        System.out.println(f.solution(5, new int[]{1, 3, 1, 4, 2, 3, 4, 5}));
        System.out.println(f.solution(5, new int[]{1, 3, 1, 4, 2, 3, 4, 5, 5}));
        System.out.println(f.solution(3, new int[]{1, 2}));
    }

    public void permCheck() {
        PermCheck p = new PermCheck();
        System.out.println(p.solution(new int[]{4, 3, 1}));
        System.out.println(p.solution(new int[]{4, 1, 3, 2}));
        System.out.println(p.solution(new int[]{1}));
        System.out.println(p.solution(new int[]{4}));
        System.out.println(p.solution(new int[]{4, 3}));
        System.out.println(p.solution(new int[]{2, 3, 4}));
        System.out.println(p.solution(new int[]{1, 2, 2}));
    }

    public void maxCounters() {
        MaxCounters m = new MaxCounters();
        m.solution(5, new int[]{3, 4, 4, 6});
        m.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        m.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4, 6});
        m.solution(1, new int[]{2, 1});
    }

    public static void main(String[] args) {
        CodilityMain c = new CodilityMain();
//        c.binaryGap();
//        c.cyclicRotation();
//        c.oddOccurrencesInArray();
//        c.frogJmp();
//        c.permMissingElem();
//        c.tapeEquilibrium();
//        c.frogRiverOne();
//        c.permCheck();
        c.maxCounters();
    }
}
