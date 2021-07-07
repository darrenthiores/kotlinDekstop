/*
(x) lanjutan collection operations
(x) fungsi find(), firstOrNull() & lastOrNull()
(x) fungsi find() --> berguna untuk mencari item didalam sebuah collection dgn kondisi
yg ditentukan dan akan langsung mengembalikkan nilai ketika kondisi terpenuhi
(x) fungsi firstOrNull --> sama dgn fungsi find() hanya saja bedanya jika pada item pertama
kondisi tidak terpenuhi maka akan mengembalikkan nilai null
(x) fungsi lastOrNull --> berfungsi untuk mencari item terakhir

(*) fungsi find() dan firstOrNull() sama
 */

fun main(){
    // menggunakan fungsi find()
    val randomList = listOf(1, 2, 3, 4, 5)
    val randomFind = randomList.find { it%3 == 2 }

    println(randomList)
    println(randomFind)

    // menggunakan fungsi firstOrNull()
    val randomFirst = randomList.firstOrNull{it%2 == 5} // tidak terpenuhi

    println(randomFirst)

    // menggunakan fungsi lastOrNull()
    val randomLast = randomList.lastOrNull()

    println(randomLast)
}