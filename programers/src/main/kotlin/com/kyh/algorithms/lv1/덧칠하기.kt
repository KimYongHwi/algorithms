package com.kyh.algorithms.lv1

class 덧칠하기 {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        var idx = 0

        // 다음 section 위치를 구한다.
        while (true) {
            if (idx > section.size - 1) break;
            val range = m + section[idx] - 1

            section.forEachIndexed { sectionIdx, sectionValue ->
                if (range >= sectionValue) {
                    idx = sectionIdx + 1
                }
            }

            if (range >= section[idx - 1]) {
                answer++
            }

            if (range > n) {
                break
            }
        }

        return answer
    }

    fun optimalSolution(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        var nextSection = 0

        section.forEach {
            if (it >= nextSection) {
                answer++
                nextSection = it + m
            }
        }
        return answer
    }
}

fun main() {
    val problem = 덧칠하기()
//    val answer = problem.solution(n = 10, m = 3, section = intArrayOf(1, 3, 6, 7))
    val answer = problem.solution(n = 10, m = 4, section = intArrayOf(6, 10))

    println("answer: $answer")
}
