package com.kyh.algorithms.lv1

class 크기가작은부분문자열 {
    fun solution(t: String, p: String): Int {
        var answer = 0

        for (from in 0 until t.length) {
            val to = (p.length - 1) + from

            if (to > t.length - 1) break
            if (t.substring(from..to).toLong() <= p.toLong()) answer++
        }

        return answer
    }
}

fun main() {
    val t = "3141592"
    val p = "271"

    val problem = 크기가작은부분문자열()
    val answer = problem.solution(t, p)
    println(answer)
}
