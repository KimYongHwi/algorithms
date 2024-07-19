package com.kyh.algorithms.lv1

class 명예의전당 {
    fun solution(k: Int, score: IntArray): IntArray {
        var numbers = mutableListOf<Int>()
        var answer = mutableListOf<Int>()

        score.forEach {s ->
            if (numbers.size < k) {
                numbers.add(s)
            } else {
                if (numbers[0] < s) {
                    numbers.removeAt(0)
                    numbers.add(k-1, s)
                }
            }

            numbers = numbers.sorted().toMutableList()
            answer.add(numbers[0])
        }

        return answer.toIntArray()
    }
}

fun main() {
    val problem = 명예의전당()
    val answer = problem.solution(k = 3, score = intArrayOf(10, 100, 20, 150, 1, 100, 200))
    println(answer)
}
