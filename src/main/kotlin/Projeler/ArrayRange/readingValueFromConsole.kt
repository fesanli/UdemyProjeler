package ArrayRange

fun main(args: Array<String>) {

    print("Please enter your name: ")
    var userName : String? = readLine()

    print("Please enter your surname: ")
    var userSurname : String = readLine()!!     //while entering value from console, it will never return null, it's ok

    print("Age: ")
    var userAge : Int = readLine()!!.toInt()  //place of exclamation is similar with pointers

    println("Name: $userName, Surname: $userSurname, Age: $userAge")
    println("Length of the name: ${userName?.length}")
    // if you don't make an operation with nullable variables
    // then you don't have to add question mark while printing

}