/*
FizzBuzz

Write a short program that prints each number from 1 to n on a new line. 

For each multiple of 3, print "Fizz" instead of the number. 

For each multiple of 5, print "Buzz" instead of the number. 

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.

exemple
-------

imput:
n = 15

return:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

*/

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


/*
 * Complete the 'fizzBuzz' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun fizzBuzz(n: Int): Unit {
    // Write your code here
    for (i in 1..n){
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } else if(i % 3 == 0){
            println("Fizz")
        } else if(i % 5 == 0){
            println("Buzz")
        } else{
            println("$i")
        }
	}
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    fizzBuzz(n)
}
