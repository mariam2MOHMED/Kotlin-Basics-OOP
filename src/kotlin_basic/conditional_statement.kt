package kotlin_basic

//في Kotlin، **Conditional Statements** هي الجمل التي تسمح بتنفيذ كود معين بناءً على شرط. وفقًا لـ **Kotlin Documentation**، يوجد نوعان رئيسيان:
//
//1. `if`
//2. `when`
//
//---
//
//# 1. if Expression
//
//في Kotlin، `if` ليست مجرد Statement كما في Java، بل هي **Expression** أيضًا، أي أنها يمكن أن ترجع قيمة.
//
//## الشكل الأساسي
//
//```kotlin
//if (condition) {
//    // code
//}
//```
//
//مثال:
//
//```kotlin
//fun main() {
//    val age = 20
//    if (age >= 18) {
//        println("Adult")
//    }
//}
//```
//
//Output
//
//```
//Adult
//```
//
//---
//
//# if - else
//
//```kotlin
//fun main() {
//
//    val age = 15
//
//    if (age >= 18) {
//        println("Adult")
//    } else {
//        println("Child")
//    }
//
//}
//```
//
//Output
//
//```
//Child
//```
//
//---
//
//# if - else if - else
//
//مثل باقي اللغات.
//
//```kotlin
//fun main() {
//
//    val score = 85
//
//    if (score >= 90) {
//        println("A")
//    } else if (score >= 80) {
//        println("B")
//    } else if (score >= 70) {
//        println("C")
//    } else {
//        println("Fail")
//    }
//
//}
//```
//
//Output
//
//```
//B
//```
//
//---
//
//# if as an Expression
//
//هذه من أهم مميزات Kotlin.
//
//بدلاً من كتابة:
//
//Java
//
//```java
//int max;
//
//if(a > b)
//    max = a;
//else
//    max = b;
//```
//
//في Kotlin
//
//```kotlin
//val max = if (a > b) a else b
//```
//
//مثال كامل
//
//```kotlin
//fun main() {
//    val x = 15
//    val y = 20
//
//    val max = if (x > y) x else y
//
//    println(max)
//
//}
//```
//
//Output
//
//```
//20
//```
//
//---
//
//# Returning Multiple Statements
//
//يمكن أن يحتوي الفرع على أكثر من سطر.
//
//```kotlin
//fun main() {
//
//    val x = 10
//    val y = 5
//
//    val result = if (x > y) {
//        println("x is greater")
//        x
//    } else {
//        println("y is greater")
//        y
//    }
//
//    println(result)
//
//}
//```
//
//Output
//
//```
//x is greater
//10
//```
//
//آخر سطر داخل الـ block هو القيمة التي يتم إرجاعها.
//
//---
//
//# Nested if
//
//يمكن وضع if داخل if.
//
//```kotlin
//fun main() {
//
//    val age = 20
//    val hasID = true
//
//    if (age >= 18) {
//
//        if (hasID) {
//            println("Allowed")
//        } else {
//            println("Need ID")
//        }
//
//    } else {
//        println("Too young")
//    }
//
//}
//```
//
//---
//
//# Comparison Operators
//
//تستخدم مع if.
//
//| Operator | Meaning          |
//| -------- | ---------------- |
//| `==`     | Equal            |
//| `!=`     | Not Equal        |
//| `>`      | Greater          |
//| `<`      | Less             |
//| `>=`     | Greater or Equal |
//| `<=`     | Less or Equal    |
//
//مثال
//
//```kotlin
//if (x == y)
//```
//
//---
//
//# Logical Operators
//
//| Operator | Meaning |   |    |
//| -------- | ------- | - | -- |
//| `&&`     | AND     |   |    |
//| `        |         | ` | OR |
//| `!`      | NOT     |   |    |
//
//مثال
//
//```kotlin
//if (age >= 18 && hasLicense) {
//    println("Can drive")
//}
//```
//
//---
//
//# in Operator
//
//لفحص إذا كانت القيمة داخل مدى أو مجموعة.
//
//```kotlin
//val number = 7
//
//if (number in 1..10) {
//    println("Inside")
//}
//```
//
//---
//
//# !in Operator
//
//```kotlin
//if (number !in 1..10) {
//    println("Outside")
//}
//```
//
//---
//
//# 2. when Expression
//
//تعتبر `when` البديل الأقوى والأكثر مرونة لـ `switch` في Java.
//
//## الشكل الأساسي
//
//```kotlin
//when (value) {
//    value1 -> code
//    value2 -> code
//    else -> code
//}
//```
//
//مثال
//
//```kotlin
//fun main() {
//
//    val day = 3
//
//    when (day) {
//        1 -> println("Monday")
//        2 -> println("Tuesday")
//        3 -> println("Wednesday")
//        else -> println("Unknown")
//    }
//
//}
//```
//
//Output
//
//```
//Wednesday
//```
//
//---
//
//# Multiple Values
//
//يمكن دمج أكثر من قيمة.
//
//```kotlin
//when (day) {
//
//    1, 2, 3, 4, 5 ->
//        println("Weekday")
//
//    6, 7 ->
//        println("Weekend")
//
//}
//```
//
//---
//
//# when as an Expression
//
//يمكن أن ترجع قيمة.
//
//```kotlin
//val grade = when(score){
//
//    in 90..100 -> "A"
//
//    in 80..89 -> "B"
//
//    in 70..79 -> "C"
//
//    else -> "F"
//
//}
//```
//
//---
//
//# when Without Argument
//
//يمكن استخدام `when` بدون وضع متغير بين القوسين، فتكون كل حالة عبارة عن شرط منطقي.
//
//```kotlin
//val number = 12
//
//when {
//
//    number % 2 == 0 -> println("Even")
//
//    else -> println("Odd")
//
//}
//```
//
//---
//
//# Using Ranges
//
//```kotlin
//when(score){
//
//    in 90..100 -> println("Excellent")
//
//    in 80..89 -> println("Very Good")
//
//    else -> println("Try Again")
//
//}
//```
//
//---
//
//# Using is (Type Checking)
//
//تستخدم للتحقق من نوع الكائن، ومعها يحدث **Smart Cast** تلقائيًا.
//
//```kotlin
//fun describe(obj: Any) {
//
//    when (obj) {
//
//        is String ->
//            println(obj.length)
//
//        is Int ->
//            println(obj + 10)
//
//        else ->
//            println("Unknown")
//
//    }
//
//}
//```
//
//---
//
//# Using !is
//
//```kotlin
//when (obj) {
//
//    !is String ->
//        println("Not String")
//
//    else ->
//        println(obj.length)
//
//}
//```
//
//---
//
//# Combining Conditions
//
//```kotlin
//when (x) {
//
//    1, 2, 3 -> println("Small")
//
//    in 4..10 -> println("Medium")
//
//    else -> println("Large")
//
//}
//```
//
//---
//
//# Smart Cast داخل `when`
//
//عند استخدام `is`، لا تحتاج إلى تحويل النوع يدويًا (`as`)، لأن Kotlin تقوم بذلك تلقائيًا.
//
//```kotlin
//fun printLength(value: Any) {
//    when (value) {
//        is String -> println("Length = ${value.length}")
//        else -> println("Not a String")
//    }
//}
//```
//
//---
//
//# متى أستخدم `if` ومتى أستخدم `when`؟
//
//| استخدم | عندما                                                                                                                           |
//| ------ | ------------------------------------------------------------------------------------------------------------------------------- |
//| `if`   | لديك شرط أو شرطان بسيطان، أو مقارنة بين قيمتين، أو تحتاج إلى اختيار بين نتيجتين.                                                |
//| `when` | لديك عدة حالات أو قيم مختلفة، أو تريد كتابة كود أوضح وأسهل في القراءة، أو تحتاج إلى التحقق من الأنواع (`is`) أو المديات (`in`). |
//
//---
//
//## ملخص
//
//| Feature                        | `if` | `when` |
//| ------------------------------ | ---- | ------ |
//| Expression                     | ✅    | ✅      |
//| Statement                      | ✅    | ✅      |
//| بديل لـ switch                 | ❌    | ✅      |
//| يدعم Range (`in`)              | ✅    | ✅      |
//| يدعم Type Check (`is`)         | ❌    | ✅      |
//| يدعم عدة قيم في الحالة الواحدة | ❌    | ✅      |
//| مناسب للشروط البسيطة           | ✅    | ✅      |
//| مناسب للعديد من الحالات        | ❌    | ✅      |
//
//في Kotlin، يُفضَّل استخدام `when` بدلًا من سلاسل طويلة من `if-else if` لأنها تجعل الكود أكثر وضوحًا وأسهل في الصيانة، بينما يظل `if` الخيار الأفضل للشروط البسيطة أو المقارنات المباشرة.