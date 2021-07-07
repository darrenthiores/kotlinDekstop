/*
(x) numbers pada kotlin
(x) number merupakan tipe data khusus yang digunakan untuk menyimpan nilai numerik
(x) tipe data number di kotlin disimpan dgn cara berbeda", yaitu dgn tipe bawaan :
- Double
- Long
- Int
- Short
- Byte
(x) tiap tipe bawaan memiliki satuan bit yg berbeda"
 */

fun main() {
    // int (32 bit)
    // dapat menyimpan data dari range -2^31 sampai +2^31-1
    val intNum = 9

    println (intNum)

    // Long (64bit)
    // digunakan untuk menyimpan data numerik yg lebih besar
    // memiliki range -2^63 sampai +2^63-1
    // dapat didefinisikan dgn dua cara, yaitu :

    // ke-1
    val longNum: Long = 1209

    // ke-2 --> dgn menambahkan L
    val longNum_2 = 2503L

    println (longNum)
    println (longNum_2)

    // Short (16bit)
    // merupakan bilangan bulat yang hanya dapat menyimpan nilai kecil krna ukuran bit nya
    val shortNum: Short = 1

    println (shortNum)

    // Byte (8bit)
    // dgn bit kecil, byte hanya mampu menyimpan nilai yg kecil sprti short
    // byte pada umumnya digunakan untuk keperluan proses membaca dan menulis data dari stream file atau jaringan
    val byteNum = 0b11010010

    println (byteNum)

    // Double (64bit)
    // dapat menyimpan nilai numerik yg besar
    // double digunakan untuk menyimpan nilai numerik pecahan dgn max 15-16 angka dblkg koma
    val doubleNum: Double = 1.1929299292

    println (doubleNum)

    // Float (32bit)
    // sama dgn double, namun memiliki ukuran penyimpanan yg lebih kecil
    // max 6-7 angka diblkg koma, jika melebihi maka tidak terbaca
    // penulisannya menggunakan f dibelakang angka
    val floatNum: Float = 1.234567881f // seharusmya hanya terbaca hingga angka 7-8

    println (floatNum)

    /*
    (x) untuk mengetahui nilai max dan min yang suatu tipe Number dapat simpan, bisa
    menggunakan prop MAX_VALUE & MIN_VALUE
    (*) jika kita memasukkan nilai yang melebihi max suatu tipe number, maka
    akan terjadi overflow dan nilai yg di-return adalah nilai min yang dpt disimpan
     */
    // penggunaan MAX_VALUE & MIN_VALUE
    val maxLong = Long.MAX_VALUE
    val minLong = Long.MIN_VALUE

    println(maxLong)
    println(minLong)

    // contoh terjadinya overflow
    val overLong = maxLong + 1

    print(overLong) // nilai yang dihasilkan adalah nilai min long karena trjdi overflow
}