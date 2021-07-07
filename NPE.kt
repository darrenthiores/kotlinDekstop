/*
(x) NPE atau NullPointerException --> sebuah kesalahan yang terjadi ketika ingin mengakses
atau mengelola nilai dari sebuah variabel yg belum diinisialisasi atau yg bernilai null
(x) kotlin memudahkan kita untuk mengelola variable null untuk meminimalisir terjadinya
NullPointException
(x) kotlin dapat membedakan objek yg boleh bernilai null dan tidak boleh bernilai null
(x) objek pada kotlin tidak boleh bernilai null, namun jika ingin sebuah objek bernilai null
bisa dgn menambahkan tanda tanya (?) setelah menentukan tipe objek
 */

// membuat objek bernilai null
// val nullObjek: String = null --> maka akan error
fun main() {
    val nullObjek: String? = null

/*
(*) namun setelah objek bernilai null dibuat, objek tsb tidak bisa langsung diakses atau
dikelola. maka dari itu cara untuk mengakses atau mengelola nilai dari objek yg ditandai
sebagai nullable adalah dgn menggunakan percabangan if else untuk memeriksa apakah suatu
objek bernilai null atau tidak
 */

    if (nullObjek != null) {
        val ObjLength = nullObjek.length
    } else {
        println ("objek bernilai null")
    }

    // .length pada percabangan diatas berfungsi untuk menghitung panjang suatu objek
    // contoh penggunaanya
    val kata = "Yaya"

    print (kata.length)
}