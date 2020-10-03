package Projeler.Functions

fun main() {
    /*
    *   fonksiyon overloading yap
    *   -isim yazdir
    *   -yas yazdir
    * */

    ben("Ferhat")
    ben(25)

    /*
    *   varargs kullan
    *   -topla
    *   -carp
    * */

    topla(5,9,4)

}

fun ben(isim:String){
    println("isim = [${isim}]")
}
fun ben(yas:Int){
    println("yas = [${yas}]")
}

fun topla(vararg sayilar:Int){
    var toplam:Int = 0
    for (n in sayilar) toplam += n
    println("toplam = ${toplam}")
}

