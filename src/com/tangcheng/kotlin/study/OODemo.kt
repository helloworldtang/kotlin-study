package com.tangcheng.kotlin.study

/**
 *
 * @author  tangcheng
 * 2017/11/22
 */

fun main(args: Array<String>) {
    val adult = Adult("Bob", true)
    println(adult.name)
    println("isMarried:${adult.isMarried}")
    adult.isMarried = false
    println("isMarried:${adult.isMarried}")

    println("==========")
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}

class Adult(val name: String, var isMarried: Boolean)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}