/*
(x) lanjutan collection operation
(x) fungsi sum()
(x) sum() khusus hanya bisa digunqakan pada collection bertipe angka
(x) sum() berfungsi untuk menjumlahkan semua data yg ada pada collection
 */

fun main(){
    // menggunakan fungsi sum
    val randomList = listOf(1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6)

    val sumList = randomList.sum()

    println(randomList)
    println(sumList)
}