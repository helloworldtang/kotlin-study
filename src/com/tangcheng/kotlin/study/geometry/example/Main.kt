package com.tangcheng.kotlin.study.geometry.example

import com.tangcheng.kotlin.study.geometry.shapes.createRandomRectangle

/**
 *
 * @author  tangcheng
 * 2017/11/22
 */

fun main(args: Array<String>) {
    val rectangle = createRandomRectangle()
    println("height:${rectangle.height}, width:${rectangle.width}")
    println(rectangle.isSquare)
}