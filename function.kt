/*
(x) Learning how to make function in kotlin
(x) function merupakan sebuah prosedur yg mana ketika dipanggil akan menjalankan program didalamnya
(x) pendeklarasian fungsi pada kotlin diawali dengan fun lalu dilanjut dgn nama fungsi nya, setelah
itu masukkan nama parameter dan tipe nya (dipisahkan menggunakan titik dua (:))
(*) --> contoh penulisan function
fun functionName(param1 : Type1, param2 : Type2, ...) : ReturnType {
    return result}
(*) fungsi pada kotlin selalu mengembalikkan nilai dan tipe kembalian merupakan nilai yg akan
dikembalikkan ketika fungsi dipanggil
(x) jika suatu fungsi hanya memiliki 1 expression maka fungsi bisa diubah menjadi body expression
dgn memberi tanda sama dengan (=)
(x) jika menginginkan fungsi tidak mengembalikkan nilai maka dapat menggunakan (Unit)
 */

// contoh function

fun operasiTambah(value1 : Int, value2 : Int): Int{
    val hasil = value1 + value2
    println("hasil $value1 + $value2 = $hasil")
    return hasil
}

// contoh body expression

fun Person(name : String, age : Int) = "My name is $name and i am $age years old"

// penggunaan Unit

fun hewan(spesies : String) : Unit{
    println("spesies hewan : $spesies")
}

// pemanggilan fungsi
// pemanggilan fungsi dilakukan dgn cara seperti biasa

fun main(){
    // cara ke-1
    val person_1 = Person("Yaya", 18)

    println(person_1)

    // cara ke-2
    operasiTambah(10, 10)

    // pemanggilan Unit
    hewan("ayam")
}