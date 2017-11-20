package com.tangcheng.kotlin.study

/**
 *
 * @author  tangcheng
 * 2017/11/16
 */

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hello,${args[0]}")
    }
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello,$name!")
    println("Hello,${if (args.isNotEmpty()) args[0] else "Kotlin"}!22")

    println("hello,world!")

    val persons = listOf<Person>(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is : $oldest")
    val smallest = persons.minBy { it.age ?: 0 }
    println("The smallest is : $smallest")

    println("10,20 max:${maxStyle1(10, 20)}")
    println("20,30 max:${maxStyle2(20, 30)}")
}

data class Person(val name: String,
                  val age: Int? = null)

fun maxStyle1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxStyle2(a: Int, b: Int): Int = if (a > b) a else b

