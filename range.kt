/*
(x) range --> merupakan tipe unik pada kotlin
(x) range dapat ditentukan nilai awal dan nilai akhirnya
(x) ada 3 cara untuk membuat range, yaitu :
- menggunakan dua titik (..)
- menggunakan fungsi rangeTo() --> sama dgn yg dua titik (..)
- menggunakan fungsi downTo() --> jika ingin membuat range terbalik atau urutan terbalik
(x) jarak antara 2 nilai pada range ditentukan oleh step, step sendiri scr default bernilai 1
(x) untuk mendapatkan nilai step bisa menggunakan .step
(x) nilai step bisa kita tentukan sendiri, dgn cara menginisialisasi niali yg dicakup range
(x) range pada kotlin mendukung beberapa tipe, seperti Intrange, LongRange dan CharRange
 */

fun main(){
    // membuat range cara ke-1
    val rangeA = 1..5
    for (i in rangeA){
        println("Range $i")
    }

    // mendapatkan nilai step
    println(rangeA.step)

    // membuat range dan mengganti nilai step nya
    val rangeB = 0..10 step 2
    for (i in rangeB){
        println("rangeB $i")
    }

    println(rangeB.step)

    // membuat range cara ke-2
    val rangeC = 1.rangeTo(5) step 2
    for (i in rangeC){
        println("RangeC $i")
    }

    // membuat range terbalik
    val rangeD = 15.downTo(1) step 3
    for (i in rangeD){
        println("RangeD $i")
    }

    // memeriksa apakah suatu nilai ada pada range menggunakan kata kunci in
    val rangeE = 1..10
    if (5 in rangeE){
        println("It is there!")
    }

    // memeriksa jika suatu nilai tidak ada didalam range menggunakan kata kunci !in
    val rangeF = 1..5
    if (6 !in rangeF){
        println("It isn't there!")
    }

    // membuat range dgn tipe character
    val rangeChar = 'A'..'J'

    for (i in rangeChar){
        println(i)
    }
}