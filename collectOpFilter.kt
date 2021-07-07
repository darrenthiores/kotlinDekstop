/*
(x) collection memiliki beberapa fungsi operasi yg dapat digunakan untuk mengakses data
didalamnya
(x) yg pertama fungsi filter() dan filternot()
(x) filter() --> berfungsi untuk menseleksi suatu collection terhadap kondisi yg diberikan
dan data yg sesuai dgn kondisi akan menjadi list baru
(x) filterNot() --> sebaliknya, filterNot() berfungsi untuk membuat list baru dgn isi
data yg tidak sesuai dgn kondisi yg diberikan
 */

fun main(){
    // menggunakan fungsi filter()
    val randomList = listOf(1, 2, 4, 5, 6, 4, 6, 2, 3, 3, 9, 12, 10)
    val newList = randomList.filter { it % 3 == 0 }

    println(randomList)
    println(newList)

    // menggunakan fungsi filterNot()
    val newNum = randomList.filterNot { it%3 == 0 }

    println(newNum) // hasilnya adalah kebalikan dari filter()
}