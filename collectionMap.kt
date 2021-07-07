/*
(x) lanjutan collection
(x) map --> merupakan collection yg menyimpan data dgn format key-value
(x) pada membuat map, string dikiri merupakan key dan dikanan merupakan value
(x) untuk mengakses value pada map, dapat dgn menggunakan key pada value tersebut
(x) selain dgn cara yg menggunakan [], kita dapat menggunakan fungsi getValue()
dgn param key dari value yg diinginkan
(x) hasil kedua nya akan sama, namun yg membedakan adalah ketika menggunakan [] jika
key tidak ada dalam map akan menghasilkan null sedangkan jika menggunakan fungsi
getValue() dan key tidak ditemukan maka akan muncul sebuah exception
(x) kita dapat menampilkan semua key yg ada didalam map dgn menggunakan
fungsi .keys(), yg mana akan mengembalikkan nilai berupa set
(x) sedangkan untuk mengetahui value yg ada didalam map, kita dapat
menggunakan fungsi values(), yg mana akan mengembalikkan collection sbgai tipe data
(x) untuk menambahkan key-value kedalam map, terlebih dahulu map harus diubah kedalam
bentuk mutable dgn menggunakan fungsi toMutableMap()
(x) lalu untuk menambahkan key-value, kita dapat menggunakan fungsi put()
(***) menggunakan mutable collection tidak disarankan
 */

fun main(){
    // membuat map
    val nationality = mapOf(
        "messi" to "argentine",
        "cristiano" to "portugal",
        "aguero" to "argentine",
        "ansu" to "spain",
        "neymar" to "brazil"
    )

    // mengakses value pada map cara ke-1
    println(nationality["messi"])

    // mengakses value pada map cara ke-2
    println(nationality.getValue("messi"))

    // menampilkan semua keys pada map
    val nationalityKeys = nationality.keys

    println(nationalityKeys)

    // menampilkan semua value pada map
    val nationValue = nationality.values

    println(nationValue)

    // mengubah map menjadi mutable dan menambahkan item pada map
    val mutableNation = nationality.toMutableMap()

    // menambahkan item pada map dgn fungsi put()
    mutableNation.put("pedri", "spain")
    mutableNation.put("rooney", "england")

    println(mutableNation)
    println(mutableNation.keys)
}