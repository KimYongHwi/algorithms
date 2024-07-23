package com.kyh.algorithms.lv1

import kotlin.math.floor
import kotlin.math.sqrt

/*
 * 주제: Math
 * 약수 구하는 알고리즘: 에라토스테네스의 체
 * @link: https://www.algodale.com/algorithms/sieve-of-eratosthenes/
 */
class 기사단원의무기 {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val factorSizeList = mutableListOf<Int>()

        for (i in 1..number) {
            val factors = mutableSetOf<Int>()

            // 1과 자기 자신
            factors.add(1)
            if (i != 1) factors.add(i)

            // 제곱근 만큼만 돌면서 나머지 연산자가 0일 경우 j와 i / j 값 추가
            for (j in 2..floor(sqrt(i.toDouble())).toInt()) {
                if (i % j == 0) {
                    factors.add(j)
                    factors.add(i / j)
                }
            }

            if (factors.size > limit) factorSizeList.add(power)
            else factorSizeList.add(factors.size)
        }

        return factorSizeList.sum()
    }
}

fun main() {
    val problem = 기사단원의무기()
    val answer = problem.solution(number = 5, limit = 3, power = 2)
    println(answer)
}
