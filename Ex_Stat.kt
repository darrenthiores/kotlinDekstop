/*
(x) Expression & Statement
(x) keduanya merupakan hal yg berbeda
(x) statement merupakan suatu fungsi yg tidak mengembalikkan nilai
(x) expression merupakan suatu proses yg mengembalikkan nilai yg dmna
nilai tersebut bisa dimasukkan kedalam sebuah variable
(x) pada kotlin percabangan bisa dijadikan sebuah expression
(x) didalam sebuah expression bisa terdapat sebuah expression
(x) contoh lain statement adalah inisialisasi variable
 */

// expression didalam expression
fun min(value_1:Int, value_2:Int) = value_1 - value_2

fun main(){
    // contoh statement
    val pretty = true

    if (pretty!=true){
        println("u're not pretty!")
    } else{
        println("hi! pretty woman")
    }

    // contoh expression
    val jamMasuk = 9
    val jamKerja = 8

    val ketepatan = if(jamKerja>jamMasuk) "Anda datang tepat waktu" else "Anda terlambat!!"

    println (ketepatan)

    // expression didalam expression
    val hasil = min(1*10, 3)

    println ("hasil : $hasil")
}