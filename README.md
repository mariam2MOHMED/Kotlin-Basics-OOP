1. Variables & Data Types

في Kotlin عندك نوعين للمتغيرات:

val (value): متغير ثابت، بتحدد قيمته مرة واحدة ومينفعش تتغير بعد كده — زي final في Java. الأفضل تستخدمه دايمًا كـ default.
var (variable): متغير قابل للتغيير، تقدر تعيد تعيين قيمته أي وقت.

كمان Kotlin بيدعم type inference، يعني مش لازم تكتب النوع صريح — الـ compiler بيستنتجه من القيمة اللي انت حاططها. وده بيخلي الكود أقصر وأنضف من غير ما يفقد الـ type safety.

كل الأنواع الأساسية (Int, Long, Double, Float, Boolean, Char, String) هي objects في Kotlin (مفيش primitive types زي Java اللي هي منفصلة عن الـ objects)، وده بيخلي التعامل معاها متسق أكتر.

kotlin
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

⚡ Best Practice: استخدم val دايمًا إلا لو محتاج القيمة تتغير — بيقلل الأخطاء ويخلي الكود أسهل في التتبع (immutability).

2. Null Safety

دي واحدة من أهم مميزات Kotlin وسبب رئيسي ليها كلغة. النظام مصمم عشان يمنع الـ NullPointerException (اللي شهير في Java باسم "billion dollar mistake") من الأساس، عن طريق إجبارك تحدد وقت الكتابة إذا كان المتغير ممكن يبقى null ولا لأ.

أي نوع عادي زي String مينفعش يبقى null أبدًا.
لو عايز تسمح بـ null، لازم تضيف علامة استفهام ? بعد النوع، زي String?.

عشان تتعامل مع القيم اللي ممكن تكون null، عندك أدوات:

?. (safe call): بينفذ العملية بس لو القيمة مش null، وإلا بيرجع null.
?: (Elvis operator): بيدّيك قيمة بديلة لو الأصلية كانت null.
!! (non-null assertion): بيقولك "أنا متأكد إنها مش null" وبيرمي exception لو غلط — استخدمه بحذر شديد.
?.let { }: بينفذ الكود جوه الـ block بس لو القيمة مش null.
kotlin
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
3. Control Flow

في Kotlin، الـ control flow statements زي if وwhen مش مجرد statements بس — ممكن تستخدمها كـ expressions ترجع قيمة، وده بيقلل الحاجة لمتغيرات مؤقتة.

if/else: زي أي لغة تانية، لكن ممكن يرجع قيمة مباشرة.
when: بديل أقوى وأنضف من الـ switch التقليدي؛ بيدعم مقارنة قيم متعددة في نفس السطر، ونطاقات (ranges)، ومش محتاج break.
for: بيشتغل على أي حاجة قابلة للتكرار (Iterable)، وبيتعامل بسهولة مع الـ ranges زي 1..5 أو 5 downTo 1 step 2.
while / do-while: زي اللغات التانية تمامًا.
kotlin
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
4. Functions

الـ function الأساسية في Kotlin بتتعرف بكلمة fun، وبتحدد نوع الـ return بعد الـ parentheses بـ :. لو الفنكشن سطر واحد بس، تقدر تكتبها كـ single-expression function من غير {} ولا return.

مميزات إضافية:

Default arguments: تقدر تحدد قيمة افتراضية للـ parameter، فتبقى optional وقت الاستدعاء.
Named arguments: تقدر تستدعي الفنكشن وتحدد اسم كل parameter، وده بيخلي الكود أوضح خصوصًا مع parameters كتير.
Vararg: تقدر تستقبل عدد غير محدد من الـ arguments من نفس النوع.
kotlin
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
5. Collections

Kotlin بيفرق بوضوح بين الـ read-only (immutable) collections والـ mutable collections:

listOf(), setOf(), mapOf() → بترجع نسخة مقفولة، مينفعش تضيف أو تشيل منها.
mutableListOf(), mutableSetOf(), mutableMapOf() → بترجع نسخة تقدر تعدل فيها.

الـ collections في Kotlin مزودة بـ functions جاهزة (functional-style) زي map, filter, sum, forEach بتخليك تكتب عمليات معقدة على البيانات في سطر واحد من غير loops يدوية.

kotlin
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
6. String Templates

بدل ما تعمل concatenation بـ +، Kotlin بيديك string templates: تحط $ قبل اسم المتغير عشان تدرجه جوه الـ string مباشرة، أو ${...} لو محتاج تنفذ expression كامل (زي .length أو عملية حسابية).

كمان فيه raw strings (بين """...""") مفيدة للنصوص متعددة الأسطر أو لما تحتاج تتجنب الـ escaping، ودالة .trimIndent() بتشيل المسافات الزيادة من بداية كل سطر.

kotlin
val name = "Kotlin"
println("Hello, $name!")
println("Length is ${name.length}")

val multiLine = """
    Line 1
    Line 2
""".trimIndent()
