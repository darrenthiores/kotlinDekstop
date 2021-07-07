/*
(x) Break and continue
(x) continue berguna untuk melewatkan proses iterasi dan lanjut ke seterusnya
(x) break berguna untuk menghentikan proses iterasi
 */

/*
(x) pada kotlin, sebuah expression dapat ditandai dgn sebuah label
(x) label pada kotlin memiliki identifier yg diikuti tanda @
 */

fun main(){
    // penggunaan continue
    val randomArray = arrayOf(1, 2, 3, "hey", null, 4, 5, 6)
    for ((i, v) in randomArray.withIndex()) {
        if (v == null) continue //null akan dilewati
        println("$i. $v")
    }

    // penggunaan break
    val randomList = listOf(1, 2, null, 3, 4, null)
    for ((i, v) in randomList.withIndex()){
        if (v==null) break // ketika bertemu null maka iterasi akan berhenti
        println("$i. $v")
    }

    // membuat break & continue label
    val randomRange = 1..5

    label@ for(i in randomRange){
        println("Outside loop")

        for (j in randomRange){
            println("Inside Loop")
            if (j>=3) break@label // break akan menghentikan perulangan diatas yg diberi label
        }
    }
}

/*
(x) penjelasan ttg code label diatas (dari dicoding)
Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke
titik awal proses perulangan yang sudah ditandai dengan label.
break akan menghentikan proses perulangan terluar dari dalam proses perulangan,
di mana break tersebut dipanggil.
 */