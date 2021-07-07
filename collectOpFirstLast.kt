/*
(x) lanjutan collection operations
(x) fungsi first() & last()
(x) berfungsi untuk menyaring item pertama atau terakhir dari sebuah collection dan
dapat dimasukkan sebuah kondisi.
(*) jika memasukkan kondisi di fungsi tadi dan kondisi tidak terpenuhi maka hasilnya
akan menjadi exception
 */

fun main(){
    // menggunakan fungsi first() & last()
    val randomList = listOf(1, 2, 3, 4, 5)

    // first
    val firstList = randomList.first()

    // last()
    val lastList = randomList.last()

    // menggunakan kondisi
    val conList = randomList.first{it%2==1}

    // menggunakan kondisi tidak terpenuhi
    // val conList_2 = randomList.last{it>5} --> akan menghasilkan exception

    println(randomList)
    println(firstList)
    println(lastList)
    println(conList)
    // println(conList_2)
}