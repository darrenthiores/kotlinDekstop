/*
(x) 3 jenis collection sebelumnya merupakan jenis eager collection
(*) eager collection --> mengevaluasi seluruh item pada collection
(x) sequence merupakan salah satu collection, namun masuk ke jenis lazy evaluation
(*) lazy evaluation --> mengevaluasi item jika hanya diperlukan
(x) untuk menerapkan lazy evaluation, maka kita harus mengubah list menjadi sequence
dgn menggunakan fungsi asSequence()
(x) untuk membuat objek sequence, kita dapat menggunakan fungsi generateSequence()
(x) fungsi generateSequence() memiliki 2 parameter, yaitu parameter pertama sbg
item pertama dalam collection dan parameter kedua merupakan perubahan masing" item
(x) fungsi generateSequence() akan membuat collection sequence tak terbatas atau
infinit, maka dari itu kita perlu menambahkan fungsi take() supaya tidak terjadi
infinite loop
 */

fun main(){
    val numList = (1..10000).toList()

    // eager evaluation
    // numList.filter { it%10 == 0 }.map { it / 2 }.forEach { println(it) }

    // lazy evaluation
    numList.asSequence().filter { it%10 == 0 }.map { it / 2 }.forEach { println(it) }

    /*
    (x) penjelasan code diatas
    (x) pada kode diatas list diubah menjadi sequence terlebih dahulu, lalu dilakukan
    filter dimana item yg memenuhi kondisi akan dilakukan mapping sehingga dibagi 2
    dan hasilnya akan diprint dgn fungsi forEach()
    (x) bedanya code diatas jika menggunakan list dan sequence adalah jika kita
    menggunakan eager evolution, maka list akan terlebih dahulu menyelesaikan
    proses filter terhadap semua data baru kemudian lanjut ke proses berikutnya,
    sedangkan pada lazy evaluation, jika ada item yg memenuhi kondisi, item
    tersebut akan lanjut ke mapping hingga hasil ditampilkan baru proses
    akan dilanjutkan hingga semua item
     */

    // membuat objek sequence dgn generateSequence()
    val randomSeq = generateSequence(1){it + it}

    // menggunakan fungsi take() untuk membatasi
    // dibawah ada fungsi forEach() juga untuk mencetak hasil
    randomSeq.take(10).forEach { println(it) }
}