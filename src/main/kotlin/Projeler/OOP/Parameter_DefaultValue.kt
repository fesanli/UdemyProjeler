package Projeler.OOP

import Projeler.Inheritance.Kare

class Kare {

    var tekKenar: Int = 0

    constructor(){
        this.tekKenar = 1
    }
    constructor(kenar: Int){
        this.tekKenar = kenar
    }

    fun alaniHesapla() : Int = tekKenar * tekKenar
}

fun main() {
    var k1 = Kare()
    println("k1.alanniHesapla() = ${k1.alaniHesapla()}")

    var k2 = Projeler.Inheritance.Kare(4)
    println("k2.alaniHesapla() = ${k2.alaniHesapla()}")
}