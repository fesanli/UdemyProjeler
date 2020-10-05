package Projeler.OOP

class Daire(var yaricap:Int){}

fun main() {
    var d1:Daire = Daire(3)
    var d2:Daire = Daire(5)

    alaniHesapla(d1)
    alaniHesapla(d2)
}

fun alaniHesapla(daire:Daire){
    println("Dairenin alani:")
    println("daire.kenar * daire.kenar * Math.PI = ${daire.yaricap * daire.yaricap * Math.PI}")
}