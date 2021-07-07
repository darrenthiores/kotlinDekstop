/*
(x) menangani objek nullable dengan cara yg lebih mudah
(x) ada 2 cara, yaitu menggunakan safe calls dan elvis operator
 */

// penerapannya
fun main(){
    // safe calls operator (?.)
    /*
    safe call adalah operator yg menjamin kode yg ditulis aman dari
    NullPointException, dimana cara penggunaannya yaitu adalah dgn
    mengganti tanda titik (.) dgn tanda (?.) saat mengakses atau mengelola
    objek nullable. dgn menggunakan safe call maka kompiler akan melewati
    proses jika objek bernilai null
     */
    // penerapan safe call
    val ObjNull: String? = null
    val Obj_1 = "Tes"

    ObjNull?.length // akan terlewat jika objk bernilai null
    Obj_1?.length // 3

    // elvis operator (?:)
    // elvis operator memungkinkan untuk menetapkan default value dari objek bernilai null
    // penerapan elvis operator
    val nullWords: String?= null

    val wordsLength = nullWords?.length ?:0

    println (wordsLength)

    /*
    penjelasan program diatas, jadi ketika suatu objek dinyatakan merupakan null menggunakan
    safe call operator, maka nilai yg dikembalikan akan sesuai dgn default value yg ditentukan
     */

    // menggunakan if else untuk menetapkan default value
    val nullKata: String? = null

    val kataLength = if (nullKata != null){
        nullKata.length
    } else {
        1
    }

    println (kataLength)

    /*
    (*) selain kedua cara diatas, sebenarnya ada operator non-null assertion (!!)
    (x) non-null assertion (!!) memungkinkan kompiler untuk mengizinkan kita mengakses atau
    mengelolas nilai dari objek nullable.
    (***) penggunaan operator ini sgt tidak disarankan karena akan memaksa suatu objek
    menjadi non-null, yg mana ketika suatu objek bernilai null akan tetap terjadi NullPointerException
     */

    // contoh penerapan non-null assertion(!!)
    /*
    val nonNullWords: String? = null
    val noNullWdsLength = nonNullWords!!.length --> error

    println (noNullWdsLength)
     */
}