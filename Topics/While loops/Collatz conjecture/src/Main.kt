fun main() {
    // put your code here
    var num = readln().toInt()
    var hh = num.toString()
    while (num != 1){
        if ( num%2 == 0) num = num/2 else num = num*3+1
        hh = hh + " " + num.toString()
    }
    print(hh)
}