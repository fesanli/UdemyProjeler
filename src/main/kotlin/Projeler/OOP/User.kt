package Projeler.OOP

class User (var id: Int, var isim: String){

    var adres: String = ""

    init {
        if (id < 0) id = 1
        println("id = ${id}")
        println("isim = ${isim}")
    }

    constructor(id: Int, isim: String, adres: String) : this(id,isim){
        this.adres = adres
    }
}

fun main() {
    var ferhat:User = User(-5, "Ferhat", "Mugla")
    var birkan:User = User(502, "Birkan")

    var kul1: User = User(27, "Zeki")
    var kul2: User = User(57, "Bilal")

}