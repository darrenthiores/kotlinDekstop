/*
(x) learning control flow
(x) control flow --> cara kita mengontrol alur dari suatu program berdasarkan kondisi saat
program berjalan
(x) bagian" dari control flow :
- enumeration
- when expression
- Expression & Statement
- While and Do While
- Range and For Loop
- Break and Continue Labels
 */

/*
(x) enumeration --> berfungsi untuk menyimpan kumpulan objek (seperti array) yg telah
menjadi data konstanta
(x) enumeration dapat dijadikan nilai dalam suatu variable
(x) enumeration juga berguna untuk meminimalisir kesalahan pengetikan dan membuat kode
yg ditulis menjadi lebih bersih dan mudah dibaca
(x) untuk membuat enumeration menggunakan kata kunci enum
(x) objek didalam enum bersifat static dan final (tidak dapat diubah)
 */

// contoh enumeration
enum class spec(val value: String){
    specA("Kencang"),
    specB("Lambat")
}

enum class color{
    White,
    Black,
    Brown
}

fun main(){
    // menjadikan enum sebuah nilai dalam variable
    val typeA = spec.specA
    val typeB = spec.specB

    println(typeA)
    println(typeB)

    val colorWhite = color.White
    val colorBlack = color.Black
    val colorBrown = color.Brown

    println(colorWhite)
    println(colorBlack)
    println(colorBrown)
}