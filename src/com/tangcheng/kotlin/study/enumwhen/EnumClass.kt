package com.tangcheng.kotlin.study.enumwhen

/**
 *
 * @author  tangcheng
 * 2017/11/22
 */
/**
 * enum是一个称为“软关键字”的关键字，只有当它出现在class前面时才有特殊的意义
 * 在其它地方可以把enum当做普通的名称使用
 * class仍然是一个关键字，不当做普通的名称使用，要使用clazz或aClass来声明变量
 */
fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
    println(Color.ORANGE.rgb())

    println(getMnemonic(Color.VIOLET))

    println(getWarmth(Color.BLUE))

    try {
        println(mix(Color.INDIGO, Color.BLUE))
    } catch(e: Exception) {
        println(e.message)
    }
    println(mix(Color.YELLOW, Color.BLUE))
    println(mix(Color.BLUE, Color.YELLOW))
    println(minOptimized(Color.BLUE, Color.YELLOW))


}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}


fun getMnemonic(color: Color) =
        /**
         *when是一个有返回值的表达式，与if一样
         */
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

fun minOptimized(c1: Color, c2: Color) = when {
    (c1 == Color.RED && c2 == Color.YELLOW) ||
            (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
    (c1 == Color.YELLOW && c2 == Color.BLUE) ||
            (c1 == Color.BLUE && c2 == Color.YELLOW) -> Color.GREEN
    (c1 == Color.BLUE && c2 == Color.VIOLET) ||
            (c1 == Color.VIOLET && c2 == Color.BLUE) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

