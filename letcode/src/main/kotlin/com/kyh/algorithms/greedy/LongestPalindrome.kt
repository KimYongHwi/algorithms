package com.kyh.algorithms.greedy

import kotlin.math.min

/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest
palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */

class LongestPalindrome {
    fun longestPalindrome(s: String): Int {
        val oddMap = mutableMapOf<Char, Int>()
        val evenMap = mutableMapOf<Char, Int>()

        s.toCharArray().forEach {
            if (oddMap[it] == null) {
                oddMap[it] = 1
            } else {
                oddMap[it] = oddMap[it]!!.plus(1)
            }

            if (oddMap[it]!! % 2 == 0) {
                if (evenMap[it] == null) {

                    evenMap[it] = oddMap[it]!!
                } else {
                    evenMap[it] = evenMap[it]!! + oddMap[it]!!
                }
                oddMap.remove(it)
            }
        }

        return evenMap.values.sum() + min(oddMap.values.size, 1)
    }
}

fun main() {
    val problem = LongestPalindrome()
    val answer = problem.longestPalindrome("a")

    println(answer)
}
