/*
(x) lambda argument
(x) lambda argument menggunakan argumen it untuk mengakses konteks
(x) pd lambda argument terdapat 2 fungsi
(x) fungsi let --> penggunaan fungsi let akan bnyak ditemukan pada objek
bertipe non-null
(x) pada fungsi let nilai kembalian bergantung pada expression yg
berada di lambda
(x) fungsi also sama sperti fungsi apply, dimana nilai yg dikembalikan\
adalah konteks objek, namun bedanya menggunakan argumen it
(x) sebaiknya fungsi also digunakan ketika ingin menggunakan konteks
dari objek sbg argumen tanpa harus mengubah nilainya
 */

fun main() {
    // penggunaan fungsi let
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }
    /*
    penjelasan code diatas, elvis operator berfungsi sbg else
    yaitu dimana jika objek bernilai null maka akan dijalankan fungsi
    run diatas
     */

    // penggunaan fungsi also
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")

    /*
    penjelasan code diatas, fungsi also adalah ketika kita memanggil konteks
    objek maka akan ada tambahan expression dari yg kita tulis didalam lambda
     */

    // penggunaan fungsi also (2)
    val introduce = "Nice to meet you all!!"
    val personal = introduce.also {
        println("My name is fidel")
        println("i am 18 years old")
    }

    println(personal)
}