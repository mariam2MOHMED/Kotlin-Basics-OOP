package kotlin_basic

fun main(){
    /// q2
    var res=isPrime(2)
    print(res)
    for ( i in  1..50){

    }
    ///Q4
    val grades = listOf(85.0, 90.5, 78.0, 88.5, 95.0)

    val average = averageGrade(grades)

    println("Average Grade = $average")
//Q3
    var  reverseText=reverseString("mariam")
    print(reverseText)
}
    //Kotlin Compound Exercises – Functions, Loops, and
    //Conditionals
    //Q1. Factorial Program
    //a) Write a function factorial(n: Int): Int that calculates the factorial of a number using a
    //loop.
    fun factorial(n:Int):Int{
        var fact:Int=1
        for( i in 1..n){
            fact*=i
        }
return fact;
    }
    //b) In main, read a number from the user and print its factorial.
    //Q2. Prime Number Checker
    //a) Write a function isPrime(n: Int): Boolean that checks if a number is prime.
    //b) In main, use a loop to print all prime numbers from 1 to 50.
fun isPrime(n: Int): Boolean{
         var flag:Boolean=true;
    for (i in 2 ..n-1){
        if(n%i==0){
flag=false
        }
    }
        return flag
}
    //Q3. String Utilities
    //a) Write a function reverseString(text: String): String that reverses a string using a
    //loop.
fun reverseString(text: String): String{
    var reverseTxt=""
    for (i in  text.length-1 downTo  0){
        reverseTxt+=text[i]
    }
return  reverseTxt
}
    //b) In main, read a string from the user and print both the reversed string and the
    //original string’s length.
    //Q4. Student Grades Program
    //a) Write a function averageGrade(grades: List): Double that calculates the average of
    //a list of grades.
    //b) In main, create a list of at least 5 grades, call the function, and print the average.
fun averageGrade(grades: List<Double>): Double{
 return grades.sum()/grades.size
}