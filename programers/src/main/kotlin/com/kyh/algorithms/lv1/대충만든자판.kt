package com.kyh.algorithms.lv1

class 대충만든자판 {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        /*
            keymap = arrayOf("ABACD", "BCEFD")
            keymap 내에서 각 알파벳의 index 중 작은 index만 알고 있으면 된다.
         */

        val keyMap = keymap.map { it.toCharArray().toList() }
            .flatMap { it.withIndex().map { idx -> Pair(idx.value, idx.index + 1) } }
            .groupBy { it.first }
            .mapValues { (_, values) -> values.fold(Int.MAX_VALUE) { min, v -> if (v.second < min) v.second else min } }


        targets.forEach {
            val minList = it.toCharArray().map { target -> keyMap.getOrDefault(target, -1) }

            if (minList.any { v -> v == -1 }) {
                answer.add(-1)
            } else {
                answer.add(minList.sum())
            }
        }

        return answer.toIntArray()
    }
}

fun main() {
    val keymap = arrayOf("ABACD", "BCEFD")
    val targets = arrayOf("ABCD", "AABB")

//    val keymap = arrayOf("AA")
//    val targets = arrayOf("B")

//    val keymap = arrayOf("AGZ", "BSSS")
//    val targets = arrayOf("ASA", "BGZ")

//    val keymap = arrayOf("ABACD", "BCEFD") // 9, 4
//    val targets = arrayOf("ABCD", "AABB")

//    val keymap = arrayOf("ABACD", "BCEFD")  // 9, -1, 4
//    val targets = arrayOf("ABCD", "DG", "AABB")

//    val keymap = arrayOf("AGZ", "BSSS") // 4, 6
//    val targets = arrayOf("ASA", "BGZ")

//    val keymap = arrayOf("ABCDE") // -1
//    val targets = arrayOf("FGHIJ")

//    val keymap = arrayOf("ABC") // -1
//    val targets = arrayOf("DA")

//    val keymap = arrayOf("ABCE") // 110
//    val targets = arrayOf("ABDE")

//    val keymap = arrayOf("AB", "BA") // 2
//    val targets = arrayOf("AA")

    val problem = 대충만든자판()
    val answer = problem.solution(keymap = keymap, targets = targets)

    println(answer.joinToString(", "))
}
