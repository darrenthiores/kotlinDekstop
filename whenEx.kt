/*
(x) when expression
(x) when expression bisa dibilang sama dgn if expression, yg membedakan keduanya adalah
when expression akan lebih efisien untuk digunakan ketika ada lebih dari 2 kondisi
(x) when expression juga dapat mengembalikkan nilai yg dmsukkan kedalam variable
(x) when expression memungkinkan untuk memeriksa tipe suatu instance dgn menggunakan
sintaks is atau !is
(x) when expression memungkinkan untuk memeriksa nilai yg ada pada sebuah range dan collection
dgn menggunakan sintaks in atau !in
 */

fun main(){
    // menggunakan when expression
    val phone = "iphone"
    when (phone){
        "asus" -> println("my phone is asus")
        "iphone" -> println("my phone is iphone")
        "samsung" -> println("my phone is samsung")
    }

    // menggunakan when expression untuk mengembalikkan nilai
    // (*) ketika menggunakan when expression untuk mengembalikkan nilai maka hrus menggunakan else
    val randomNum = 3
    val randNumber = when(randomNum){
        1 -> "ur the one"
        2 -> "oh shit ur the second"
        3 -> "are u the thirdwheel?"
        4 -> "hmm"
        else -> "whuttt"
    }
    println(randNumber)

    // ketika terdapat lebih dari 1 baris kode, maka bisa menggunakan curly braces
    val rank = "second"
    val rankTips = when(rank){
        "first" -> {
            println("1st")
            "Keep up the good work and maintain ur level"
        }
        "second" -> {
            println("2nd")
            "work harder for the better result!!"
        }
        "third" -> {
            println("3rd")
            "it is good to be the third but better to be the best!!"
        }
        else -> {
            println("??")
            "Don't u have a rank"
        }
    }
    println(rankTips)

    // menggunakan is atau !is untuk menentukan tipe
    val randomType: Any = 10f
    when (randomType){
        is Double -> println ("the type is double")
        is Int -> println ("The type is integer")
        is Float -> println ("The type is Float")
        else -> println ("what type is it?")
    }

    // menggunakan in atau !in untuk memeriksa nilai dalam range
    val randomValue = 25
    val valueRange = 1..10

    when(randomValue){
        in valueRange -> println("$randomValue is in the range")
        !in valueRange -> println("$randomValue isn't in the range")
        else -> println("value what?!")
    }
}