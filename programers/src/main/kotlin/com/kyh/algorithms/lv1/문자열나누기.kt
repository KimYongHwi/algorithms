package com.kyh.algorithms.lv1

class 문자열나누기 {
    fun solution(s: String): Int {
        var answer: Int = 0
        var a = mutableListOf<Int>(1, 0)
        var start = 0
        var j = 1

        while(true) {
            if (s.length == 1) answer++
            if (j >= s.length) break

            if(s[start] == s[j]) a[0] += 1
            else a[1] += 1

            if (a[0] == a[1]) {
                answer++
                a[0] = 1
                a[1] = 0
                start = j+1
                j = start+1
            } else j++

            if (j == s.length) answer++
        }

        return answer
    }

    // queue를 이용해 처리했고 다른 단어가 나올때마다 queue에서 pop해서 queue가 공백인 경우 서로 다른 단어가 같은 횟수로 나왔다는 의미
    fun optimalSolution(s: String): Int {
        var answer = 0
        val queue = mutableListOf<Char>()

        s.forEach {
            if (queue.isEmpty()) {
                answer++
                queue.add(it)
            } else if (queue.first() == it) {
                queue.add(it)
            } else {
                queue.removeAt(0)
            }
        }

        return answer
    }
}

fun main() {
    val s = "banana"
    val problem = 문자열나누기()
    val answer = problem.optimalSolution(s)
    println(answer)
}
