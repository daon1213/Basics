package com.daon.basics

// Having multiple overloads:

class Person(var firstName: String, var lastName: String) {
    var age: Int? = null
    var eyeColor: String? = null

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String):
            this(firstName, lastName, age)  {
        this.eyeColor = eyeColor
    }
}


class Car() {

    lateinit var owner : String
    var maxSpeed: Int = 0
    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }


    // default setter and getter
    var myModel: String = "M5"
        private set

    var myMaxSpeed: Int = maxSpeed
        get() = field
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
        }

    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}
