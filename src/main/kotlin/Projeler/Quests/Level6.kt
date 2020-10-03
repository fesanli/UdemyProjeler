package Quests

fun main(args: Array<String>) {
    var soruNo = 10

    if (soruNo == 1)
    //soru 1
    run{
        var sayilar : Array<Int> = arrayOf(0,0,0)
        println(":::Girilen 3 sayinin ortalamasini alan uygulama:::")


        var toplam : Int = 0
        for (i in 0..2)
        {
            print("${i+1}.Sayiyi giriniz:")
            sayilar[i] = readLine()!!.toInt()
            toplam += sayilar.get(i)
        }

        print("Girdiginiz sayilarin ortalamasi: ${toplam/3} \n")
    }
    else if (soruNo == 4)
    run{
        // kendi adini 5 kere ekrana yazdirmayi tum dongulerle yap
        // for , while , do-while
        println("For dongusu, 5 tekrar")

        for (i in 0..4)
            println("Merhaba ${i+1}.tekrar")

        println("While dongusu, 5 tekrar")

        var i = 0
        while (i<5)
            println("Merhaba ${i++ + 1}.tekrar")

        println("do-while dongusu, 5 tekrar")
        i = 0
        do {
            println("Merhaba ${i++ + 1}.tekrar")
        }while (i<5)


    }
    else if (soruNo == 10)
    {
        // carpim tablosunu olustur

        var carpimTablosu = Array(11) { IntArray(11)}
        for (x in 1..10){
            for (y in 1..10){
                carpimTablosu[x][y] = x*y
            }
        }

        // x tek olanlari ilk satira yazdir
        /*
        *       1*1=1       3*1=3   ...
        *       1*2=2       3*2=6   ...
        *        ...         ...
        *        ...         ...
        * */

        for (y in 1..10) {
            for (x in 1.rangeTo(9).step(2)) {
                print("$x*$y=${x * y}\t\t")

            }
            print("\n")
        }
        println("")
        for (y in 1..10) {
            for (x in 2.rangeTo(10).step(2)) {
                print("$x*$y=${x * y}\t\t")

            }
            print("\n")
        }
    }

}