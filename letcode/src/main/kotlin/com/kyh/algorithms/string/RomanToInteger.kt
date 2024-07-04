package com.kyh.algorithms.string

import java.lang.Exception


/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
class RomanToInteger {

    fun romanToInt(s: String): Int {
        val numerals = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        val charArr = s.toCharArray()
        var sum = 0;

        for (i in 0 until charArr.size) {
            val left = numerals[charArr[i]]!!

            var right = try {
                numerals[charArr[i + 1]]!!
            } catch (e: Exception) {
                null
            }

            // 작은 수가 큰 수에 오른쪽에 오더라도 하나의 자릿 수만 확인하면 된다. (left만 사용하는 이유)
            if (right != null && left >= right) {
                sum += left
            } else {
                if (right == null) {
                    sum += left
                    println("left: $left, right: $right, sum: $sum")
                    break;
                }

                sum -= left
            }
            println("left: $left, right: $right, sum: $sum")
        }

        return sum
    }
}


fun main() {
    /*
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
     */

//    val s = "IV"
//    val s = "III" // 1 + (1+1),
//    val s = "LVIII" // 50 + (5+1) + (1+1) => 58
//     val s = "MCMXCIV" // 1000 + (-100 + 1000) + (-10 + 100) + (-1 + 5) => 1994
//    val s = "MCDLXXVI" // 1000 + (-100 + 500) + (50 + 10) + (10 + 5) + 1 => 1476
    val s = "MMCDXXV" // (2425) 1000 + (1000 + 100) + (500 + 10) + (10 + 5)

    val problem = RomanToInteger()
    val solution = problem.romanToInt(s)
    println(solution)
}
