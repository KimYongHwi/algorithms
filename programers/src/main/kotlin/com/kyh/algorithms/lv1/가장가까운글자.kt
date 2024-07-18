package com.kyh.algorithms.lv1

class 가장가까운글자 {
    fun solution(s: String): IntArray {
        var answer = IntArray(s.length)
        var positionMap = mutableMapOf<Char, Int>()

        s.forEachIndexed { curPosition, c ->
            if (positionMap[c] == null) {
                positionMap[c] = curPosition
                answer[curPosition] = -1
            } else {
                val prevPosition = positionMap[c]!!
                val value = curPosition - prevPosition

                positionMap[c] = curPosition
                answer[curPosition] = value
            }
        }

        return answer
    }
}

fun main() {
    val s = "banana"
    val problem = 가장가까운글자()
    val answer = problem.solution(s)

    println(answer.joinToString(", "))
}
