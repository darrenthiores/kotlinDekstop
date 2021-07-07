/*
(*) krg mengerti krn blom mempelajari class
(x) kotlin memungkinkan untuk menambahkan fungsi baru pd sebuah class tanpa harus
mewarisi class tsb
(x) kotlin mendukung 2 extension, extension functions dan extension properties
(x) exstension functions berfungsi untuk menambah fungsi baru
(x) extension properties berguna untuk menambah prop baru
(x) untuk mendeklarasikan extension fun, kita tentukan dlu receiver type nya, kemudian
nama fungsi yg mana dipisahkan dgn tanda titik (.)
(x) extension functions dapat ditetapkan untuk mengembalikkan nilai, dgn
menggunakan format yg sama dgn fungsi pd umumnya
(x) untuk membuat extension properties, deklarasinya sama sperti membuat ex fun
(*) extension tidak benar" mengubah sebuah kelas
"Yang perlu diketahui, extension tidak benar-benar mengubah sebuah kelas dengan
menambahkan sebuah fungsi atau properti baru. Ini karena extension memiliki
hubungan langsung dengan kelas yang ingin diperluas fungsionalitasnya.
Sehingga extension properties hanya bisa dideklarasikan dengan cara
menyediakan getter atau setter secara eksplisit." - dicoding
 */

fun Int.randomNum(){
    println("Num : $this")
}

fun Int.addOne():Int{
    val hasil = this + 1
    return hasil
}

// membuat extension prop
// get() sudah disediakan kotlin
val Int.minOne: Int
get() = this - 1

/*
penjelasan code diatas, Int sbg receiver type dan randomNum() merupakan
nama fungsinya. pada function body terdapat kata kunci this yg mana merupakan
receiver type yg bertindak sbg objek
 */

fun main(){
    // untuk memanggil extension function
    // angka sblom titik sama dgn this pada extension fun diatas
    5.randomNum()

    // memanggil ex fun dgn return
    println(1.addOne())

    // memanggil ex prop
    println(2.minOne)
}