package com.kyh.algorithms.array

import kotlin.math.max
import kotlin.math.min

class 바탕화면정리 {
    fun solution(wallpaper: Array<String>): IntArray {
        val wallpaper2DArr = wallpaper.map { wp -> wp.toCharArray() }
        val w = wallpaper2DArr[0].size
        val h = wallpaper.size
        val s = mutableListOf<Int>()
        val e = mutableListOf<Int>()
        var minColumn = Int.MAX_VALUE
        var maxColumn = 0
        var lastRow = 0

        for (i in 0 until h) {
            for (j in 0 until w) {
                if (wallpaper2DArr[i][j] == '#') {
                    if (s.isEmpty()) s.add(i)
                    if (minColumn > j) minColumn = j
                    if (j >= maxColumn) maxColumn = j + 1

                    lastRow = i + 1
                }
            }
        }

        s.add(minColumn)
        e.add(lastRow)
        e.add(maxColumn)

        return (s + e).toIntArray()
    }

    fun anotherSolution(wallpaper: Array<String>): IntArray {
        var minX = wallpaper.size
        var minY = wallpaper[0].length
        var maxX = 0
        var maxY = 0

        for (i in wallpaper.indices) {
            for (j in wallpaper[i].indices) {
                if (wallpaper[i][j] == '#') {
                    minX = min(i, minX)
                    minY = min(j, minY)
                    maxX = max(i, maxX)
                    maxY = max(j, maxY)
                }
            }
        }
        return intArrayOf(minX, minY, maxX + 1, maxY + 1)
    }
}

fun main() {
    val problem = 바탕화면정리()
//    val wallpaper = arrayOf(".#...", "..#..", "...#.") // [0, 1, 3, 4]
//    val wallpaper = arrayOf("..........", ".....#....", "......##..", "...##.....", "....#.....") // [1, 3, 5, 8]
    val wallpaper = arrayOf("..", "#.")
    val answer = problem.solution(wallpaper)
    println(answer.joinToString(","))
}
