import kotlin.math.abs
import kotlin.math.max

fun main() {
//    val temp = readln().toInt()
//    println(q2(temp))


    val conditoin = true

    if (conditoin) {
        //Action(s) to perform when the condition is true.
    } else {
        //Action(s) to perform when the condition is false.
    }

    
}
fun q1(num:Int):String{
    val out = if(num % 7 == 0) "Yes" else "No"
    return(out)
}
fun q2(num: Int):String{
    if ((num<= 9) && (num >= -9)){
        return (if (abs(num) == 4) "yes" else "No")
    }
    else{
        val last_digit = num % 10
        return (if (abs(last_digit) == 4) "yes" else "No")
    }
}
fun q3(num: Int):String{
    if (num%3 == 0){
        if (num < 9 && num > -9){
            return (if (abs(num) == 4) "yes" else "No")
        }
        else{
            val last_digit = num % 10
            return (if (abs(last_digit) == 4) "yes" else "No")
        }
    }
    else{
        return "No"
    }
}
fun q4(num: Int):String{
    if (num%7 == 0){
        if (num < 9 && num > -9){
            return (if (abs(num) == 5) "yes" else "No")
        }
        else{
            val last_digit = num % 10
            return (if (abs(last_digit) == 5) "yes" else "No")
        }
    }
    else{
        return "No"
    }
}
fun q5(num: Int):Boolean{
    return if (num%5==0 && num%11==0) true else false
}
fun q6(a:Int, b:Int, c:Int):Int{
    val temp = max(a, b)
    return max(temp,c)
}
fun q7(a:Int, b:Int, c:Int){
    val angles = ArrayList<Int>()
    angles.add(a)
    angles.add(b)
    angles.add(c)
    for (angle in angles){
        val msg = if (angle == 90) "Right angle" else if(angle>90) "Obtuse angle" else "Acute angle"
        println(msg)
    }
}
fun q8(age: Int): Boolean {
    return if (age >= 18) true else false
}

