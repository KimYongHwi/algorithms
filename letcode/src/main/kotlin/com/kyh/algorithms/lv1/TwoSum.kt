package com.kyh.algorithms.lv1


/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val answer = IntArray(2)
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { idx, i -> map[idx] = i }

        for(i in nums.indices) {
            val num = nums[i]
            val keys = map.filterValues { it == target - num }.keys.filterNot { it == i }

            if (map.containsValue(target - num) && keys.isNotEmpty()) {
                answer[0] = i
                answer[1] = keys.first()
                break
            }
        }

        return answer
    }
}


fun main() {
    val solution = Solution()
    // inputs: [-1,-2,-3,-4,-5], target: -8
    // inputs: []0, 4, 3, 0], target = 0
    val twoSum = solution.twoSum(nums = intArrayOf(3, 2, 4), target = 6)

    println(twoSum[0])
    println(twoSum[1])
}

