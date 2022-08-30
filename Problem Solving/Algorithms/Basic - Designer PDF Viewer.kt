/*
When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue
rectangle. In this PDF viewer, each word is highlighted independently.

In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the letter
heights given, determine the area of the rectangle highlight in mm² assuming all letters are wide.

Input Format

The first line contains 26space-separated integers describing the respective heights of each consecutive
lowercase English letter, ascii[a-z].
The second line contains a single word, consisting of lowercase English alphabetic letters.

Constraints

1 <= h? <= 7, where ? is an English lowercase letter.
Word contains no more than 10 letters.

Output Format
Print a single integer denoting the area in mm² of highlighted rectangle when the given word is selected.
Do not print units of measure.


Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 0

9

Explanation 0

We are highlighting the word abc :

Letter heights are a=1, b=3 and c=1. The tallest letter, b, is 3mm high. The selection area for this
word is 3 * 1mm * 3mm = 9 mm².

Note: Recall that the width of each character is .

Sample Input 1

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba

Sample Output 1

28

Explanation 1

The tallest letter in is at . The selection area for this word is 
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
 * Complete the 'designerPdfViewer' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY h
 *  2. STRING word
 */

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val alphabet: List<Char> = ('a'..'z').toList()
    var a = 0
    word.forEach {
        var b = alphabet.indexOf(it)
        if(a<h[b]){
            a = h[b]
        }
    }
    return a * word.length
}

fun main(args: Array<String>) {

    val h = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}
