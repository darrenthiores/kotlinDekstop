/*
(x) lanjutan enum_3
(x) menggunakan when expression pada enum
(x) gunanya untuk mengecek instance dari enum
 */

enum class games{
    Pes2021,
    Growtopia,
    MobileLegend,
    PUBG
}

fun main(){
    val game = games.Pes2021

    // penggunaan when expression
    when(game){
        games.Pes2021 -> print("The game is Pes")
        games.Growtopia -> print("The game is Growtopia")
        games.MobileLegend -> print("The game is ML")
        games.PUBG -> print("The game is PUBG")
    }
}