/*
(x) collection --> merupakan sebuah objek yg bisa menyimpan kmpulan objek lainnya
termasuk data class
(x) collection memiliki beberapa turunan, yaitu list, set dan map
(x) list --> berguna untuk menyimpan banyak data menjadi satu objek
(x) list dapat berisi bermacam" tipe data
(x) posisi tertentu didalam list dapat diakses menggunakan indexing
(x) list bersifat immutable atau tidak dapat diubah
(x) kotlin menyediakan collection list dgn tipe mutable sehingga dapat dilakukan
perubahan nilai, cara membuat nya adalah dgn menggunakan fungsi mutableListOf
 */

// data class
data class data(val name:String)

fun main(){
    // membuat list
    val randomList = listOf(1, 2, true, "hey")

    println(randomList)

    // memasukkan data class kedalam list
    val newList = listOf(data("Yaya"), 1, 3)

    println(newList)

    // mengakses posisi tertentu menggunakan indexing
    println(newList[0])
    println(randomList[3])

    // membuat mutable list
    val anyList = mutableListOf(1, 3, 4, true, 'A')

    println(anyList)

    // memanipulasi data didalam mutable list
    // untuk menambahkan data maka menggunakan fungsi add()
    anyList.add("Yoo!!")

    println(anyList)

    // untuk menambahkan data diposisi tertentu menggunakan add(index, value)
    anyList.add(0, 'Y')

    println(anyList)

    // untuk mengubah nilai didalam list
    anyList[1] = false

    println(anyList)

    // untuk menghapus data dalam list, menggunakan fungsi removeAt() dgn param index
    anyList.removeAt(3)

    println(anyList)

}