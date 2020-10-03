package Quests

fun main() {

    print("Please choose the number of one of the questions: ")
    var qNumber:Int = readLine()!!.toInt()

    // Question 1:
    if (qNumber == 1)
    {
        // take 2 number from user
        // do all (5) arithmetic operations
        print("First number: ")
        var n1 : Int = readLine()!!.toInt()
        print("Second number: ")
        var n2 : Int = readLine()!!.toInt()

        println("$n1+$n2 = ${n1+n2}")
        println("$n1-$n2 = ${n1-n2}")
        println("$n1*$n2 = ${n1*n2}")
        println("$n1/$n2 = ${n1/n2}")
        println("$n1%$n2 = ${n1%n2}(Mod value)")
    }

    //Question 2:
    else if (qNumber == 2)
    {
        // I'm expecting 7
        var i:Int = 5
        i=i++ //this line hasn't any effect
        i=++i
        println(i)
    }

    //Question 3:
    else if (qNumber == 3)
    {
        var result : Int = 2 + + 8 - - 2 + + 8 - - 2 + + 8
        // What will be the result of this operation?
        // My guess is: ---
        println("Question 3's result is $result")
    }

    // Question 4:
    else if (qNumber == 4)
    {
        var i:Int = 5
        i = i++ + ++i - i-- - --i
        // what equals is the i variable?
        // my answer:0
        println("Question 4's result is $i")
    }


}