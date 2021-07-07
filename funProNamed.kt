/*
(x) Named Argument
(x) sebuah fungsi bisa menjadi kompleks karena banyaknya parameter sehingga saat
ingin memanggil parameter harus dihafal sehingga sesuai posisi
(x) permasalahan diatas dapat ditangani dgn named argument, kita tidak perlu menghafal
posisi namun hanya perlu memanggil nama dari parameter
(x) selain itu, kotlin juga memungkinkan default argument yg mana kita dapat
menentukan nilai default dari sebuah parameter
(x) dgn default argument, jika kita terlewat dalam pemberian nilai maka yg muncul
adalah nilai default dari param tsb. dgn hal ini juga kita dapat menghindari error
 */

fun biodata(name:String, age:Int, height:Double):String{
    val data = "Name : $name\nAge : $age\nHeight : $height"
    return data
}

// membuat default argument
// caranya menambahkan nilai disamping parameter seperti membuat variable
fun movie(
    name:String = "Non",
    genre:String = "Non",
    rating:Int = 0
): String {
    val film = "Name : $name\nGenre : $genre\nRate : $rating"
    return film
}

fun main(){
    // penggunaan named argument
    val person_1 = biodata(age = 18, height = 158.5, name = "Fidel")

    println(person_1)
    /*
    pemanggilan fungsi diatas, paramater nya acak namun tetap sesuai posisi
    karena menggunakan named argument, dimana kita menggunakan nama parameter
    dari fungsi
     */

    // pemanggilan fungsi dgn default arg
    val movie_1 = movie()

    println(movie_1)

    // pemanggilan fungsi dgn default arg namun dgn menambahkan argumen
    val movie_2 = movie(genre = "Horror", name = "A Quite Place 2")

    println(movie_2   )
}