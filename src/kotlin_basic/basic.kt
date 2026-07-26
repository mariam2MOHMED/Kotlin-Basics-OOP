fun main(){
    // comment (note for coding)
    /* multipule
    comments */

//طباعة البيانات
    println("my name is mariam");
    //المتغيرات (Variables)
    //متغير قابل للتغيير var
    var name="Mariam";

    //ثابت غير قابل للتغيير val
    val pi=22/7;

    //data types variables
    val friendName: String="mariam";
    val age: Int=23;
    val salary: Double = 5000.5;
    val isStudent: Boolean=true;
    val grade: Char='A';
//
    print("Enter your name: ")
    val name1 = readLine()

    println("Hello $name1")
    //
    val a = 10
    val b = 5

    println(a + b) // 15
    println(a - b) // 5
    println(a * b) // 50
    println(a / b) // 2
    println(a % b) // 0
//هشرح لك **Kotlin Basics** بناءً على مفاهيم الـ Kotlin الرسمية (Documentation) وبأسلوب مناسب لو أنت Flutter/Dart developer عشان تربط المفاهيم.
//
//## 1) Kotlin ايه؟
//
//Kotlin هي لغة برمجة حديثة من JetBrains، وتستخدم كثيرًا في تطوير تطبيقات Android مع Android Studio.
//
//Kotlin:
//
//* Statically typed (نوع المتغير معروف وقت الـ compile)
//* Null safety built-in
//* OOP + Functional programming
//* تعمل على JVM
//
//---
//
//# 1. Hello World
//
//```kotlin
//fun main() {
//    println("Hello Kotlin")
//}
//```
//
//`fun`
//= تعريف function
//
//`main`
//= نقطة بداية البرنامج
//
//`println`
//= طباعة
//
//---
//
//# 2. Variables (المتغيرات)
//
//في Kotlin عندك نوعين:
//
//## val
//
//مثل `final` في Dart
//
//لا يمكن تغيير القيمة:
//
//```kotlin
//val name = "Mariam"
//
//name = "Ali" // Error
//```
//
//يعني:
//
//```
//val = read only
//```
//
//---
//
//## var
//
//يمكن تغيير القيمة:
//
//```kotlin
//var age = 20
//
//age = 21
//```
//
//زي:
//
//```dart
//var age = 20;
//```
//
//---
//
//# 3. Data Types
//
//## Numbers
//
//```kotlin
//val age: Int = 20
//
//val price: Double = 10.5
//
//val score: Float = 99.5f
//```
//
//الأنواع:
//
//| Kotlin | Dart   |
//| ------ | ------ |
//| Int    | int    |
//| Double | double |
//| Float  | double |
//| Long   | int    |
//
//---
//
//## String
//
//```kotlin
//val name: String = "Ahmed"
//```
//
//String interpolation:
//
//```kotlin
//val age = 20
//
//println("My age is $age")
//```
//
//الناتج:
//
//```
//My age is 20
//```
//
//زي Dart:
//
//```dart
//'My age is $age'
//```
//
//---
//
//# 4. Type Inference
//
//Kotlin يقدر يعرف النوع:
//
//```kotlin
//val name = "Ali"
//```
//
//Kotlin يعرف أنها:
//
//```kotlin
//String
//```
//
//لكن تقدر تحدد:
//
//```kotlin
//val name:String = "Ali"
//```
//
//---
//
//# 5. Functions
//
//Syntax:
//
//```kotlin
//fun functionName(){
//
//}
//```
//
//مثال:
//
//```kotlin
//fun sayHello(){
//    println("Hello")
//}
//```
//
//استدعاء:
//
//```kotlin
//sayHello()
//```
//
//---
//
//## Function Parameters
//
//```kotlin
//fun add(a:Int,b:Int){
//    println(a+b)
//}
//```
//
//استعمال:
//
//```kotlin
//add(5,3)
//```
//
//---
//
//## Return value
//
//```kotlin
//fun sum(a:Int,b:Int):Int{
//
//    return a+b
//
//}
//```
//
//أو shortcut:
//
//```kotlin
//fun sum(a:Int,b:Int)=a+b
//```
//
//---
//
//# 6. Conditions
//
//## if
//
//```kotlin
//val age = 20
//
//
//if(age >=18){
//
//    println("Adult")
//
//}else{
//
//    println("Child")
//
//}
//```
//
//---
//
//في Kotlin الـ if عبارة عن expression
//
//يعني ترجع قيمة:
//
//```kotlin
//val result = if(age>=18){
//
//    "Adult"
//
//}else{
//
//    "Child"
//
//}
//```
//
//---
//
//# 7. When
//
//بديل switch في لغات أخرى:
//
//```kotlin
//val day = 1
//
//
//when(day){
//
//    1 -> println("Saturday")
//
//    2 -> println("Sunday")
//
//    else -> println("Unknown")
//
//}
//```
//
//زي:
//
//```dart
//switch(day){}
//```
//
//---
//
//# 8. Loops
//
//## for
//
//```kotlin
//for(i in 1..5){
//
//    println(i)
//
//}
//```
//
//الناتج:
//
//```
//1
//2
//3
//4
//5
//```
//
//---
//
//## while
//
//```kotlin
//var x=0
//
//
//while(x<5){
//
//    println(x)
//
//    x++
//
//}
//```
//
//---
//
//# 9. Collections
//
//## List
//
//مثل Dart List:
//
//```kotlin
//val names = listOf(
//    "Ali",
//    "Ahmed"
//)
//```
//
//لا تتغير:
//
//```
//Immutable
//```
//
//---
//
//Mutable List:
//
//```kotlin
//val names = mutableListOf(
//    "Ali"
//)
//
//
//names.add("Ahmed")
//```
//
//---
//
//## Set
//
//```kotlin
//val numbers=setOf(1,2,3)
//```
//
//لا يسمح بالتكرار.
//
//---
//
//## Map
//
//زي Map في Dart:
//
//```kotlin
//val users = mapOf(
//    1 to "Ali",
//    2 to "Ahmed"
//)
//```
//
//---
//
//# 10. Null Safety (مهم جدًا)
//
//في Kotlin لا يسمح بالـ null افتراضيًا:
//
//```kotlin
//var name:String = null
//```
//
//Error ❌
//
//لو عايز يقبل null:
//
//```kotlin
//var name:String? = null
//```
//
//علامة:
//
//```
//?
//```
//
//معناها nullable
//
//---
//
//## Safe Call
//
//بدل:
//
//```kotlin
//name.length
//```
//
//نستخدم:
//
//```kotlin
//name?.length
//```
//
//لو null لن يحدث crash.
//
//زي Dart:
//
//```dart
//name?.length
//```
//
//---
//
//## Elvis Operator
//
//بديل default value:
//
//```kotlin
//val length = name?.length ?: 0
//```
//
//يعني:
//
//لو موجود رجع length
//
//لو null رجع 0
//
//زي Dart:
//
//```dart
//name?.length ?? 0
//```
//
//---
//
//# 11. Classes
//
//تعريف class:
//
//```kotlin
//class User{
//
//    var name:String = ""
//
//}
//```
//
//Object:
//
//```kotlin
//val user = User()
//
//user.name="Ali"
//```
//
//---
//
//# Constructor
//
//```kotlin
//class User(
//    val name:String,
//    val age:Int
//)
//```
//
//إنشاء:
//
//```kotlin
//val user = User(
//    "Ali",
//    20
//)
//```
//
//---
//
//# 12. Data Class
//
//مهمة جدًا في Android و Flutter models
//
//```kotlin
//data class User(
//    val id:Int,
//    val name:String
//)
//```
//
//تعمل:
//
//* toString
//* equals
//* copy
//
//تلقائيًا.
//
//زي Dart:
//
//```dart
//class User {
//}
//```
//
//مع equatable غالبًا.
//
//---
//
//# 13. Inheritance
//
//الأصل:
//
//```kotlin
//open class Animal{
//
//    fun eat(){
//        println("eat")
//    }
//
//}
//```
//
//لازم `open` لأن Kotlin تمنع الوراثة افتراضيًا.
//
//---
//
//Child:
//
//```kotlin
//class Dog:Animal(){
//
//}
//```
//
//---
//
//# 14. Interface
//
//```kotlin
//interface Clickable{
//
//    fun click()
//
//}
//```
//
//تطبيق:
//
//```kotlin
//class Button:Clickable{
//
//
//override fun click(){
//
//}
//
//
//}
//```
//
//---
//
//# 15. Lambda
//
//Function بدون اسم:
//
//```kotlin
//val sum = {a:Int,b:Int -> a+b}
//
//
//println(sum(2,3))
//```
//
//زي Dart:
//
//```dart
//(a,b)=>a+b
//```
//
//---
//
//# مقارنة سريعة Dart vs Kotlin
//
//| Dart       | Kotlin |
//| ---------- | ------ |
//| var        | var    |
//| final      | val    |
//| class      | class  |
//| extends    | :      |
//| implements | :      |
//| ?          | ?      |
//| ??         | ?:     |
//| List       | List   |
//| Map        | Map    |
//| function   | fun    |
//
//---
//
//لو هدفك Flutter → أهم أجزاء Kotlin التي تحتاجها:
//
//1. Variables
//2. Functions
//3. Classes
//4. Null Safety
//5. OOP
//6. Collections
//7. Coroutines (بعد كده)
//
//لأنها أساس فهم Android Native و Flutter plugins.
}
