fun main() {
    // put your code here
    var num: Int
    var hh = 0
    do {
        var num = readln()!!.toInt()
        hh = hh + num
    } while (num > 0)
    print(hh)
}