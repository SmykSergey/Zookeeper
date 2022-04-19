fun main() {    
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    if ( a <= h && h <= b) {
        println("Normal")
    }else if (h < b && a > h) {
        println("Deficiency")
    }else {
        println("Excess")
    }
}