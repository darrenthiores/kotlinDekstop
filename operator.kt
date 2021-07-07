/*
(x) operator pada kotlin
(x) operator perkalian dan pembagian didahulukan sama halnya dgn konsep mat
(x) hasil pembagian pada data int akan dibulatkan kebawah
(x) penjumlahan (+)
(x) pengurangan (-)
(x) perkalian (*)
(x) pembagian (/)
(x) modulus/sosa bagi (%)
 */

// penjumlahan
fun penjumlahan(value_1:Float, value_2:Float):Float{
    val hasilPenjumlahan = value_1 + value_2
    println ("hasil penjumlahan $value_1 + $value_2 = $hasilPenjumlahan")
    return hasilPenjumlahan
}

// pengurangan
fun pengurangan(value_1:Float, value_2:Float):Float{
    val hasilPengurangan = value_1 - value_2
    println ("hasil pengurangan $value_1 - $value_2 = $hasilPengurangan")
    return hasilPengurangan
}

// perkalian
fun perkalian(value_1:Float, value_2:Float):Float{
    val hasilPerkalian = value_1 * value_2
    println ("hasil perkalian $value_1 x $value_2 = $hasilPerkalian")
    return hasilPerkalian
}

// pembagian
fun pembagian(value_1:Float, value_2:Float):Float{
    val hasilPembagian = value_1 / value_2
    println ("hasil pembagian $value_1 : $value_2 = $hasilPembagian")
    return hasilPembagian
}

// sisa bagi
fun sisaBagi(value_1:Float, value_2:Float):Float{
    val hasilSisaBagi = value_1 % value_2
    println ("hasil sisa bagi $value_1 % $value_2 = $hasilSisaBagi")
    return hasilSisaBagi
}

// pengetesan konsep matematika
fun konsepMat(value_1:Float, value_2: Float):Float{
    val testMat = value_2 / value_1 + value_2 * value_1
    println("hasil dari $value_2 : $value_1 + $value_2 * $value_1 = $testMat")
    return testMat
}

// pemanggilan
fun main(){

    // penjumlahan
    penjumlahan(10f, 10f)

    // pengurangan
    pengurangan(30f, 5f)

    // perkalian
    perkalian(2f, 2f)

    // pembagian
    pembagian(20f, 4f)

    // sisa bagi
    sisaBagi(100f, 3f)

    // konsep mat
    konsepMat(2f, 4f)
}