/*
(x) varArg atau variable argument
(x) vararg berfungsi sbg parameter tunggal bagi beberapa parameter dgn tipe sama
(x) dgn vararg sebuah fungsi dpt memiliki jumlah parameter berdasarkan jumlah argumen
yg dimasukkan ketika fungsi dipanggil
(x) kita bisa menerapkan generic untuk tipe param ketika param ditentukan dgn vararg
(krg mengerti)
(x) ketika sebuah param ditentukan dgn vararg, maka pd dasarnya semua argumen
akan ditampun didalam Array<out T> (krg mengerti)
(x) karena pada dasarnya vararg merupakan array, maka kita bisa memanggil
fungsi atau prop yg tersedia pada array
(x) penggunaan vararg adalah ketika sebuah fungsi tidak mengetahui jumlah
argumen yg ingin dimasukkan ketika fungsi dipanggil
(x) tidak bisa ada 2 param bertanda vararg atau akan terjadi error
(x) jika ingin menambahkan param lain, sebaiknya vararg berada pada posisi
pertama
(x) jika param dgn tanda vararg tidak berada pd posisi pertama, kita harus
menggunakan named argument untuk menambahkan argumen pada param yg tidak
ditandai vararg
 */
/*
(X) perbedaan menggunakan vararg vs Array<T>
(x) ketika menggunakan Array<T> kita membutuhkan argumen berupa nilai berbentuk array
(x) ketika menggunakan vararg kita memasukkan argumen satu persatu dan bahkan bisa
memasukkan nilai berbentuk array dgn menggunakan spread operator (*)
(x) spread operator digunakan dgn menempatkannya sebelum nama variable
 */

// membuat fun dgn vararg
fun sum(vararg value:Int):Int{
    val hasil = value.sum()
    return hasil
}

fun fPlayer(club:String, vararg player:String){
    println("Club : $club")
    player.forEachIndexed{i, v ->
        println("$i. $v")
    }
}

// membuat fun dgn Array<T>
fun arraySum(value: IntArray):Int{
    val hasil = value.sum()
    return hasil
}

fun main(){
    // penggunaan vararg
    val sum_1 = sum(1, 2, 3, 4, 5)

    println(sum_1)

    // penggunaan vararg bersamaan dgn param lain tanpa tanda vararg
    val barcaPlayer = fPlayer(club = "Barcelona", "Messi", "Pedri", "F Dejong")

    // pemanggilan Array<T>
    val numArrays = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sumArray = arraySum(numArrays)

    println(sumArray)

    // pemanggilan vararg dgn memasukkan array
    val sum_2 = sum(1, 2, 3, 4, 5, *numArrays)

    println(sum_2)
}