package com.daon.basics

fun main(){

    // 1. 변수 그리고 var과 val의 차이점

    //var은 가변
    var myName = "Daon"
    myName = "Noad"

    // val은 불변
    val Name = "Daon"
    // Name = "Noad" -> 불변이므로 추후에 변경이 불가능하여 오류 발생

    print("Hello $myName")

    // 2. 숫자 데이터 유형

    // Byte = 8bit, Short = 16 bit, Int = 32bit, Long = 64bit

    val Byte : Byte = 1
    val Short: Short  = 12
    val Int : Int = 123
    val Long : Long = 123456789

    // Float = 32bit, Double = 64bit
    val Float : Float = 1.23F
    val Double : Double = 1.23456789

    // 3. 데이터 유형

    // Boolean = true 또는 false만 반환
    var Sunny : Boolean = false

    // Char = 모든 데이터가 들어갈 수 있지만 한 자리만 차지할 수 있음
    val StrChar = 'A'
    var NumChar = '1'

    // String = 문자열 입력
    val String = "Daon is Studding"

    // 4. 문자열 견본

    val myStr = "Hello World"
    var firstChatInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    var myLength = myStr.length

    print("First Character is $firstChatInStr and the length of myStr is $myLength")

    // 5. 산술연산자  (+, -, *, /, %)
    var result = 5 + 3
    result += 2
    result -= 2
    result /= 2
    result *= 2
    result %= 2
    print(result)
}
