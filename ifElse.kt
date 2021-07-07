/*
(x) belajar percabangan di kotlin
(x) percabangan di kotlin menggunakan sintaks if, else, else if
(x) kotlin tidak mendukung ternary operator dan perannya digantikan dgn if expressions
(x) percabangan bisa dimasukkan kedalam variable
 */

// percabangan if

fun waktu(jam:Int): Unit{
        if(jam < 14){
        println("Sekarang jam $jam, maka belum sore!!")
    }
}

// percabangan if else
fun favoritYaya(bakso:Boolean): Unit{
    if(bakso==true){
        println("Benar bakso adalah makanan kesukaan yaya")
    } else {
        println("Bakso bukanlah makanan favorit yaya")
    }
}

// percabangan lebih dari 2
fun hargaBakso(harga:Int):Unit{
    if(harga>15000) {
        println("harga $harga terlalu mahal")
    } else if (harga > 10000) {
        println("harga $harga itu normal")
    } else {
        println("harga $harga murah banget")
    }
}

fun main() {
    // percabangan ke-1
    waktu(9)

    // percabangan ke-2
    favoritYaya(true)

    // percabangan ke-3
    hargaBakso(12500)

    // contoh percabangan dalam variable

    val duit = 1000
    val kekayaan = if(duit>=100000){
        println("kamu punya duit $duit maka kamu kaya")
    } else {
        println("duit kamu cuma $duit dasar miskin!!")
    }
}