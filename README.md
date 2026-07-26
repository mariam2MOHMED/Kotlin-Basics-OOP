# Kotlin Basics & OOP — دليل شامل 🚀

دليل يغطي أساسيات Kotlin ومفاهيم الـ OOP الأساسية، مع شرح لكل topic، مناسب كمرجع سريع أو كـ README لمشروع تعليمي.

---

## 📑 Table of Contents
1. [Variables & Data Types](#1-variables--data-types)
2. [Null Safety](#2-null-safety)
3. [Control Flow](#3-control-flow)
4. [Functions](#4-functions)
5. [Collections](#5-collections)
6. [String Templates](#6-string-templates)
7. [OOP: Classes & Objects](#7-oop-classes--objects)
8. [Constructors](#8-constructors)
9. [Inheritance](#9-inheritance)
10. [Interfaces & Abstract Classes](#10-interfaces--abstract-classes)
11. [Data Classes](#11-data-classes)
12. [Sealed Classes](#12-sealed-classes)
13. [Object & Companion Object](#13-object--companion-object)
14. [Enum Classes](#14-enum-classes)
15. [Extension Functions](#15-extension-functions)
16. [Lambda & Higher-Order Functions](#16-lambda--higher-order-functions)
17. [Visibility Modifiers](#17-visibility-modifiers)

---

## 1. Variables & Data Types

في Kotlin عندك نوعين للمتغيرات:
- **`val`** (value): متغير ثابت، بتحدد قيمته مرة واحدة ومينفعش تتغير بعد كده — زي `final` في Java. الأفضل تستخدمه دايمًا كـ default.
- **`var`** (variable): متغير قابل للتغيير، تقدر تعيد تعيين قيمته أي وقت.

كمان Kotlin بيدعم **type inference**، يعني مش لازم تكتب النوع صريح — الـ compiler بيستنتجه من القيمة اللي انت حاططها. وده بيخلي الكود أقصر وأنضف من غير ما يفقد الـ type safety.

كل الأنواع الأساسية (`Int`, `Long`, `Double`, `Float`, `Boolean`, `Char`, `String`) هي **objects** في Kotlin (مفيش primitive types زي Java اللي هي منفصلة عن الـ objects)، وده بيخلي التعامل معاها متسق أكتر.

```kotlin
val name: String = "Ahmed"      // val = constant (read-only), زي final في جافا
var age: Int = 25               // var = mutable, ممكن تتغير

// Type inference - كوتلن بيستنتج النوع لوحده
val city = "Cairo"

// أنواع البيانات الأساسية
val myInt: Int = 10
val myLong: Long = 10000000000L
val myDouble: Double = 3.14
val myFloat: Float = 3.14f
val myBoolean: Boolean = true
val myChar: Char = 'A'
val myString: String = "Hello Kotlin"
```

> ⚡ **Best Practice:** استخدم `val` دايمًا إلا لو محتاج القيمة تتغير — بيقلل الأخطاء ويخلي الكود أسهل في التتبع (immutability).

---

## 2. Null Safety

دي واحدة من أهم مميزات Kotlin وسبب رئيسي ليها كلغة. النظام مصمم عشان يمنع الـ `NullPointerException` (اللي شهير في Java باسم "billion dollar mistake") من الأساس، عن طريق إجبارك تحدد وقت الكتابة إذا كان المتغير ممكن يبقى `null` ولا لأ.

- أي نوع عادي زي `String` **مينفعش** يبقى `null` أبدًا.
- لو عايز تسمح بـ `null`، لازم تضيف علامة استفهام `?` بعد النوع، زي `String?`.

عشان تتعامل مع القيم اللي ممكن تكون null، عندك أدوات:
- **`?.`** (safe call): بينفذ العملية بس لو القيمة مش null، وإلا بيرجع null.
- **`?:`** (Elvis operator): بيدّيك قيمة بديلة لو الأصلية كانت null.
- **`!!`** (non-null assertion): بيقولك "أنا متأكد إنها مش null" وبيرمي exception لو غلط — استخدمه بحذر شديد.
- **`?.let { }`**: بينفذ الكود جوه الـ block بس لو القيمة مش null.

```kotlin
var nullableName: String? = null   // ? يعني ممكن تكون null
var name: String = "Ahmed"         // ده مينفعش يبقى null

// Safe call operator
val length = nullableName?.length          // لو null هيرجع null

// Elvis operator
val length2 = nullableName?.length ?: 0    // لو null هياخد 0

// Non-null assertion (خطر - استخدمه بحذر)
val length3 = nullableName!!.length        // هيرمي Exception لو null

// let scope function مع null safety
nullableName?.let {
    println("Name is $it")
}
```

---

## 3. Control Flow

في Kotlin، الـ control flow statements زي `if` و`when` مش مجرد statements بس — ممكن تستخدمها كـ **expressions** ترجع قيمة، وده بيقلل الحاجة لمتغيرات مؤقتة.

- **`if/else`**: زي أي لغة تانية، لكن ممكن يرجع قيمة مباشرة.
- **`when`**: بديل أقوى وأنضف من الـ `switch` التقليدي؛ بيدعم مقارنة قيم متعددة في نفس السطر، ونطاقات (`ranges`)، ومش محتاج `break`.
- **`for`**: بيشتغل على أي حاجة قابلة للتكرار (`Iterable`)، وبيتعامل بسهولة مع الـ ranges زي `1..5` أو `5 downTo 1 step 2`.
- **`while` / `do-while`**: زي اللغات التانية تمامًا.

```kotlin
// if/else كـ expression
val max = if (a > b) a else b

// when (بديل الـ switch)
when (x) {
    1 -> println("One")
    2, 3 -> println("Two or Three")
    in 4..10 -> println("Between 4 and 10")
    else -> println("Other")
}

// for loop
for (i in 1..5) println(i)
for (i in 5 downTo 1 step 2) println(i)
for (item in listOf("a", "b", "c")) println(item)

// while / do-while
var i = 0
while (i < 5) { i++ }
```

---

## 4. Functions

الـ function الأساسية في Kotlin بتتعرف بكلمة `fun`، وبتحدد نوع الـ return بعد الـ parentheses بـ `:`. لو الفنكشن سطر واحد بس، تقدر تكتبها كـ **single-expression function** من غير `{}` ولا `return`.

مميزات إضافية:
- **Default arguments**: تقدر تحدد قيمة افتراضية للـ parameter، فتبقى optional وقت الاستدعاء.
- **Named arguments**: تقدر تستدعي الفنكشن وتحدد اسم كل parameter، وده بيخلي الكود أوضح خصوصًا مع parameters كتير.
- **Vararg**: تقدر تستقبل عدد غير محدد من الـ arguments من نفس النوع.

```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}

// Single-expression function
fun multiply(a: Int, b: Int) = a * b

// Default & named arguments
fun greet(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}
greet(name = "Sara", greeting = "Hi")

// Vararg
fun sum(vararg numbers: Int): Int = numbers.sum()
```

---

## 5. Collections

Kotlin بيفرق بوضوح بين الـ **read-only** (immutable) collections والـ **mutable** collections:

- `listOf()`, `setOf()`, `mapOf()` → بترجع نسخة مقفولة، مينفعش تضيف أو تشيل منها.
- `mutableListOf()`, `mutableSetOf()`, `mutableMapOf()` → بترجع نسخة تقدر تعدل فيها.

الـ collections في Kotlin مزودة بـ functions جاهزة (functional-style) زي `map`, `filter`, `sum`, `forEach` بتخليك تكتب عمليات معقدة على البيانات في سطر واحد من غير loops يدوية.

```kotlin
// List
val readOnlyList = listOf(1, 2, 3)
val mutableList = mutableListOf(1, 2, 3).apply { add(4) }

// Set
val set = setOf(1, 2, 2, 3)   // {1, 2, 3}

// Map
val map = mapOf("a" to 1, "b" to 2)

// Common operations
val doubled = mutableList.map { it * 2 }
val evens = mutableList.filter { it % 2 == 0 }
val sum = mutableList.sum()
mutableList.forEach { println(it) }
```

---

## 6. String Templates

بدل ما تعمل concatenation بـ `+`، Kotlin بيديك **string templates**: تحط `$` قبل اسم المتغير عشان تدرجه جوه الـ string مباشرة، أو `${...}` لو محتاج تنفذ expression كامل (زي `.length` أو عملية حسابية).

كمان فيه **raw strings** (بين `"""..."""`) مفيدة للنصوص متعددة الأسطر أو لما تحتاج تتجنب الـ escaping، ودالة `.trimIndent()` بتشيل المسافات الزيادة من بداية كل سطر.

```kotlin
val name = "Kotlin"
println("Hello, $name!")
println("Length is ${name.length}")

val multiLine = """
    Line 1
    Line 2
""".trimIndent()
```

---

## 7. OOP: Classes & Objects

الكلاس هو القالب اللي منه بتتعمل الـ objects. في Kotlin، تقدر تحدد الـ properties مباشرة جوه الـ **primary constructor** (بين قوسين بعد اسم الكلاس)، من غير ما تحتاج تكتب constructor منفصل زي Java.

- لو الـ property محدد بـ `val` → بيبقى read-only بعد الإنشاء.
- لو بـ `var` → تقدر تغيره بعد كده.

الـ object هو نسخة (instance) فعلية من الكلاس، وبتنشئه بـ `ClassName(...)` من غير الحاجة لكلمة `new`.

```kotlin
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("I'm $name, $age years old")
    }
}

val person = Person("Omar", 30)
person.introduce()
```

---

## 8. Constructors

كل كلاس في Kotlin عنده **primary constructor** (اللي بيتحدد جنب اسم الكلاس)، وممكن كمان يبقى عنده **secondary constructors** إضافية لو محتاج طرق تانية لإنشاء الـ object.

- أي secondary constructor لازم يستدعي الـ primary constructor (أو constructor تاني) عن طريق `: this(...)`.
- **`init` block**: كود بينفذ تلقائيًا وقت إنشاء الـ object، بعد الـ primary constructor مباشرة — مفيد للـ validation أو الـ setup الأولي.

```kotlin
class Car(val brand: String, val model: String) {
    // Secondary constructor
    var year: Int = 2024
    
    constructor(brand: String, model: String, year: Int) : this(brand, model) {
        this.year = year
    }
    
    // init block - بيتنفذ مع الـ primary constructor
    init {
        println("Car created: $brand $model")
    }
}
```

---

## 9. Inheritance

في Kotlin، كل الكلاسات بتكون **`final`** by default، يعني مينفعش تعمل منها extend إلا لو حطيت كلمة **`open`** صريحة قبل `class`. نفس الكلام بالظبط ينطبق على الـ functions: لازم تكون `open` عشان الكلاس الوارث يقدر يعمل لها `override`.

- الكلاس الوارث بيستخدم `:` بدل `extends`.
- لازم تستدعي constructor الكلاس الأب في نفس السطر.
- الفنكشن اللي بتعمل لها override لازم تتحط قبلها كلمة `override`.

ده تصميم متعمد من Kotlin عشان يشجعك تفكر كويس قبل ما تسمح بالوراثة (composition over inheritance).

```kotlin
open class Animal(val name: String) {          // open = ممكن يتعمله extend
    open fun makeSound() {                       // open = ممكن يتعمله override
        println("$name makes a sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name barks")
    }
}

val dog = Dog("Rex")
dog.makeSound()   // Rex barks
```

---

## 10. Interfaces & Abstract Classes

- **Interface**: بيحدد "عقد" (contract) للفنكشنز اللي لازم أي كلاس يطبقها يوفرها. الفرق عن Java إن الـ interface في Kotlin ممكن يكون فيه **default implementation** للفنكشن (زي `stop()` هنا)، مش بس تعريف فاضي. كمان كلاس واحد ممكن يعمل implement لأكتر من interface.
- **Abstract class**: زي الكلاس العادي بس مينفعش تعمل منه instance مباشرة — لازم كلاس تاني يعمله extend. تقدر تحط فيه functions كاملة (implemented) وفنكشنز `abstract` (لازم الكلاس الوارث يطبقها).

الفرق الأساسي: كلاس واحد بس يقدر يعمل extend لـ abstract class واحد، لكن يقدر يعمل implement لأكتر من interface في نفس الوقت.

```kotlin
// Interface
interface Drivable {
    fun drive()
    fun stop() {                     // default implementation
        println("Stopped")
    }
}

// Abstract class
abstract class Shape {
    abstract fun area(): Double      // لازم يتعمله implement
    fun describe() = println("Area: ${area()}")
}

class Circle(val radius: Double) : Shape() {
    override fun area() = Math.PI * radius * radius
}
```

---

## 11. Data Classes

لما تحط كلمة `data` قبل `class`، بتقول للـ compiler إن الكلاس ده الغرض منه أساسًا إنه يحمل بيانات (model/DTO). في المقابل، Kotlin بيولّدلك تلقائيًا:

- **`equals()` / `hashCode()`**: مقارنة بالمحتوى مش بالـ reference.
- **`toString()`**: نص واضح بيوضح كل الـ properties.
- **`copy()`**: بتعمل نسخة من الـ object مع تغيير property واحد أو أكتر بس.
- **Destructuring**: تقدر تفك الـ object لمتغيرات منفصلة زي `val (id, name, email) = user1`.

ده بيوفر عليك كتابة كل الكود ده يدويًا زي ما بتعمل في Java.

```kotlin
data class User(val id: Int, val name: String, val email: String)

val user1 = User(1, "Ali", "ali@mail.com")
val user2 = user1.copy(name = "Sara")

println(user1)                 // User(id=1, name=Ali, email=ali@mail.com)
println(user1 == user2)        // false
val (id, name, email) = user1  // destructuring
```

---

## 12. Sealed Classes

الـ `sealed class` بتحدد مجموعة محدودة (closed) من الأنواع الفرعية المعروفة وقت الـ compile — يعني مفيش حد ممكن يضيف نوع جديد من برا الملف. أهم فايدة: لما تستخدمها مع `when`، الـ compiler بيتأكد إنك غطيت كل الحالات الممكنة، فمش محتاج `else` clause.

بتستخدم كتير في حالات زي تمثيل الـ **state** بتاع الشاشة (Loading / Success / Error) في الـ MVVM أو الـ clean architecture — حاجة شبه اللي بتشتغل بيها في مشاريعك.

```kotlin
sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val message: String) : Result<Nothing>()
    object Loading : Result<Nothing>()
}

fun handleResult(result: Result<String>) = when (result) {
    is Result.Success -> println("Data: ${result.data}")
    is Result.Error -> println("Error: ${result.message}")
    is Result.Loading -> println("Loading...")
    // مش محتاج else لأن sealed class exhaustive
}
```

---

## 13. Object & Companion Object

- **`object`**: طريقة Kotlin لعمل **Singleton** — كلاس عنده instance واحدة بس في التطبيق كله، وبتتعمل تلقائيًا أول ما تستخدمها. مفيد لحاجات زي configuration أو managers مشتركة.
- **`companion object`**: جوه كلاس عادي، بيدّيك أعضاء (functions/properties) مرتبطة بالكلاس نفسه مش بأي instance بعينها — تقريبًا زي `static` في Java. بتستخدمها كتير لعمل factory functions أو constants.

```kotlin
// Singleton
object AppConfig {
    val apiUrl = "https://api.example.com"
}
AppConfig.apiUrl

// Companion object - زي static في جافا
class MathUtils {
    companion object {
        fun square(x: Int) = x * x
        const val PI = 3.14159
    }
}
MathUtils.square(5)
```

---

## 14. Enum Classes

الـ `enum class` بتستخدم لما يكون عندك مجموعة ثابتة ومعروفة من القيم (زي حالات الطلب مثلًا). كل قيمة جوه الـ enum هي فعليًا instance من الكلاس نفسه.

مميزة قوية في Kotlin: تقدر تدي كل قيمة في الـ enum **properties** خاصة بيها (زي `degrees` في المثال)، وتقدر تستخدم الـ enum مباشرة جوه `when` بدون الحاجة لـ `else` لو غطيت كل القيم.

```kotlin
enum class OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED
}

enum class Direction(val degrees: Int) {
    NORTH(0), EAST(90), SOUTH(180), WEST(270)
}

val status = OrderStatus.SHIPPED
when (status) {
    OrderStatus.PENDING -> println("Waiting")
    OrderStatus.SHIPPED -> println("On the way")
    OrderStatus.DELIVERED -> println("Done")
    OrderStatus.CANCELLED -> println("Cancelled")
}
```

---

## 15. Extension Functions

من أقوى مميزات Kotlin: تقدر تضيف function جديدة لكلاس موجود بالفعل (حتى لو مش انت اللي كاتبه، زي `String` أو أي class من مكتبة خارجية) من غير ما تعمل له inheritance أو تعدل في الكود الأصلي بتاعه.

بتتكتب بصيغة `fun ClassName.functionName()`، وجوه الفنكشن `this` بيشاور على الـ instance اللي بتستدعي منها الفنكشن. بتستخدم كتير عشان تخلي الكود أنضف وأقرب لطريقة كتابتك الطبيعية.

```kotlin
fun String.isPalindrome(): Boolean {
    val clean = this.lowercase()
    return clean == clean.reversed()
}

"level".isPalindrome()   // true
```

---

## 16. Lambda & Higher-Order Functions

الـ **lambda** هي function من غير اسم، بتتكتب جوه `{ }`، وممكن تتخزن في متغير أو تتبعت كـ argument لفنكشن تانية مباشرة.

**Higher-order function** هي أي function بتاخد function تانية كـ parameter أو بترجع function. ده بيسمحلك تكتب كود مرن جدًا (زي `map`, `filter` اللي شفتهم فوق، وهما فعليًا higher-order functions).

لاحظ الـ **trailing lambda syntax**: لو آخر parameter في الفنكشن هو lambda، تقدر تكتبه برا الـ parentheses مباشرة.

```kotlin
val sum: (Int, Int) -> Int = { a, b -> a + b }
println(sum(3, 4))

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
operate(5, 3) { x, y -> x - y }   // trailing lambda syntax
```

---

## 17. Visibility Modifiers

الـ visibility modifiers بتتحكم في مين يقدر يوصل لـ class/function/property معينة، وده جزء أساسي من مبدأ الـ **Encapsulation** في الـ OOP.

| Modifier    | المعنى                                      |
|-------------|----------------------------------------------|
| `public`    | (default) متاح من أي مكان                    |
| `private`   | متاح جوه نفس الملف/الكلاس بس                |
| `protected` | زي private + متاح للـ subclasses            |
| `internal`  | متاح جوه نفس الـ module بس                   |

في المثال اللي جاي، `balance` متحمي بـ `private` فمينفعش أي كود برا الكلاس يوصله مباشرة أو يغيره غير عن طريق الـ function `deposit()` — ده بالظبط جوهر الـ encapsulation.

```kotlin
class BankAccount {
    private var balance: Double = 0.0
    
    fun deposit(amount: Double) {
        balance += amount
    }
}
```

---

## 🎯 OOP Pillars الأربعة في Kotlin

الأربع مبادئ الأساسية للـ Object-Oriented Programming وإزاي كل واحدة فيهم بتتحقق في Kotlin:

| Pillar          | إزاي بيتحقق في Kotlin                              |
|-----------------|------------------------------------------------------|
| Encapsulation   | `private`/`protected` properties + getters/setters   |
| Inheritance     | `open class` + `:` + `override`                       |
| Polymorphism    | method overriding + interfaces                        |
| Abstraction     | `abstract class` و `interface`                        |

---

## 📚 مصادر إضافية
- [Kotlin Official Docs](https://kotlinlang.org/docs/home.html)
- [Kotlin Playground](https://play.kotlinlang.org/)

---

**Happy Coding! 💻🔥**
