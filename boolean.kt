/*
(x) boolean merupakan tipe data yg memiliki dua nilai, yaitu true dan false
(x) terdapat 3 operator yg dapat digunakan pada boolean, yaitu
- AND (&&) --> jika semua nilai true maka akan bernilai true
- OR (||) --> jika salah satu bernilai true maka akan bernilai true
- NOT/negation (!) --> digunakan untuk melakukan negasi pada hasil
 */

// operator AND (&&)
fun tinggiNilai(nilai:Int):Unit{
    if (nilai <= 100 && nilai > 89) {
        println ("rank : A")
    } else if (nilai <= 89 && nilai > 69) {
        println ("rank : B")
    } else if (nilai <= 69) {
        println ("rank : C")
    } else {
        println("Error")
    }
}

// operator OR (||)
fun yayaHepi(taehyung:Boolean, indomie:Boolean):Unit{
    if (taehyung==true && indomie==true){
        println("yaya so hepi")
    }else if (taehyung==true || indomie==true){
        println("yaya hepi")
    }else{
        println("yaya not hepi")
    }
}

// operator NOT (!)
fun sarapan(makan:Boolean):Unit{
    if (!makan) {
        println("nanti sakit lohh!!")
    }else {
        println("gudddd")
    }
}

fun main(){
    // AND
    tinggiNilai(70)

    //OR
    yayaHepi(false, true)

    // NOT
    sarapan(false)
}