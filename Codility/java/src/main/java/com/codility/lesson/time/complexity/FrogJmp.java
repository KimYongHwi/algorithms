package com.codility.lesson.time.complexity;

public class FrogJmp {
    // O(1)
    public int solution(int X, int Y, int D) {
        System.out.println((int) Math.ceil((Y - X) / (double)D));
        return (int) Math.ceil((Y - X) / (double)D);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 999999996;
        int d = 2;

        FrogJmp f = new FrogJmp();
        f.solution(x, y, d);
    }
}
