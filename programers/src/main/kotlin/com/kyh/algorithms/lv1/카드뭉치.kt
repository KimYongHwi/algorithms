package com.kyh.algorithms.lv1

class 카드뭉치 {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var card1Idx = 0
        var card2Idx = 0
        val card1Map = cards1.withIndex().associate { it.value to it.index }
        val card2Map = cards2.withIndex().associate { it.value to it.index }

        /*
         각 cards에 대한 idx값이 순차적으로 오르는지 확인한다.
         */
        goal.forEach { word ->
            if (card1Map[word] != null && card1Map[word] == card1Idx) card1Idx += 1
            else if (card2Map[word] != null && card2Map[word] == card2Idx) card2Idx += 1
            else return "No"
        }

        return "Yes"
    }
}

fun main() {
    val cards1 = arrayOf("i", "drink", "water")
    val cards2 = arrayOf("want", "to")
    val goal = arrayOf("i", "want", "to", "drink", "water")

    val problem = 카드뭉치()
    val answer = problem.solution(cards1, cards2, goal)

    println(answer)
}
