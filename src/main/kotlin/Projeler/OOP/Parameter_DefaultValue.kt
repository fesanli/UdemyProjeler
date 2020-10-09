package Projeler.OOP

fun main() {
    var k1 = Kare()
    println("k1.alanniHesapla() = ${k1.alaniHesapla()}")

    var k2 = Kare(4)
    println("k2.alaniHesapla() = ${k2.alaniHesapla()}")
}


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
