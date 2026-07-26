package oop
fun main(){
    val user1= User(username = "mariam", email = "mar22@gmail.com")
    val user2= User(username = "hager", email = "hager25@gmail.com")
    //q2
    val s1= Student(name = "mariam", age = 23.5, grade = "A")
    //q3
    val p1= Product(id = "123", name = "mariam", )
    //  Q4
    var c1= Car(brand = "sw", model = "bmw", year = 2026)
    val c2= Car(brand = "e4")

}
//Kotlin OOP Coding
//Q1: Create a class User with attributes username and email. - Use a primary
//constructor.
//- Add an init block that prints "New user created: <username>".
//- Create two objects and check if the message is printed automatically.
class User (var username:String,var email:String ){
    init {
        println("New user created: $username")
    }
}
//Q2: Create a class Student with attributes name, age, and grade. - Provide a
//primary constructor that takes all values.
//- Add a secondary constructor that only takes name and age (default grade =
//"Not Assigned").
//- Create objects using both constructors and print their details.
class Student (var name: String, var age: Double, var grade: String,){
   constructor(name:String, age:Double):this(name = name, age = age, grade = "Not Assigned")
}
//Q3: Create a class Product with attributes id, name, and price. - Use a primary
//constructor with default values (e.g., price = 0.0).
//- Add an init block that throws an error if price is negative.
//- Create at least 3 objects: one full, one without price (use default), and one with
//invalid negative price.
class Product (var id :String, var name :String, var price : Double=0.0,){
    init {
require(price>=0)

        {
    throw Exception("price must be positive")
        }
    }
}
//Q4: Create a class Car with attributes brand, model, and year. - Primary
//constructor should take all three.
//- Add a secondary constructor that only takes brand and model (year = current
//year).

//- Add another secondary constructor that only takes brand, with default values for
//the rest.
//- Create objects using each constructor and print their values.
class Car (var brand :String,var model:String ,var year:Int){
    constructor(brand: String,model:String,) : this(brand = brand, model = model, year = 2026)
    constructor(brand: String):this(brand = brand, model = "bmw", year = 2026)
}
//Q5: Create a class Rectangle with width and height. - Use a primary constructor.
//- In the init block, check if width and height are greater than 0; otherwise, throw an
//error.
//- Add a method area() that calculates the rectangle’s area.
//- Test with valid and invalid rectangles.