import java.lang.StringBuilder

/*
(x) fungsi pada lambda receiver
(x) lambda receiver menggunakan argumen this untuk mengakses konteks
(x) ada 3, yaitu run, with dan apply
(x) fungsi run akan mengembalikkan nilai berdasarkan expression yg ada
pada lambda
(x) fungsi run akan sgt berguna jika didalam lambda terdapat inisialisasi objek
dan perhitungan untuk nilai kembalian
(x) fungsi with --> pd dsarnya bukan sebuah extension melainkan fungsi biasa
(x) pd fungsi with konteks objek nya disematkan sbg argumen dan nilai yg
dikembalikkan berdasarkan expression didalam lambda
(x) fungsi with disarankan mengakses anggotanya tanpa menyediakan kembalian
(x) fungsi apply --> berbeda dari fungsi" sebelumnya, nilai yg dikembalikkan
fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia
sebagai receiver
(x) sebaiknya penggunaan fungsi apply dapat melakukan inisialisasi dari
receivernya
(x) dari prakteknya dpat disimpulkan fungsi apply akan menyederhanakan
penulisan code
 */

fun main(){
    // penggunaan fungsi run
    val valueA = 10
    val divTwo = valueA.run{
        // inisialisasi objek
        val result = this / 2

        // kembalian nya
        "$this / 2 : $result"
    }
    println(divTwo)

    // penggunaan fungsi with
    val valueB = 2
    val randomMath = with(valueB){
        // kembalian
        "$valueA + $valueB : ${valueA+valueB}\n" +
        "$valueA - $valueB : ${valueA-valueB}"
    }
    println(randomMath)

    // contoh penggunaan fungsi with lainnya
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)

    // penggunaan fungsi apply
    // code dibawah tanpa penggunaan fungsi apply
    /*
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())
     */
    // jika menggunakan fungsi apply
    val builder = StringBuilder().apply {
        append("Hello ")
        append("World!!")
    }
    println(builder.toString())
}