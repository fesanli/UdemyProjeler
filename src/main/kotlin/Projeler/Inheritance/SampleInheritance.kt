package Projeler.Inheritance

open class Person (isim:String , yas:Int, isMan:Boolean) {
    /*
    *   Language Translations:
    *   isim = name
    *   yas = age
    *   Ogretmen = Teacher
    * */

    var isim : String
    var yas : Int
    var isMan : Boolean

    init {
        println("init of person class triggered")
        this.isim = isim
        this.yas = yas
        this.isMan = isMan
    }

    override fun toString(): String {
        var cinsiyet = if (isMan) "Erkek" else "Kadin"
        return "Isim: $isim, Yas: $yas, Cinsiyet: $cinsiyet"
    }
}
class Ogretmen (isim:String, yas:Int, isMan: Boolean, brans:String) : Person (isim, yas, isMan){
    var brans:String

    init {
        println("init of Ogretmen triggered")
        this.brans = brans
    }

}


fun main() {
    var p1 : Person = Person("ferhat", 25, true)
    println("toString: ${p1.toString()}")
    println("just var name: ${p1}")

    var t1:Ogretmen = Ogretmen("anna", 37, false, "Acting")
    println(t1)
}
















