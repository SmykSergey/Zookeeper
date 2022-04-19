fun main() {
    // put your code here
    var two = 0
    var three = 0
    var four = 0
    var five = 0
    var num = readln().toInt()
    repeat(num){
        var quest = readln().toInt()
        if ( quest == 2){
            two += 1
        }else if (quest == 3){
            three += 1
        }else if (quest == 4){
            four += 1
        }else {
            five += 1
        }
        
    }
    println("$two $three $four $five")
}
