/*
(x) lanjutan collection operation
(x) fungsi sorted()
(x) sorted() berfungsi untuk mengurutkan item didalam collection, dgn urutan
secara ascending
(x) jika menginginkan sorting secara descending, maka kita dapat menggunakan
fungsi sortedDescending()
 */

fun main(){
    // menggunakan fungsi sorted()
    val randomNum = listOf(10, 6, 3, 12, 1, 2, 6, 2, 2, 7)
    val randomChar = listOf('z', 's', 'a', 'd', 'r', 'v')

    // sorted()
    val sortedNum = randomNum.sorted()
    val sortedChar = randomChar.sorted()

    // descending --> sortedDescending()
    val desNum = randomNum.sortedDescending()
    val desChar = randomChar.sortedDescending()

    println(randomNum)
    println(sortedNum)
    println(desNum)

    println(randomChar)
    println(sortedChar)
    println(desChar)
}