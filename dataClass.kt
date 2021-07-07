/*
(x) data class --> kelas sederhana yg berperan sbg data container
(x) data class tidak memiliki logika maupun fungsionalitas selain menangani data
(x) untuk membuat data class, kita menggunakan kata kunci data
(x) dgn membuat data class, maka scr otomatis kompiler akan menghasilkan constructor,
toString(), equals(), hashCode(), copy() dan juga fungsi componentN()
(x) beberapa hal yg perlu diperhatikan dalam membuat data class :
- utama pada kelas tersebut harus memiliki setidaknya satu parameter;
- Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
- Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
 */

// perbedaan class dgn data class
class bio(val name : String, val age : Int)

class bioUser(val name : String, val age : Int){
    // menggunakan toString()
    override fun toString(): String {
        return "bioUser(name=$name, age=$age)"
    }
}

data class biodata(val name : String, val age : Int)

fun main(){
    val bio_1 = bio("Maria", 18)
    val bioUser_1 = bioUser("Yaya", 17)
    val biodata_1 = biodata("Darren", 17)

    println(bio_1) // menghasilkan bio@75b84c92
    println(biodata_1) // menghasilkan biodata(name=Darren, age=17)
    println(bioUser_1) // menggunakan toSTring() sehingga menghasilkan output yg dpat dilihat

    /*
    (x) class dan data class diatas menghasilkan output yg berbeda
    (x) perbedaan output disebabkan karena data class scr otomatis menghasilkan
    fungsi toString()
    (x) jika menginginkan output seperti data class pada class biasa, maka dapat
    dgn menambahkan toString()
     */
}