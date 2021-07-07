/*
(x) lambda expression --> dikenal sbg anonymus function dan cukup populer
dalam fun programming
(x) disebut anonymus karena tidak memiliki nama sperti fungsi pada umumnya
(x) lambda berguna untuk menyederhanakan code
(x) untuk membedakan body dgn parameter dipisahkan dgn (->)
(x) pada dsarnya kompiler akan mengembalikkan nilai berdasarkan
expression atau statement dibaris terakhir body
 */

/*
(x) karakteristik lambda
- Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk
nilai kembaliannya. Tipe tersebut akan ditentukan oleh kompiler secara otomatis.
- Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan
visibility modifier saat dideklarasikan, karena lambda bersifat anonymous.
- Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.
- Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi
karena kompiler akan secara otomatis mengembalikan nilai dari dalam body.
- Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter
dan dapat disimpan ke dalam sebuah variabel.
 */

// membuat lambda expression
// sama sperti di functionType
val haikyuu = {name:String, team:String -> "Namaewa : $name\nClub : $team"}
val min = {valueA:Int, valueB:Int -> valueA - valueB}

fun main(){
    // pemanggilan lambda
    val charHaikyuu_1 = haikyuu("Hinata Shoyou", "Karasuno")
    val charHaikyuu_2 = haikyuu("Bokuto Koutaro", "-")

    val minResult = min(5, 2)

    println(charHaikyuu_1)
    println(charHaikyuu_2)
    println(minResult)
}