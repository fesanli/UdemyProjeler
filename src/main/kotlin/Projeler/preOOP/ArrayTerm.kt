package Projeler.preOOP

fun main() {
    //(3)
    // dizi boyutu parantezler icindeki deger belirliyor
    //{1}
    // suslu parantez icindeki deger tum hucrelere varsayilan deger
    // atamasi yapmaya yariyor
    var sayilarDizim = Array<Int>(3){1}

    // tum degerleri initialize deger atamasi yaptigim
    // icin istedigim hucredeki veriyi degisitirebiliyorum
    sayilarDizim[2] = 43

    // Array sinifindaki asList metodu ile diziyi liste olarak
    // yazdirabiliyorum
    println("sayilarDizim = ${sayilarDizim.asList()}")


}