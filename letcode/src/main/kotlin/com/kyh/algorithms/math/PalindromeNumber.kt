package com.kyh.algorithms.math

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        return x.toString().reversed() == x.toString()
    }
}

fun main() {
    val problem = PalindromeNumber()
    val answer = problem.isPalindrome(10)

    println(answer)
}
