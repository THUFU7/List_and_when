fun main(args: Array<String>) {
  val list = mutableListOf<Int>()
    println("Enter 5 numbers: ")
    for (i in 1..5){
        val x = readLine()?.toInt()
        if (x != null) {
            list.add(x)
        }
    }
    println("The number in reverse order are: ")
    for (i in list.size -1 downTo 0){
        println(list[i])
    }
    trial()
    whenHomework()
}

//febonachi numbers
fun trial() {
    val list = mutableListOf(0,1)
    println("Enter a number > 1")
    val n = readLine()?.toInt()
    if(n != null){
        for (i in 2..n-1){
            list.add(list[i-2] + list[i-1])
        }
    }
    println(list)
}
fun whenHomework(){
    println("Where are you from: ")
    val country = readLine()


    when(country){
        "India" -> println("Namaste")
        "Kenya" -> println("Umbwa")
        "Russia" -> println("Privet")
        "China" -> println("Ne how")
        else -> println("INVALID")
    }
}