package com.kyh.algorithms.lv1

class 공원산책 {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val answer = IntArray(2)
        var rowIdx = 0
        var colIdx = 0

        val parks = park.mapIndexed { idx1, p ->
            val chars = p.toCharArray()

            chars.forEachIndexed { idx2, char ->
                if (char == 'S') {
                    rowIdx = idx1
                    colIdx = idx2
                }
            }

            chars
        }

        val h = park.size - 1
        val w = parks[0].size - 1

        routes.forEach {
            val splits = it.split(" ")
            val direction = splits[0]
            val num = splits[1].toInt()

            when(direction) {
                "E" -> {
                    if (colIdx + num > w) return@forEach
                    for (i in 1 .. num) {
                        if (parks[rowIdx][colIdx + i] == 'X') return@forEach
                    }

                    colIdx += num
                }
                "W" -> {
                    if (colIdx - num < 0) return@forEach
                    for (i in 1 .. num) {
                        if (parks[rowIdx][colIdx - i] == 'X') return@forEach
                    }

                    colIdx -= num
                }
                "S" -> {
                    if (rowIdx + num > h) return@forEach
                    for (i in 1 .. num) {
                        if (parks[rowIdx + i][colIdx] == 'X') return@forEach
                    }

                    rowIdx += num
                }
                "N" -> {
                    if (rowIdx - num < 0) return@forEach
                    for (i in 1 .. num) {
                        if (parks[rowIdx - i][colIdx] == 'X') return@forEach
                    }

                    rowIdx -= num
                }
            }
        }

        answer[0] = rowIdx
        answer[1] = colIdx

        return answer
    }
}

fun main() {
//    val park = arrayOf("SOO","OOO","OOO")
//    val park = arrayOf("SOO","OXX","OOO")
//    val park = arrayOf("OSO","OOO","OXO","OOO")
//    val park = arrayOf("SXO", "OXX", "OOO")
    val park = arrayOf("OXO", "XSX", "OXO")
//    val routes = arrayOf("E 2","S 2","W 1")
//    val routes = arrayOf("E 2","S 2","W 1")
//    val routes = arrayOf("E 2","S 3","W 1")
//    val routes = arrayOf("E 4", "S 4", "N 4", "S 1", "S 1", "E 2")
    val routes = arrayOf("S 1", "E 1", "W 1", "N 1")

    val problem = 공원산책()
    val answer = problem.solution(
        park = park,
        routes = routes
    )

    println(answer.joinToString(","))
}
