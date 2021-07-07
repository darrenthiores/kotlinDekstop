/*
(x) fungsi pada kotlin dapat dijadikan tipe data
(x) untuk membuat fungsi menjadi tipe data kita menggunakan typealias
(x) pemanggilan instance bisa memanfaatkan operator invoke() atau scr lgsg
(x) kita bisa membuat fun type sbg nullable dgn menambahkan safecall
 */


// membuat fungsi menjadi tipe data
typealias math = (Int, Int) -> Int

// membuat fun type nullable
typealias name = ((String, String) -> String)?

fun main(){
    /* membuat instance dari function type, ada bbrpa cara slah satu ny
    menggunakan lambda expression */

    // membuat instance dgn lambda ex
    val sum: math = {valueA, valueB -> valueA + valueB}
    val div: math = {valueA, valueB -> valueA / valueB}

    // pemanggilan fungsi
    val sumResult = sum(1, 1)
    val divResult = div(4, 2)

    println(sumResult)
    println(divResult)

    // membuat instance pada fun type nullable
    val personName: name = {first, last -> "$first $last"}

    // pemanggilan fungsi
    val person_1 = personName?.invoke("Maria", "Fidel")

    println(person_1)
}