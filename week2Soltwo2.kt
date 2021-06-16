// A loop which will print out 1 - 100
fun main () {
    var count : Int = 1
    while (count <= 100){
        println(count)
        count++
    }
// A loop which will print out 1 - 10 to the console without printing out the numbers 4 and 5
    var count2 = 1
    while (count2 <= 10) {
        println(count2)
        count2++
        if (count2 >= 4){
            break
            if (count2 >= 10){
                continue
            }
        }
    }
}