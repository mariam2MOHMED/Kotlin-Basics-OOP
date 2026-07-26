package kotlin_basic

fun main(){
    //Q1. Write a program that reads an integer and checks if it is even or odd. Print a clear message
    //using an if-else statement
/*val num :Int=readLine()!!.toInt()
    if(num%2==0){
        println("Even Number")
    }else{
        println("Odd Number")
    }
*/
    //Q2. Write a program that takes a number grade (0–100) and prints the corresponding letter grade
    //(A, B, C, D, or F) using multiple if-else conditions.
    /*val grade :Double=readLine()!!.toDouble()
    if(grade>=85 && grade <=100){
        println('A')
    }else   if(grade>=70 && grade <85){
        println('B')
    }
    else   if(grade>=60 && grade <70){
        println('C')
    }
    else   if(grade>=50 && grade <60){
        println('D')
    }else{
        println('F')
    }*/
    //Q3. Write a program that prints all numbers from 1 to 20 using a for loop. Then modify it to print only
    //the even numbers in that range.
    /*for (i in 1..20) {
   println(i)
    }
    for (i in 1 .. 20){
        if(i%2==0){
            println(i)
        }
    }*/
    //Q4. Write a program that calculates the sum of numbers from 1 to 100 using a while loop. Print the
    //final sum.
 /*   var number:Int=1;
    var sum:Int=0;
while(number<=100){
 sum+=number
    number++;
}
    println(sum)*/
    //Q5. Write a program that asks the user for a number n and prints the multiplication table of n from 1
    //to 10 using a for loop.
   /* var n=readLine()!!.toInt()
    for (i in 1 .. 10){
        println("$n * $i = ${n*i}")
    }*/
  /*  for (i in 1 .. 10){
        for (j in 1 .. 10){
print("${i*j} ")
        }
        print("\n")
    }*/
    //Q6. Create a program that defines a list of integers. Use a for-each loop to print each element.
    //Then use a loop with an if condition to print only the positive numbers.

/*var numbers=listOf<Int>(1,3,-5,-9,5,7,9,-7,-9)
    numbers.forEach {
        n -> if(n>0) println(n)
    }
*/
}
