/*
(x) lanjutan dari dataClass_2
(x) selain fungsi toString() dan equals(), dgn data class kita dapat
menyalin sebuah objek dgn mudah dgn fungsi copy()
(x) selain menyalin objek, kita juga dapat memodifikasinya dgn nilai baru
(x) tanpa menggunakan data class, untuk melakukan hal sperti ini akan memerlukan
sebuah instance baru untuk mengubah nilai dari objek
 */

data class movie(val genre : String, val rating : Int)

fun main(){
    // menggunakan fungsi copy()
    val vincenzo = movie("Drama", 10)
    val theConjuring = movie("Horror", 8)
    val startUp = vincenzo.copy() // menggunakan copy() --> hasilnya akan sama sprti vincenzo
    val theUnholy = theConjuring.copy(rating=0) // memodifikasi objek dan memasukkan nilai baru

    println(vincenzo)
    println(theConjuring)
    println(startUp)
    println(theUnholy)
}