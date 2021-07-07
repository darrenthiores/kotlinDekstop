/*
(x) lanjutan collection
(x) set --> merupakan sebuah collection yg hanya menyimpan nilai unik, yg dmana
nilai unik berarti didalam set tidak ada nilai yg sama atau duplikasi
(x) urutan pada set bukanlah hal yg penting dapat dibuktikan dgn melakukan
komparasi nilai sama dan posisi berbeda tetap menghasilkan true
(x) kita dapat melakukan pengecekan jika sebuah nilai ada didalam set atau tidak
dgn menggunakan kata kunci in
(x) set memiliki fungsi union dan intersect, yg mana union untuk mengetahui gabungan
dan intersect untuk mengetahui irisan
(x) set juga bersifat immutable, namun terdapat mutable set sama seperti list. perbedaan
mutable set dan mutable list adalah pada mutable set tidak dapat melakukan perubahan nilai
 */

fun main(){
    // membuat set
    val randomNum = setOf(1, 2, 4, 5, 6, 1, 3, 3, 2, 1)

    println(randomNum) // tidak ada duplikasi

    // membuktikan urutan pada set tidak penting
    val newNum = setOf(3, 6, 2, 1, 5, 4)

    println(randomNum==newNum) // hasilnya true karena nilai didalam set sama

    // melakukan pengecekan nilai didalam set
    println(7 in randomNum) // false karenas tidak ada
    println(1 in newNum)

    // menggunakan fungsi union dan intersect
    val setA = setOf(1, 5, 8, 10)
    val setB = setOf(1, 2, 3, 5 ,7, 8, 10)

    // fungsi union
    val setUnion = setA.union(setB)

    // fungsi intersect
    val setIntersect = setA.intersect(setB)

    println(setUnion) // menggabungkan kedua set tanpa ada duplikasi
    println(setIntersect) // irisan --> yg ada pada keduanya

    // membuat mutable set
    val mutSet = mutableSetOf(1, 2, 3, 2, 1)

    println(mutSet)

    // menambahkan item pada mutable set menggunakan add()
    mutSet.add(4)

    println(mutSet)

    // menghapus item pada mutable set menggunakan remove()
    // berbeda dgn list yg menggunakan index, mutable set menggunakan value yg ada
    // didalamnya, maka dari itu untuk menghapus item harus memasukkan item yg ingin dihapus
    mutSet.remove(2)

    println(mutSet)
}