package VariableTypes

fun main() {

    var shortNumber : Short = Short.MAX_VALUE // Short.MAX_VALUE
    var intNumber : Int
    // Big one is able to store little one
    intNumber = shortNumber.toInt()
    println(intNumber)

    // I'm trying to figure out that what happens when you try to convert big to small one
    intNumber = 45000
    shortNumber = intNumber.toShort()
    println(shortNumber)

    var decimalNumber : Double = 54.2342423
    var decimalToInt : Int = decimalNumber.toInt()

    println("If you convert a decimal nuber ($decimalNumber) to an integer variable")
    println(", it will be result like this $decimalToInt")

    var anotherNumber = 8653
    println(anotherNumber.toString() + 1)


}