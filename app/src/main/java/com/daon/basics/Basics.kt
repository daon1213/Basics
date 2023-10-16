package com.daon.basics

fun main() {

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

    val Byte: Byte = 1
    val Short: Short = 12
    val Int: Int = 123
    val Long: Long = 123456789

    // Float = 32bit, Double = 64bit
    val Float: Float = 1.23F
    val Double: Double = 1.23456789

    // 3. 데이터 유형

    // Boolean = true 또는 false만 반환
    var Sunny: Boolean = false

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

    // 6. 비교 연산자
    val isEqual = 5 == 3

    println("isEqual is " + isEqual)
    val isNotEqual = 5 != 5
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    // 7. 대입 연산자
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    // 8. 증감 연산자
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    // Control Flows
    // If Statements
    var age = 17
    if (age >= 21) {
        print("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if (age >= 18) {
        print("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16) {
        print("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else {
        print("you're too young")
    }

    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when (month) {
        1, 2, 3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when (age) {
        // with the !in it's the same as saying not in ...
        !in 0..20 -> print("now you may drink in the US")
        in 18..20 -> print("now you may vote")
        16, 17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x: Any = 13.37
    when (x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}

