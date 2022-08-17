/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
s = '12:01:00PM'

Return '12:01:00'.

s = '12:01:00AM'

Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in 12 hour format

Returns

string: the time in 24 hour format

Input Format

A single string s that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).

Constraints

All input times are valid

Sample Input 0

07:05:45PM

Sample Output 0

19:05:45
*/

fun timeConversion(s: String): String {
    var time24: String
    val getTime = s.substring(0, 8)
    val getHour = s.substring(0, 2)
    val getMinutes = s.substring(2, 8)
    var getZone = s.filter({ it -> it.isLetter() })

        
    if (getZone == "AM") {
        time24 = if (getHour == "12") "00$getMinutes" else getTime
    } else {
        var sum = getHour.toInt() + 12
        time24 = if (getHour == "12") getTime else "$sum$getMinutes"
    }
    return time24
}

fun main(args: Array<String>) {
    val s = readLine()!!  // s = "07:05:45PM"

    val result = timeConversion(s)

    println(result)
}
