package com.codility.lesson.time.complexity;

public class FrogJmp {
    // O(1)
    public int solution(int X, int Y, int D) {
        System.out.println((int) Math.ceil((Y - X) / (double)D));
        return (int) Math.ceil((Y - X) / (double)D);
    }
}
