/*
(x) kita dapat mendeklarasikan extension dgn nullable receiver type
(x) nullable receiver type dibutuhkan jika ada objek bernilai null
(x) extension akan bisa dipanggil pada objek bernilai null
(x) untuk membuat nullable receiver type kita dpat menggunakan
if expression atau elvis operator
(x) jika kita tidak membuat nullable receiver type, kita perlu memeriksa
apakah objek bernilai null atau tidak, maka kita dapat juga menggunakan
operator safecall
 */

// menggunakan if expression
val Int?.Num: Int
get() = if(this == null) 0 else this.div(2)

/*
(x) penjelasan code diatas
(x) if berfungsi jika objek bernilai null maka akan menjadi
non-null yaitu dgn default value 0
(x) jika bernilai tidak null, maka objek akan dibagi 2 dgn fungsi div()
 */

// menggunakan elvis operator
val Int?.randomNum: Int
get() = this?.div(2) ?: 1 // hasilnya akan sama spt if exp

// menggunakan safe call op (pada saat pemanggilan)
val Int.newNum: Int
get() = this.div(2) // tidak ada default value

fun main(){
    // pemanggilan (dgn if ex)
    println(null.Num) // bernilai null
    println(2.Num) // tidak null

    // pemanggilan (dgn elvis op)
    println(null.randomNum) // bernilai null
    println(4.randomNum) // tidak null

    // pemanggilan (safe call)
    println(null?.newNum) // bernilai null
    println(6?.newNum) // tidak null
}