package com.kyh.algorithms.lv1

class 둘만의암호 {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = ""

        s.toCharArray().forEach { c ->
            var movedCount = 0
            var next = c

            while (movedCount != index) {
                next += 1

                if (next.toInt() > 122) {
                    next = 'a'
                    while(skip.contains(next)) next++
                }
                if (!skip.contains(next)) movedCount += 1
            }

            answer += next.toString()
        }

        return answer
    }

    fun optimalSolution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val skipped = skip.map { it.toChar() }
        val alphabet = ('a'..'z').filter { it !in skipped }

        s.forEach {
            val i = (alphabet.indexOf(it) + index) % alphabet.size
            answer += alphabet[i]
        }
        return answer
    }
}

fun main() {
//    // happy
//    val s = "aukks"
//    val skip = "wbqd"
//    val index = 5

//    // b
//    val s = "z"
//    val skip = "a"
//    val index = 1

//    // o
//    val s = "a"
//    val skip = "bcdefghijk"
//    val index = 20

    // n
    val s = "z"
    val skip = "abcdefghij"
    val index = 20

    val problem = 둘만의암호()
    val answer = problem.solution(s, skip, index)
    println(answer)
}
