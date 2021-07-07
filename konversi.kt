/*
(x) konversi tipe data pada kotlin
(x) pada kotlin tidak dapat melakukan konversi tipe data scr langsung
(x) untuk melakukan konversi maka dapat menggunakan :
- toByte(): Byte
- toShort(): Short
- toInt(): Int
- toLong(): Long
- toFloat(): Float
- toDouble(): Double
- toChar(): Char
 */

// contoh konversi
fun main(){
    val stringNum = "5.5"
    val doubleNum: Double = 4.5

    val hasil = doubleNum + stringNum.toDouble()

    println ("hasil dari $stringNum + $doubleNum = $hasil")

    // selain itu, kotlin juga menyediakan cara untuk menuliskan readable number dgn cara
    // menggunakan underscore (_)
    // contoh penggunaan nya
    val money = 1_000_000

    println ("duit yg yaya miliki jumlahnya adalah rp.$money")
}