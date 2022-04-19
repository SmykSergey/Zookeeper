fun main() {
    // put your code here
    var hm = 0
    do {
        val num = readln().toInt()
        if (num > hm) hm = num else hm = hm
    } while(num != 0)
    println(hm)
}