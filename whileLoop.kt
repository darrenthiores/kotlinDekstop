/*
(x) while dan do while
(x) while dan do while keduanya merupakan loop yg fungsi nya untuk melakukan perulangan
hingga kondisi yg diberikan tidak dipenuhi atau false
(x) perbedaan keduanya adalah perulangan while akan mengecek kondisi terlebih dahulu dan jika
kondisi terpenuhi baru looping akan dilakukan, sedangkan perulangan do while akan melakukan
looping terlebih dahulu tanpa mengetahui jika kondisi terpenuhi atau tidak baru setelah itu
kondisi di cek
(x) while --> entry controlled loop
(x) do while --> exit controlled loop
 */

fun main(){
    // perulangan while
    var i = 1
    while (i<=10){
        println("$i. Hello world!!")
        i++
    }

    // perulangan do while
    var num = 1
    do{
        println("$num. Halo Dunia!!")
        num++
    }while (num<=5)

    // contoh perulangan do while merupakan exit controlled loop
    var foo = 10
    do{
        println("Haiiii!!")
        foo++
    }while(foo<=5) // code diatas akan tercetak 1x karena do while merupakan exit controlled loop
}