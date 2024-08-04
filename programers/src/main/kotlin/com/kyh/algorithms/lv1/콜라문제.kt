package com.kyh.algorithms.lv1

class 콜라문제 {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        val remainders = mutableListOf<Int>()
        var preQuotient = n
        var curQuotient: Int
        var remainder: Int

        while (true) {
            curQuotient = (preQuotient / a) * b
            remainder = preQuotient % a

            preQuotient = curQuotient
            answer += curQuotient

            if (remainder > 0) remainders.add(remainder)
            if (curQuotient < b) {
                preQuotient += remainders.sum()
                remainders.clear()
            }

            if (remainders.isEmpty() && preQuotient < a) break;
        }

        return answer
    }

    fun optimalSolution(a: Int, b: Int, n: Int): Int {
        return (if (n > b) n - b else 0) / (a - b) * b
    }
}

fun main() {
    val problem = 콜라문제()
    val answer = problem.solution(a = 2, b = 1, n = 20)
    println(answer)
}
