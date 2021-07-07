/*
(x) lanjutan dari yg sebelumnya
 */

// enum sebagai anonymus class
enum class food(val type: String){
    pizza("junk food"){
        override fun foo(){
            println ("${pizza} is a $type")
        }
    },
    broccoli("healthy food"){
        override fun foo(){
            println("${broccoli} is a $type")
        }
    },
    egg("protein"){
        override fun foo(){
            println("${egg} is a $type")
        }
    };

    abstract fun foo()
}

fun main(){
    food.egg.foo()
}