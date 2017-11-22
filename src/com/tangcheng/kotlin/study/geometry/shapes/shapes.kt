package com.tangcheng.kotlin.study.geometry.shapes

import java.util.*

/**
 *
 * @author  tangcheng
 * 2017/11/22
 */
class RecTangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun createRandomRectangle(): RecTangle {
    val random = Random()
    return RecTangle(random.nextInt(), random.nextInt())
}
