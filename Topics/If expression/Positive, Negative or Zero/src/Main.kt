fun main() {
    // write your code here
    val num = readln().toInt()
    println(if (num < 0){
        "negative"
    }else if (num == 0){
        "zero"
    }else {
        "positive"
    })
}
