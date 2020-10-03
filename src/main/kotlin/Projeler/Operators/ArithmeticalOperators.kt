package Operators

fun main() {
    var n1:Int = 15
    var n2 = 4

    println("Summary of the numbers: " + (n1+n2))
    println("Subtraction of the numbers: $n1-$n2")
    println("Subtraction of the nubmers: ${n1-n2}")

    println("\nUsage 1:")
    println("Multiplication of the numbers: " + (n1*n2))
    println("Division of the numbers: " + (n1/n2))

    println("\nUsage 2:")
    println("Multiplication of the numbers: ${n1*n2}")
    println("Division of the numbers: ${n1/n2}")

    println("\nThe only difference is at coding between two usage types.")
    println("Second usage is more practical one.")

    println("\nMod operation result: ${n1%n2}")
}