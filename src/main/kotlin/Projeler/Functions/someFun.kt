package Projeler.Functions

import java.util.*

fun main() {

//    farkli bir kullanim daha var
    fun benKimim() = "Ferhat"
    fun sayiTopla(x:Int, y:Int) = x+y
    fun daireninAlani(r:Int) = 3.14*r*r



    hello(benKimim())
    println("---")
    hello("Ferhat", 13)
    println("5+5=${sumTheNumbers(5,5)}")
    var sayilarinToplami : Int = sumTheNumbers(5,5)
    println("sayilarinToplami = ${sayilarinToplami}")
    println("sayiTopla(3,4) = ${sayiTopla(3, 4)}")
    println("daireninAlani(4) = ${daireninAlani(4)}")
    println("---")
    print(">>")
    var birSayi : Int? = readLine()!!.toInt() //  cift unlem yaptiginda girdi eger null deger olursa hatalari
                                                //umursama demek oluyor
                    //Int? sonundaki soru isareti bu degisken null deger de tutabilir demek oluyor
    //  soutv {tab} yaptiginda boyle snippet oluyor
    println("birSayi = ${birSayi}")

    println("guncelSaat() = ${guncelSaat()}")
}

fun hello(name : String){
    println(name)
}

fun hello(name : String, repeatCount : Int){
    for (i in 1.rangeTo(repeatCount))
        println("$i. name = [${name}], repeatCount = [${repeatCount}]")
}

fun sumTheNumbers(num1 : Int, num2 : Int) : Int{
    return num1 + num2
}

fun guncelSaat() : Int {
    val calendar : Calendar = Calendar.getInstance()
    return calendar.get(Calendar.HOUR)
}