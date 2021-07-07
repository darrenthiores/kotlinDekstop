/*
(x) higher order function
(x) terkadang kompilter tidak dapat menentukan tipe kembalian, maka dari itu
kita perlu menuliskannya scr eksplisit
(x) ada beberapa cara untuk melakukannya, namun pada modul ini akan dibahas 1
(x) konsep higher order function berarti sebuah fungsi yang menggunakan
fungsi lain sbg param, tipe kembalian ataupun keduanya
 */

/*dgn menggunakan tipe deklarasi dbwah maka lambda dibwah akan dpat digunakan sbg
argumen untuk fungsi lain*/
/*dgn tipe deklarasi dibwah, kita hanya bisa membuat lambda dgn 1 parameter*/

// membuat fun dgn menuliskan tipe kembalian scr explisit
val sum: (Int) -> Int = {value -> value + value}

// menggunakan lambda sbg argumen fungsi
fun sumResult(valueA:Int,valueB:Int, valueC:Int, sum: (Int) -> Int){
    val result = sum(valueA, valueB, valueC)
    println(result)
}

// menggunakan lambda langsung dalam pemanggilan
fun minRes(value:Int, minus:(Int) -> Int){
    val result = minus(value)
    println(result)
}

fun main(){
    // pemanggilan fungsi
    sumResult(10, 20, 30, sum)

    // cara pemanggilan lain (lambda ketika pemanggilan)
    minRes(10){value ->
        value - value
    }
}