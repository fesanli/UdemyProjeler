package Projeler.Quests

import java.util.*

fun main() {
    // Soru 1
    // 10 elemanli bir diziye eleman olarak dizi indeks numaralarinin
    // faktoriyellerini atayin
    soru1()
    // Soru 2
    // Kullanicidan alinan 5 sayiyi diziye atayan ve atama islemi
    // bittikten sonra ekrana yazdirin
    soru2()
    // Soru 3
    // Calistiginda hangi ayda oldugumu String formatinda (January)
    // yazdiriniz
    soru3()
    // Soru 4
    // Boyutu ve elemanlarini kullanicinin belirledigi bir dizinin
    // elemanlarinin toplam degerlerini yazdiriniz
    soru4()
}

// fonksiyonlarin Unit deger dondurmesi void demekle es deger
fun soru1():Unit{
    println("---SORU 1---")
    var sonuc = Array<Int>(10){1}
    for (i in 0..sonuc.size-1){
        for (t in 1..i)
            sonuc[i] *= t
    }
    println("sonuc = ${sonuc.asList()}")
    println("-") in 1..10   // Write 10 times "-" ;)
}

fun soru2():Unit{
    println("---SORU 2---")

    var dizi = Array<Int>(5){0}

    for (i in 0..dizi.size-1){
        print("${i+1}.sayiyi giriniz: ")
        dizi[i] = readLine()!!.toInt()
    }

    for (eleman in dizi)
        println("eleman = ${eleman}")

    println("-") in 0..10   // Write 10 times "-" ;)
}
fun soru3():Unit{
    println("---SORU 3---")

    val takvim = Calendar.getInstance()

    println("takvim.get(Calendar.MONTH) = ${takvim.get(Calendar.MONTH)}")

    println("-") in 0..10   // Write 10 times "-" ;)
}
fun soru4():Unit{

}