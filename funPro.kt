/*
(x) kotlin --> merupakan multiparadigm programming language
(x) functional programming merupakan salah satu gaya pemrograman
 */
/*
(x) Anatomi function pada kotlin
(x) function header --> merupakan bagian yg merupakan kontruksi dari sebuah fungsi
untuk menentukan prilakunya
(x) pada function header, terdapat visibility modifier, kata kunci fun, identifier,
daftar parameter, dan nilai kembalian fungsi
(x) fun header --> private fun sum(valueA: Int, valueB:Int):Int
 */
/*
(x) penjelasan bagian function header
(x) visibility modifier --> berfungsi untuk mengatur hak akses dari sebuah class,
fungsi, prop dan variable
(x) scr default, visibility modifier adalah public yg artinya bisa diakses dari luar class,
sedangkan pada ilustrasi fungsi tsb memiliki visibility modifier private yg artinya
akses dari fungsi tsb terbatas hanya pada kelas dmna fungsi berada
(x) fun name
(x) kata kunci fun berguna untuk menandakan jika suatu kode
merupakan sebuah fungsi
(x) identifier merupakan nama dari fungsi, dgn standar penulisan camelCase
(x) fun parameter --> terdiri dari nama dan tipe parameter
(x) setiap parameter bernilai read-only sehingga kita hanya bisa menggunakan
nilai nya untuk diproduksi
 */
/*
(x) function body --> ditandai dgn curly braces {}, didalamnya kita memasukkan
logika dan jika fungsi mengembalikkan nilai maka kita perlu menambahkan
kata kunci return. jika tidak menginginkan sebuah return, maka tidak perlu
menambahkan return
(x) jika kita tidak menentukan return type, maka fungsi akan mengembalikkan
tipe Unit yg mana tidak mengembalikkan nilai signifikan
(x) setiap fungsi memiliki lingkup sendiri
 */