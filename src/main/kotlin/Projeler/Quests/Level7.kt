package Projeler.Quests

import java.util.*

fun main() {
    // Soru 1
    // 10 elemanli bir diziye eleman olarak dizi indeks numaralarinin
    // faktoriyellerini atayin
    Coz.soru1()
    // Soru 2
    // Kullanicidan alinan 5 sayiyi diziye atayan ve atama islemi
    // bittikten sonra ekrana yazdirin
    Coz.soru2()
    // Soru 3
    // Calistiginda hangi ayda oldugumu String formatinda (January)
    // yazdiriniz
    Coz.soru3()
    // Soru 4
    // Boyutu ve elemanlarini kullanicinin belirledigi bir dizinin
    // elemanlarinin toplam degerlerini yazdiriniz
    Coz.soru4()
}

object Coz{

    // fonksiyonlarin Unit deger dondurmesi void demekle es deger
    fun soru1(): Unit {
        println("---SORU 1---")
        var sonuc = Array<Int>(10) { 1 }
        for (i in 0..sonuc.size - 1) {
            for (t in 1..i)
                sonuc[i] *= t
        }
        println("sonuc = ${sonuc.asList()}")
        println("-".repeat(12))   // Write 10 times "-" ;)

    }

    fun soru2(): Unit {
        println("---SORU 2---")

        var dizi = Array<Int>(5) { 0 }

        for (i in 0..dizi.size - 1) {
            print("${i + 1}.sayiyi giriniz: ")
            dizi[i] = readLine()!!.toInt()
        }

        for (eleman in dizi)
            println("eleman = ${eleman}")

        println("-".repeat(12))   // Write 10 times "-" ;)
    }

    fun soru3(): Unit {
        println("---SORU 3---")

        val takvim = Calendar.getInstance()

        val ayString : String = when(takvim.get(Calendar.MONTH)){
            Calendar.JANUARY -> "Ocak"
            Calendar.FEBRUARY -> "Subat"
            Calendar.MARCH -> "Mart"
            Calendar.APRIL -> "Nisan"
            Calendar.MAY -> "Mayis"
            Calendar.JUNE -> "Haziran"
            Calendar.JULY -> "Temmuz"
            Calendar.AUGUST -> "Agustos"
            Calendar.SEPTEMBER -> "Eylul"
            Calendar.OCTOBER -> "Ekim"
            Calendar.NOVEMBER -> "Kasim"
            Calendar.DECEMBER -> "Aralik"
            else -> "HATA ${Calendar.MONTH}"
        }

        println("takvim.get(Calendar.MONTH) = ${takvim.get(Calendar.MONTH)}")
        println("ayString = ${ayString}")
        println("-".repeat(12))   // Write 10 times "-" ;)
    }

    fun soru4(): Unit {
        println("---SORU 4---")
        println("1-Enter the size of array")
        println("2-Enter numbers as many as size of the array")
        println("3-Get the summary of the numbers which you entered")
        println()
        print("Size of array: ")
        val sizeOfArray:Int = readLine()!!.toInt()
        var myArray = Array<Int>(sizeOfArray){0}
        var sumOfArray:Int = 0
        for (i in 0..sizeOfArray-1){
            print("${i+1}.number: ")
            myArray[i] = readLine()!!.toInt()
            sumOfArray += myArray[i]
        }
        println("sumOfArray = ${sumOfArray}")



        println("-".repeat(12))   // Write 10 times "-" ;)
    }
}

