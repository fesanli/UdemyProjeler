package ArrayRange

fun main() {
    var fiveToTen : IntRange = 5..10
    println(fiveToTen.toList())

    var threeToTwelve = 3.rangeTo(12)

    var aToZ = 'a'..'z'
    println(fiveToTen.elementAt(3))
    println(aToZ.elementAt(5))

//    var oneToTenReverse:IntRange = 10..1
    var oneToTenReverse = 10.downTo(1)
    println(oneToTenReverse.elementAt(1))

    var countTo20_5by5 = 0.rangeTo(20).step(5)
    println("First: ${countTo20_5by5.first}, last: ${countTo20_5by5.last}")

    var countTo20_5by5_Reverse = 100.downTo(20).step(5)
    println("100 to 20 numbers: ${countTo20_5by5_Reverse.toList()}")

    var is25Exist = 25 in countTo20_5by5_Reverse

    println("The 25 is exist in the array? (${is25Exist})")

}