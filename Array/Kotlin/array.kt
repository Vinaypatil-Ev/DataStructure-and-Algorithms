fun main(){

    //Arrays in kotlin

    // Integer Array

    val integerArr:IntArray = intArrayOf(1, 2, 3, 3)

    // println(integerArr.size) // size/length of Array

    for(i in integerArr){
        println(i)
    }

    // floating Array

    val floatArr:FloatArray = floatArrayOf(2.3f, 3.3f, 6.7f, 5.9f)
    for (i in floatArr) {
        println(i)
    }

    // Double Array

    val doubleArr:DoubleArray = doubleArrayOf(2.444444, 5.65, 6.000)
    for (i in doubleArr) {
        println(i)
    }

    // String Array

    val stringArr:Array<String> = arrayOf("jaya", "leya", "maya")
    for (i in stringArr) {
        println(i)
    }

    // Other types of Array

    val charArr:CharArray = charArrayOf('d', 'm', 'f', 'k')
    for(i in charArr){
        println(i)
    }

    // ByteArray

    val byteArr:ByteArray = byteArrayOf(0x2E, 0x38)
    for(i in byteArr){
        println(i)
    }


}