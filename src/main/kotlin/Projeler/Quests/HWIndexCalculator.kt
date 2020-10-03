package Quests

fun main() {
    var height:Double = 1.79
    var weight:Double = 66.6

    var theIndexValue:Double = weight / (height * height)
    println("Your Height/Weight Index is $theIndexValue")
    println()
    val resultNote : String

    val maxKg:Double = 24.9 * height * height
    val minKg:Double = 18.5 * height * height
    
    if (theIndexValue < 18.5)
        resultNote = "You are too weak. Your weight should be above of $minKg"
    else if (theIndexValue < 25)
        resultNote = "You are normal. You have to stay between $minKg - $maxKg."
    else
        resultNote = "You are overweight. Your weight should be under of $maxKg"

    println(resultNote)



}