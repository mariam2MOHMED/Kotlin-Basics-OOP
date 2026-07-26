package kotlin_basic

fun main(){
    //Q1. Write a Kotlin program with a main function. - Print your full name and your city
    //on separate lines. - Print the same details again using a single multi-line string
 /*println("Mariam Mohamed Abdallah")
    println("Benha ")
    println("""Mariam Mohamed Abdallah
        Benha 
    """.trimIndent())
*/
    //Q2. Declare variables. - Create name (String), birthYear (Int), height (Double), and
    //isStudent (Boolean). - Print all values in one descriptive sentence. - Update the
    //height value and print only the updated value.
    /*val name: String="Mariam Mohamed Abdallah"
    val city: String="Benha"
    val isStudent: Boolean=true;
    var  height:Int=170
    println("My name is $name")
    println("My city is  $city")
    height=167
    println("My height is  $height")*/
    //Q3. Work with strings. - Combine first and last name into a fullName variable. -
    //Print its length, uppercase form, and check if it contains a space. - Create another
    //string with extra spaces and print it before and after trimming.
    /*val firstName :String ="Mariam"
    val lastName :String ="Mohamed"
    val  fullName:String="$firstName $lastName"
    // Print full name
    println("Full Name: $fullName")

    // Length
    println("Length: ${fullName.length}")
    println("uppercase ${fullName.uppercase()}")
    println("check if it contains a space ${fullName.contains(" ")}")

    // String with extra spaces
    val text = "      Hello Kotlin      "

    println("Before trim: '$text'")

    println("After trim: '${text.trim()}'")*/

//Q4. Use integers and doubles. - Declare an Int and a Double. - Create a new
//variable as their sum and print the sum as Double and as Int. - Perform and print at
//least three arithmetic operations with these numbers
/*var number1:Int=5
    var number2 : Double=6.5

var sum=number1+number2
    println("sum as Double ${sum.toDouble()}")
    println("sum as Int ${sum.toInt()}")
// Arithmetic operations
    println("Addition: ${number1 + number2}")
    println("Subtraction: ${number1 - number2}")
    println("Multiplication: ${number1 * number2}")
    println("Division: ${number1 / number2}")*/
    //Q5. Comparison operators. - Declare two numbers and print the result of each
    //comparison operator. - Declare a third number and check if it equals the sum of the
    //first two.
   /* var number1:Int=5
    var number2 : Int=6
    println(number1==number2)
    println(number1>=number2)
    println(number1<=number2)
    println(number1>number2)*/
    // Q6. Lists. - Create a list with at least three fruits. - Add one fruit, remove one fruit,
    //and update one fruit. - Print the first fruit, last fruit, and the total size of the list.
    /*val fruit=mutableListOf<String>("apple","banana","orange")
    fruit.add("starbwary")
    println(fruit)
    fruit.remove("banana")
    println(fruit)
    fruit.set(0,"mango")
    println(fruit[0])
    println(fruit[fruit.size-1])
println(fruit.size)*/
    //Q7. Sets. - Start with a list of integers containing duplicates. - Convert it to a set
    //and print the set. - Add an element, remove an element, and check if an element
    //exists.
    /*var integers=listOf<Int>(10,10,20,30,30,40,50)
    var setOfInteger=integers.toMutableSet()
    setOfInteger.add(60)
    setOfInteger.remove(20)
  val isExist=  setOfInteger.contains(70)
    println(setOfInteger)
    println(isExist)*/
    //Q8. Maps. - Create a map for a student with keys: name, age, and GPA. - Print a
    //value, update a value, and add a new key-value pair. - Print all keys, all values,
    //and check if a key exists
    /*var map=mutableMapOf<String,Any>("name" to "Mariam",
        "age" to 23 ,
        "GPA" to 3.5 ,
        )
    println(map.values)
    map.set(key = "university", value = "Benha")
    println(map.keys)
    println(map.values)
    println(map.containsKey("age"))*/
    //Q9. List of maps. - Create a list with two maps, each with a product name and
    //price. - Print the first product's name. - Calculate the total price and print it
    //formatted to two decimals.
    // Create a list with two maps
    /*val products = listOf(
        mapOf("name" to "Laptop", "price" to 1500.0),
        mapOf("name" to "Mouse", "price" to 50.0)
    )

    // Print the first product's name
    println("First product: ${products[0]["name"]}")

    // Calculate the total price
    val totalPrice = products.sumOf { it["price"] as Double }

    // Print the total price formatted to two decimals
    println("Total Price: %.2f".format(totalPrice))*/
}