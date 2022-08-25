/*
Given the time in numerals we may convert it into words, as shown below:

5:00 -> five o' clock
5:01 -> one minute past five
5:10 -> ten minutes past five
5:15 -> quarter past five
5:30 -> half past five
5:40 -> twenty minutes to six
5:45 -> quarter to six
5:47 -> thirteen minutes to six
5:28 -> twenty eight minutes past five

At minutes = 0, use o' clock. For 1 <= minutes <= 30, use past, and for  use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.

Function Description

Complete the timeInWords function in the editor below.

timeInWords has the following parameter(s):

int h: the hour of the day
int m: the minutes after the hour

Returns

string: a time string as described

Input Format

The first line contains h, the hours portion The second line contains m, the minutes portion

Sample Input 0

5
47
Sample Output 0

thirteen minutes to six
Sample Input 1

3
00
Sample Output 1

three o' clock
Sample Input 2

7
15
Sample Output 2

quarter past seven
*/

fun timeInWords(h: Int, m: Int): String {
    val a = arrayOf(
        "zero", "one", "two", "three", "four", 
        "five", "six", "seven", "eight", "nine", 
        "ten", "eleven", "twelve", "thirteen", 
        "fourteen", "fifteen", "sixteen",  
        "seventeen", "eighteen", "nineteen",  
        "twenty", "twenty one", "twenty two",  
        "twenty three", "twenty four",  
        "twenty five", "twenty six", "twenty seven", 
        "twenty eight", "twenty nine"
    )
    return when {
        m == 0 -> "${a[h]} o' clock"
        m == 1 -> "${a[m]} minute past ${a[h]}"
        m == 15 -> "quarter past ${a[h]}"
        m == 30 -> "half past ${a[h]}"
        m == 45 -> "quarter to ${a[h + 1]}"
        m == 59 -> "${a[60 - m]} minute to ${a[h + 1]}"
        m < 30 -> "${a[m]} minutes past ${a[h]}"
        else -> "${a[60 - m]} minutes to ${a[h + 1]}"
    }

}

fun main(args: Array<String>) {
    val h = readLine()!!.trim().toInt()

    val m = readLine()!!.trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
