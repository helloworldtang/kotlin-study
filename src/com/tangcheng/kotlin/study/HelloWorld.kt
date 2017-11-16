package com.tangcheng.kotlin.study

/**
 *
 * @author  tangcheng
 * 2017/11/16
 */

fun main(args: Array<String>) {
    println("hello,world!")

    val persons = listOf<Person>(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is : $oldest")
    val smallest = persons.minBy { it.age ?: 0 }
    println("The smallest is : $smallest")
}

data class Person(val name: String,
                  val age: Int? = null)