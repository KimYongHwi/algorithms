package com.kyh.algorithms.dynamic

class PassThePillow {

    // 1 2 3 4 | 5 4 3 2 | 1 2 3 4 | 5 4 3 2 | 1 2 3 4 | ...
    // The odd-th chunk starts with number 1, while the even-th chunk starts with number n
    fun passThePillow(n: Int, time: Int): Int {
        val chunks = time / (n - 1) // 5 / (4 - 1)
        return if (chunks % 2 == 0) time % (n - 1) + 1 else n - time % (n - 1)
    }

    fun solution(n: Int, time: Int): Int {
        var maxTime = -1
        var directionLeft = true
        var answer = 0
        while (true) {
            if (directionLeft) {
                for (i in 1..n) {
                    maxTime++
                    if (maxTime == time) {
                        answer = i
                        break;
                    }
                }

                directionLeft = false
            } else {
                for (i in n - 1 downTo 2) {
                    maxTime++
                    if (maxTime == time) {
                        answer = i
                        break;
                    }
                }

                directionLeft = true
            }

            if (maxTime == time) {
                break;
            }
        }

        return answer
    }
}

fun main() {
    val problem = PassThePillow()
    val answer = problem.solution(n = 4, time = 5)
    println(answer)
}

