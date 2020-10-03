package ArrayRange

fun main() {
    var name : String? = null

    println(name)
    println(name?.length) // one question mark says this can be a null, accept  it
//    println(name!!.length)  // 2 exclamations say don't care about null

    var theNumber : Int?
    theNumber = 13
    println(theNumber)

    theNumber = null
    println(theNumber)
    println(theNumber.toString().length)

}