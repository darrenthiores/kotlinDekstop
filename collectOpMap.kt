/*
(x) lanjutan collection Operations
(x) fungsi selanjutnya adalah map()
(*) it merepresentasikan masing" item pada collection
(x) map() --> berfungsi membuat collection baru sesuai perubahan yg dilakukan pada
collection sebelum nya
 */

fun main(){
    // contoh penggunaan map()
    val randomList = listOf(1, 2, 3, 4, 5)
    val newList = randomList.map { it * 2 } // semua item pada list akan dikali 2

    println(randomList)
    println(newList) // hasilnya semua dikali 2
}