package Projeler.preOOP

fun main() {

    val ismim : String = "Ferhat Sanli"
    println("ismim = ${ismim}")

//    Substring method
    println(ismim.substring(7))
//    Substring ornek 1:
    val instaID:String = ismim.toLowerCase().substring(0..1) +
            "." +
            ismim.toLowerCase().substring(7)
    println("instaID = ${instaID}")

    println("Instagram adresinin ${instaID.indexOf('.')+1}.karakterinde nokta karakteri var")
}