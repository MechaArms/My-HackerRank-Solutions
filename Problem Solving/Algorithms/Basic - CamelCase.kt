/*
There is a sequence of words in CamelCase as a string of letters, s, having the following properties:

* It is a concatenation of one or more words consisting of English letters.
* All letters in the first word are lowercase.
* For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.

Given s, determine the number of words in s.

Example
s = oneTwoThree

There are 3 words in the string: 'one', 'Two', 'Three'.

Function Description

Complete the camelcase function in the editor below.

camelcase has the following parameter(s):

string s: the string to analyze

Returns

int: the number of words in s

Input Format

A single line containing string .

Sample Input

saveChangesInTheEditor

Sample Output

5

Explanation

String s contains five words:

1. save
2. Changes
3. In
4. The
5. Editor
*/

//My Solution
//===========

fun camelcase(s: String): Int {
    var count: Int = 1
    for (i in s){
        if (i == i.toUpperCase()){
            count ++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = camelcase(s)

    println(result)
}
