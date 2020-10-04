package Projeler.OOP

class Person {
    var isim:String = "Ferhat"
    var yas:Int = 25

    fun selamVer(){
        println("Merhaba")
    }

    fun dogduguYil() = 2020 - yas
}

fun main() {
    var kisi:Person = Person()
    kisi.isim
    kisi.yas
    println("kisi.isim = ${kisi.isim}")
    println("kisi.yas = ${kisi.yas}")
    println("kisi.dogduguYil() = ${kisi.dogduguYil()}")
}