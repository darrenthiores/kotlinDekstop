/*
(x) learning how to lambda being declared with receiver
(x) konsep ini digunakan sbg dasar kotlin sbg DSL
(x) DSL atau Domain Specific Language merupakan bhs pemrograman yg dikhususkan untuk
domain aplikasi tertentu
(x) pd dasarnya lambda memiliki receiver mirip sprti extension functions, yg mana
memungkinkan untuk mengakses anggota objek receiver dari dalam extension
 */

fun randomBuild(theAct: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.theAct()
    return stringBuilder.toString()
}

fun main() {
    val message = randomBuild {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

/*
(***) sgt tidak mengerti
(***) penjelasan code tidak rinci
(x) BuildString merupakan identifier sehingga dpat diubah sesuka hati
(x) penjelasan dari dicoding, StringBuilder menjadi receiver untuk tipe
deklarasi parameter action
(x) dpat disimpulkan action pada code diatas merupakan parameter dan
namanya dapat diubah sesuka hati
(x) Pada dasarnya parameter action di atas dipanggil
ketika kita melampirkan argumen lambda saat fungsi tersebut digunakan
(x) parenthesis tidak diperlukan krn fungsi hanya memiliki 1 param
 */