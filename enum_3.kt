/*
(x) lanjutan enum_2
(x) enum memiliki dua method, yaitu values() dan valueOf()
(x) values() berfungsi untuk mendapatkan daftar objek enum
(x) valueOf() berfungsi untuk mendapatkan nama dari objek enum
(x) enum memiliki dua prop, yaitu ordinal dan name
(x) ordinal berfungsi untuk mendapatkan posisi objek
(x) name berfungsi untuk mendapatkan nama konstanta
(*) ketika menggunakan method valueOf() perhatikan argumen yg dimasukkan karena
jika salah maka akan terjadi IllegalArgumentException
 */

// enum
enum class film(genre: String){
    TheConjuring("Horror"),
    Vincenzo("Action"),
    Spiderman("fantasy"),
    MissionImpossible("Action")
}

// enum 2
enum class footballPlayer(position: String){
    Messi("RWF"),
    Cristiano("LWF"),
    Iniesta("CMF"),
    Frenkie("CMF"),
    Griezmann("SS")
}

// penggunaan method & prop
fun main(){
    // method values()
    val filmList = film.values()

    filmList.forEach { film ->
        println(film)
    }

    // method values() dan prop ordinal & name
    val playerList = footballPlayer.values()

    for (player in playerList){
        println("${player.ordinal} : ${player.name}")
    }

    // method valueOf()
    val fPlayer = footballPlayer.valueOf("Griezmann")

    println("Player --> $fPlayer")
}