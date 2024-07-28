package com.kyh.algorithms.lv1

class 과일장수 {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val scores = score.toList().filter { it <= k }.sortedDescending()
        val box = mutableListOf<Int>()

        for (i in 0 until scores.size) {
            if (box.size < m) box.add(scores[i])

            if (box.size == m) {
                answer += box.last() * m
                box.clear()
            }
        }

        return answer
    }

    fun solution2(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        var num =0
        score.forEach{
            num+=1
            if(num%m == 0){ // array에서 특정 index 위치를 찾을 때, 나머지 연산자를 이용하면 쉽게 찾을 수 있다
                answer+= it*m
            }
        }
        return answer
    }

}

fun main() {
    val problem = 과일장수()
    val answer = problem.solution(k = 3, m = 4, score = intArrayOf(1, 2, 3, 1, 2, 3, 1))
    println(answer)
}
