/*
(x) lanjutan collection operations
(x) fungsi count() --> berfungsi untuk menghitung jumlah item didalam collection
(x) fungsi count dapat dimasukkan parameter berupa kondisi yg berguna jika ingin
menghitung item berdasarkan kondisi yg diberikan
 */

fun main(){
    // menggunakan fungsi count()
    val randomList = listOf(1, 2, 3, 4, 5)
    val allList = randomList.count()

    println(randomList)
    println(allList) // hasilnya adalah jumlah item didalam list

    // menggunakan fungsi count dgn sebuah kondisi
    val conList = randomList.count { it%2 == 0 } // menghitung item yg habis dibagi 2

    println(conList) // hasilnya adalah 2 karena hanya ada 2 item yg habis dibagi 2
}