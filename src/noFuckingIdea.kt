import kotlin.math.abs

//import java.util.*
//
//fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
//    val x = scanner.nextFloat()
//
//    val cube = x*x*x
//    println(cube)
//    println("the code run successfully")
//}

//import java.util.Scanner
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val comment = scanner.nextLine()
//    if (comment.startsWith("// ")){
//        println("Valid")
//    }
//    else{
//        print("Invalid")
//    }
//}

//fun main() {
//    for(iter in 1..9){
//        println(iter)
//    }
//}

//fun main() {
//    for (i in 1..6){
//        for (j in  1..i){
//            print('#')
//        }
//        println()
//    }
//}

// Import the necessary libraries

//fun main() {
//    val name = readln()
//    val age = readln()
//    println("Hello $name! You are $age years old.")
//
//}
//
//import java.util.Scanner
////import javax.swing.text.StyledEditorKit.BoldAction
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    var switch:Boolean = true
//    while (switch){
//        if (scanner != null){
//            println(scanner.next())
//        }
//        else{
//
//            switch = false
//        }
//    }
//}

//import java.util.Scanner
//import kotlin.system.exitProcess
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    while (true){
//        val temp = scanner.next()
//        if (temp == "exit"){
//        }
//        else{
//            println(temp)
//        }
//    }
//}

//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    var switch: Boolean = true
//    while (switch) {
//        val input = scanner.next()
//        if (input == "exit") {
//            switch = false
//        } else {
//            println(input)
//        }
//    }
//}

//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val input = scanner.nextLine()
//    val words = input.split(" ")
//    for (word in words) {
//        println(word)
//    }
//}

//import java.util.Scanner
//
//fun main() {
//    val scanner = Scanner(System.`in`)
//    scanner.useDelimiter("\\s+")
//    while (scanner.hasNext()){
//        println(scanner.nextInt())
//    }
//}

//import java.util.Scanner
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val temp = scanner.nextLine()
//    val nums = temp.split("\\s+".toRegex())
//    for (num in nums){
//        println(num)
//    }
//}

//import java.util.Scanner
//
//fun main(args: Array<String>) {
//    // TODO: Use the nextInt() method of the Scanner class to read an integer from the standard input.
//    val scanner = Scanner(System.`in`)
//    var num = scanner.nextInt()
//    // Then, add five to the read number and multiply the result by two.
//    num +=5
//    // Finally, print the result of the multiplication to the standard output.
//    println(num*2)
//}
//
//import java.util.Scanner
//import java.util.ArrayList
//fun run():Int {
//    val scanner = Scanner(System.`in`)
//    val switch:Boolean = true
//    var sum:Int = 0
//    while (switch){
//        println(sum)
//        val temp = scanner.next()
//        if (temp != "\n"){
//            var temp2 = temp.toInt()
//            sum += temp2
//        }
//        else{
//            scanner.close()
//            return 0
//        }
//    }
////    val nums:ArrayList<Int>
//    println(sum)
//    return 0
//}
//
//fun main() {
//    val result = run()
//}

//voting test
//fun main() {
//    print("Please Enter your age: ")
//    val age:Int = readln().toInt()
//    val output: String
//    output = when (age){
//        in 0..12 -> "You are not allowed to Vote, You are a Child"
//        in 13 until 17 -> "You are not allowed to vote, You are a teenager"
//        18 -> "You are allowed to vote, you recently turned into an adult"
//        else -> "You are allowed to vote, you are an adult"
//    }
//    println(output)
//}

//fun main() {
//    val num = 15
//    println(num::class.simpleName)
//    println("Can you add string with int ?" + num)
//}

//fun main() {
//    print("enter a number: ")
//    val num = readln().toInt()
//    for (i in 1..10){
//        println(num.toString() + " x " + i + " = " + (num*i))
//    }
//}

//fun findYears(depo: Double): Int{
//    var deposit = depo
//    val interestRate = 1.071
//    val max = 700000
//    var years = 0
//    while (deposit < max){
//        deposit = deposit*interestRate
//        years++
//    }
//    return years
//}
//
//fun main(){
//    println(findYears(depo = 650000.0))
//}

//}

//}

//}

//fun main() {
//    var n = readln().toInt()
//    while (n != 1){
//        print("$n ")
//        if (n % 2 == 0){
//            n /= 2
//        }
//        else{
//            n *= 3
//            n += 1
//
//        }
//    }
//    var i = 3
//    print("$i ".repeat(i))
//fun main() {
//    var n = readln().toInt()
//    var i = 1
//    while (n > 0) {
//        if (i < n) {
//            print("$i ".repeat(i))
//        } else {
//            print("$i ".repeat(n))
//        }
//        n -= i
//        i++
//    }
//fun main() {
//    var balance = readln().toInt()
//    var amt = readln().split(" ")
//    var bill = 0
//    for (i in amt){
//        bill += i.toInt()
//    }
////
//fun main() {
//    var balance = readln().toInt()
//    var items = readln().split(" ").toMutableList()
//    var total = 0
//    for (i in items){
//        total += i.toInt()
//    }
//    if (balance >= total){
//        println("Thank you for choosing us to manage your account! Your balance is ${balance-total}.")
//    }
//    else{
//        for (j in 0 until items.size){
//            if (balance >= items[j].toInt()){
//                balance -= items[j].toInt()
//            }
//            else{
//                var remainder = 0
//                for (k in j until items.size){
//                    remainder += items[k].toInt()
//                }
//                println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $remainder.")
//                break
//            }
//        }
//    }
//}

//fun main() {
//    var count = 0
//    do {
//        val temp = readln().toInt()
//        count++
//    } while (temp != 0)
//    print(--count)
//}

//fun main() {
//    var max = 0
//    var idx = 1
//    var pos = 1
//    do {
//        var temp = readln().toInt()
//        max = temp
//        if (max < temp) {
//            max = temp
//            pos = idx
//        }
//        idx++
//    } while (true)
//    print("$max $pos")
//}

//fun main() {
//    val num = readln().toInt()
//    var iter = 1
//    var nums = ArrayList<Int>().toMutableList()
//    do {
//        val temp = iter*iter
//        nums.add(temp)
//        iter ++
//    } while (temp <= num)
//    nums.removeLast()
//    for (i in nums){
//        println(i)
//    }
//}

//fun main() {
//    var nums = ArrayList<Int>()
//    var temp = readln().toInt()
//    while (temp > 0) {
//        nums.add(temp)
//        temp = readln().toInt()
//    }
//    for (i in nums) {
//        println("*".repeat(i))
//    }
//}

//fun main() {
//    val n = readln().toInt()
//    if (n%2==0) {
//        println("Divided by 2")
//    }
//    if (n%3==0) {
//        println("Divided by 3")
//    }
//    if (n%5==0) {
//        println("Divided by 5")
//    }
//    if (n%6==0) {
//        println("Divided by 6")
//    }
//}

//fun main() {
//    val t = readln()
//    println(t.length)
//}

//import kotlin.math.sqrt
//fun main() {
//    val type = readln()
//    when (type) {
//        "rectangle" -> {
//            val a:Double = readln().toDouble()
//            val b:Double = readln().toDouble()
//            println(a*b)
//        }
//        "triangle" -> {
//            val a:Double = readln().toDouble()
//            val b:Double = readln().toDouble()
//            val c:Double = readln().toDouble()
//            val s:Double = (a+b+c)/2
//            val area:Double = sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))
//            println(area)
//        }
//        "circle" -> {
//            val radius:Double = readln().toDouble()
//            val area:Double = 3.14 * radius * radius
//            println(area)
//        }
//    }
//}
//
//import kotlin.math.abs
//fun main() {
//    val (a, op, b) = readln().split(" ")
//    val x = a.toLong()
//    val y = b.toLong()
//    when (op) {
//        "+" -> println(x+y)
//        "*" -> println(x*y)
//        "-" -> println(x-y)
//        "/" ->println(if (y==0L) "Division by 0!" else "${x/y}")
//        else -> println("Unknown operator")
//    }
//}

//fun divide(a:Long, b:Long) = a/b.toDouble()
///* Do not change code below */
//fun main() {
//    val a = readLine()!!.toLong()
//    val b = readLine()!!.toLong()
//    println(divide(a, b))
//}

//fun isVowel(letter:Char):Boolean {
////    val vowels = arrayOf('a','e','i','o','u','A')
//      val vowels = "AEIOUaeiou"
//    when (letter) {
//        in vowels -> return true
//        else -> return false
//    }
//}
//
//fun main() {
//    val letter = readLine()!!.first()
//
//    println(isVowel(letter))
//}

//fun cat(age:Int):String {
//    when {
//        age<18 -> return("Minor")
//        age >= 65 -> return("Senior")
//        else -> return ("Adult")
//    }
//}
//fun main() {
//    // Read the person's age
//    val age = readLine()!!.toInt()
//    println(cat(age))
//
//}

//fun main() {
//    val input = readln().toBoolean()
//    println(input)
//}
