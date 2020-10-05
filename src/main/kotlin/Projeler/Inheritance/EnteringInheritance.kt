package Projeler.Inheritance

open class GeometrikSekil{
    var en:Int = 0
    var boy:Int = 0



    open fun alanHesapla() {
        println("super.toString() =\t ${super.toString()}")
        println("this.toString() =\t ${this.toString()}")
        println("")
    }

    override fun toString(): String {
        return "Alan: ${en*boy}"
    }
}

class Kare : GeometrikSekil() {
    override fun alanHesapla() {
        println("---Kare Alan Hesaplama---")
        println("en*boy = ${en * boy}")
    }
}


fun main() {
    var gs1: GeometrikSekil = GeometrikSekil()

    gs1.alanHesapla()
    println("kare.toString() =\t ${gs1.toString()}")

    var k1:Kare = Kare()

}