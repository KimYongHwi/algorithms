package com.kyh.algorithms.lv1

class 푸드파이트대회 {
    fun solution(food: IntArray): String {
        val left = mutableListOf<Int>()
        val right = mutableListOf<Int>()
        val foodMap = food.withIndex().associate { it.index to it.value }

        foodMap.keys.forEach { key ->
            var foodCount = foodMap[key]!!
            if (foodCount % 2 != 0) foodCount -= 1

            for (i in 0 until foodCount) {
                if (i % 2 == 0) left.add(key)
                else right.add(key)
            }
        }

        right.reverse()

        return (left + mutableListOf(0) + right).joinToString("")
    }
}

fun main() {
    val problem = 푸드파이트대회()
    val answer = problem.solution(food = intArrayOf(1, 3, 4, 6))
    println(answer)
}
