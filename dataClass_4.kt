/*
(x) lanjutan dataClass_3
(x) Destructuring Declaration -> menjadikan objek sebuah variable
(x) fungsi lain dari data class adalah componentN() dimana N merupakan jumlah
properti yg ada didalam data class dan akan scr otomatis dihasilkan
(x) componentN berfungsi menguraikan objek menjadi beberapa properti
(x) data class tidak hanya berfungsi untuk mengelola properti yg ada didalamnya, melainkan
kita dapat menerapkan behaviour didalamnya. contoh sederhana --> fungsi dalam data class
 */

data class fPlayer(val club:String, val nationality:String)

// membuat behaviour dalam data class
data class haikyuuChar(val name:String, val personality:String){
    fun bio(){
        println("name : $name")
        println("personality : $personality")
    }
}

fun main(){
    val messi = fPlayer("Barcelona", "Argentina")
    val ronaldo = fPlayer("Juventus", "Portugal")
    val pedri = fPlayer("Barcelona", "Spain")
    val riqui = pedri.copy()

    // menggunakan fungsi componentN
    val messiClub = messi.component1()
    val messiNat = messi.component2()

    val riquiClub = riqui.component1()
    val riquiNat = riqui.component2()

    println("My name is messi, i play in $messiClub and i am from $messiNat")
    println("Hola! i am riqui, i play for $riquiClub and i am $riquiNat")

    // cara lain untuk menguraikan objek
    val (ronaldoClub, ronaldoNat) = ronaldo
    val (pedriClub, pedriNat) = pedri

    println("Hello! My name is cristiano, i played for $ronaldoClub and i am a $ronaldoNat")
    println("Hi! my name is pedri, i am a $pedriNat and i am happy here at $pedriClub")

    //
    println("===")
    //

    // mengakses fungsi didalam data class
    val hinata = haikyuuChar("Hinata Shouyo", "Happy boy")
    val kageyama = haikyuuChar("Kageyama Tobio", "Calm")

    // memanggil fungsi
    hinata.bio()
    kageyama.bio()
}