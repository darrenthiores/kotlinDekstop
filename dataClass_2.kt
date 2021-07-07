/*
(x) Lanjutan dataClass
(x) kelebihan lain menggunakan data class --> memiliki fungsi equals() secara otomatis yg mana
fungsinya untuk melakukan komparasi antara 2 buah objek
 */

// penggunaan equals()
data class items(val Type:String, val rarity:String)

fun main(){
    val sword = items("Sword", "Common")
    val dragon = items("Pet", "Rare")
    val knife = items("Sword", "Common")

    // equals() --> akan menghasilkan nilai boolean true/false
    println(sword.equals(dragon))
    println(sword.equals(knife))
    println(dragon.equals(knife))

    // jika equals() digunakan pada 2 objek yg bukan dari data class, maka hasil nya
    // adalah selalu false
}

// jika ingin menggunakan fungsi equals() terhadap yg bukan data class :
/*
class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
 */
// code diatas berasal dari dicoding
// selain menggunakan equals() kita juga perlu menggunakan hashCode()