/*
(x) for loop
(x) for loop sama sperti while dan do while yaitu merupakan perulangan
(x) for dapat digunakan pada ranges, collections, array dan apapun yg memiliki iterator
(x) kita dapat mengakses index setiap elemen yg ada pada ranges menggunakan withIndex()
(x) selain for, pada kotlin kita dapat menggunakan forEach juga
(x) jika menggunakan forEach dan ingin mendapatkan index maka dapat menggunakan forEachIndexed
 */

fun main(){
    // membuat for looping
    val randomRange = 1..10

    for (i in randomRange){
        println (i)
    }

    // mengakses indeks menggunakan withIndex()
    val randomThing = arrayOf(1, "hello", true)

    for ((i, v) in randomThing.withIndex()){
        println("$i. $v")
    }

    // menggunakan forEach
    val randomNum = intArrayOf(1, 2, 3, 4)

    randomNum.forEach { value ->
        println(value)
    }

    // menggunakan forEachIndexed untuk mengakses index
    val randomThing_2 = arrayOf("foo", 'A', true)

    randomThing_2.forEachIndexed {i, value ->
        println("$i. $value")
    }

    // jika hanya ingin menggunakan argumen index maka dapat mengganti value menjadi _
    val randomThing_3 = arrayOf("yakob", "football", 3.65)

    randomThing_3.forEachIndexed { index, _ ->
        println("index $index")
    }
}