/*
(x) arrays pada kotlin
(x) array merupakan tipe data yang menyimpan beberapa objek didalam variable
(x) untuk membuat sebuah array, terdapat 2 cara yaitu menggunakan arrayOf() dan array()
(x) kotlin juga memungkinkan untuk membuat array dgn tipe data primitif, sehingga suatu array
dapat dimasukkan nilai dgn tipe data tertentu saja. untuk melakukanya dapat menggunakan prop :
- intArrayOf() : IntArray
- booleanArrayOf() : BooleanArray
- charArrayOf() : CharArray
- longArrayOf() : LongArray
- shortArrayOf() : ShortArray
- byteArrayOf() : ByteArray
(x) untuk memanggil objek dalam array dapat menggunakan indexing yg dimuali dari 0
 */

// membuat array
fun main(){
    // cara ke-1
    val randomThings = arrayOf(1, "love", 7.5, 'A')

    println (randomThings)

    // memanggil objek dalam array menggunakan indexing
    println (randomThings[3])

    // membuat array dgn tipe data tertentu
    val randomNum = intArrayOf(1, 2, 3, 4)

    print ("ini adalah angka pertama pada array : ")
    println (randomNum[0])

    // fungsi indexing selain memanggil objek dalam adalah untuk mengubah isi array
    randomNum[0] = 10

    print ("ini adalah angka pertama dalam array setelah diubah : ")
    println (randomNum[0])

    // cara ke-2
    // pada cara ke-2 constructor array() membutuhkan 2 argumen yaitu size dan fungsi lambda
    // (kurang penjelasan) contoh berdasarkan web
    val arraySec = Array(4, {i -> i + i})

    print (arraySec[3])

    /*
    berdasarkan contoh diatas, dapat disimpulkan jika i -> seperti i = dan setelahnya
    merupakan expression yaitu (i + i), dimana 4 merupakan batasannya dan
    index akan dimulai dari 0 sehingga ketika dipnggil maka angka akan dimulai dari 0
    dan angka tersebut akan masuk kedalam expression.
    pada contoh diatas, jika kita memanggil index 1, maka expression nya adalah
    1 + 1 sehingga akan menghasilkan 2. selain itu jika kita memanggil index
    lebih atau sama dengan batasan akan terjadi error karena telah menyentuh batas
     */
}