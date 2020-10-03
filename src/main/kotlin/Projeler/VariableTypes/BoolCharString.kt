package VariableTypes

fun main() {
    var isTrue : Boolean = 5 > 4

    println("Value of isTrue variable: $isTrue")

    var letter : Char = 'a'

    println("Value of letter variable: $letter")

    var myName : String = "Ferhat Sanli"
    var lengthOfMyName : Int = myName.length

    println("My name is $myName. My name has $lengthOfMyName letters\nwith space between name and surname.")

    println("First letter of my surname is ${myName.get(7)}.")

}