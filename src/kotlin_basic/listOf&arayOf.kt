package kotlin_basic

var names=arrayOf("m1","m2","m3","m4")
//في Kotlin، **`arrayOf()`** هي الدالة الأساسية لإنشاء **Array** (مصفوفة) تحتوي على عدد ثابت من العناصر.
//
//> وفقًا لـ Kotlin Documentation، الـ **Array** هي مجموعة من العناصر لها **حجم ثابت (Fixed Size)**، وكل عنصر له **Index** يبدأ من `0`.
//
//---
//
//# ما هي Array؟
//
//الـ Array هي مجموعة من العناصر من نفس النوع (غالبًا)، ويمكن الوصول لكل عنصر باستخدام الـ Index.
//
//مثال:
//
//```kotlin
//val names = arrayOf("Ali", "Sara", "Mariam")
//```
//
//شكلها في الذاكرة:
//
//```
//Index:     0        1        2
//         -------------------------
//names -> | "Ali" | "Sara" | "Mariam" |
//         -------------------------
//```
//
//---
//
//# arrayOf()
//
//الصيغة:
//
//```kotlin
//arrayOf(value1, value2, value3)
//```
//
//مثال:
//
//```kotlin
//val numbers = arrayOf(10, 20, 30)
//```
//
//الـ Compiler يستنتج أن النوع هو:
//
//```kotlin
//Array<Int>
//```
//
//---
//
//مثال آخر:
//
//```kotlin
//val colors = arrayOf("Red", "Green", "Blue")
//```
//
//النوع:
//
//```kotlin
//Array<String>
//```
//
//---
//
//# Type Inference
//
//لا تحتاج لكتابة النوع غالبًا.
//
//```kotlin
//val ages = arrayOf(20, 21, 22)
//```
//
//يساوي:
//
//```kotlin
//val ages: Array<Int> = arrayOf(20, 21, 22)
//```
//
//---
//
//# كتابة النوع بنفسك
//
//```kotlin
//val names: Array<String> =
//    arrayOf("Ali", "Sara", "Mariam")
//```
//
//---
//
//# الوصول للعناصر
//
//عن طريق الـ Index.
//
//```kotlin
//val numbers = arrayOf(10,20,30)
//```
//
//أول عنصر
//
//```kotlin
//println(numbers[0])
//```
//
//الناتج
//
//```
//10
//```
//
//---
//
//ثاني عنصر
//
//```kotlin
//println(numbers[1])
//```
//
//```
//20
//```
//
//---
//
//آخر عنصر
//
//```kotlin
//println(numbers[2])
//```
//
//```
//30
//```
//
//---
//
//# لماذا يبدأ من صفر؟
//
//لأن Kotlin (مثل Java وC) تستخدم **Zero-based Indexing**.
//
//```
//Index
//0
//1
//2
//3
//```
//
//وليس
//
//```
//1
//2
//3
//4
//```
//
//---
//
//# تعديل عنصر
//
//```kotlin
//val numbers = arrayOf(10,20,30)
//```
//
//غير العنصر الأول
//
//```kotlin
//numbers[0] = 100
//```
//
//الآن
//
//```
//100
//20
//30
//```
//
//---
//
//أو باستخدام `set()`:
//
//```kotlin
//numbers.set(1, 200)
//```
//
//أصبحت
//
//```
//100
//200
//30
//```
//
//---
//
//# قراءة عنصر
//
//يمكن أيضًا استخدام `get()`.
//
//```kotlin
//println(numbers.get(0))
//```
//
//بدلًا من
//
//```kotlin
//println(numbers[0])
//```
//
//الطريقتان متكافئتان.
//
//---
//
//# معرفة حجم الـ Array
//
//```kotlin
//val names = arrayOf(
//    "Ali",
//    "Sara",
//    "Mariam"
//)
//
//println(names.size)
//```
//
//الناتج
//
//```
//3
//```
//
//---
//
//# المرور على العناصر
//
//## باستخدام for
//
//```kotlin
//val numbers = arrayOf(10,20,30)
//
//for(number in numbers){
//    println(number)
//}
//```
//
//الناتج
//
//```
//10
//20
//30
//```
//
//---
//
//## باستخدام indices
//
//```kotlin
//for(i in numbers.indices){
//    println(numbers[i])
//}
//```
//
//الناتج
//
//```
//10
//20
//30
//```
//
//---
//
//## باستخدام withIndex()
//
//```kotlin
//for((index,value) in numbers.withIndex()){
//    println("$index -> $value")
//}
//```
//
//الناتج
//
//```
//0 -> 10
//1 -> 20
//2 -> 30
//```
//
//---
//
//# أنواع مختلفة
//
//## Array<String>
//
//```kotlin
//val names =
//    arrayOf("Ali","Sara","Mariam")
//```
//
//---
//
//## Array<Int>
//
//```kotlin
//val numbers =
//    arrayOf(10,20,30)
//```
//
//---
//
//## Array<Boolean>
//
//```kotlin
//val flags =
//    arrayOf(true,false,true)
//```
//
//---
//
//## Array<Double>
//
//```kotlin
//val prices =
//    arrayOf(10.5,20.8,30.9)
//```
//
//---
//
//# يمكن تخزين Objects
//
//```kotlin
//class Student(
//    val name:String
//)
//
//val students = arrayOf(
//    Student("Ali"),
//    Student("Sara")
//)
//```
//
//---
//
//# Array<Any>
//
//يمكنها تخزين أنواع مختلفة لأنها تعتمد على `Any`.
//
//```kotlin
//val values = arrayOf(
//    10,
//    "Hello",
//    true,
//    15.5
//)
//```
//
//النوع هنا:
//
//```kotlin
//Array<Any>
//```
//
//---
//
//# إنشاء Array فارغة
//
//```kotlin
//val names = emptyArray<String>()
//```
//
//الحجم
//
//```
//0
//```
//
//---
//
//# إنشاء Array بحجم معين
//
//```kotlin
//val numbers = Array(5){0}
//```
//
//المعنى:
//
//```
//Index
//
//0 -> 0
//
//1 -> 0
//
//2 -> 0
//
//3 -> 0
//
//4 -> 0
//```
//
//الناتج
//
//```
//[0,0,0,0,0]
//```
//
//---
//
//مثال آخر
//
//```kotlin
//val squares =
//    Array(5){it*it}
//```
//
//حيث `it` هو الـ Index.
//
//```
//it =0 ->0
//
//it =1 ->1
//
//it =2 ->4
//
//it =3 ->9
//
//it =4 ->16
//```
//
//الناتج
//
//```
//[0,1,4,9,16]
//```
//
//---
//
//# Array ثابتة الحجم
//
//هذه نقطة مهمة جدًا.
//
//```kotlin
//val numbers =
//    arrayOf(10,20,30)
//```
//
//لا يمكن زيادة الحجم إلى 4 عناصر مباشرة.
//
//❌ لا يوجد:
//
//```kotlin
//numbers.add(40)
//```
//
//سيظهر خطأ لأن **Array حجمها ثابت** بعد الإنشاء.
//
//إذا كنت تحتاج إضافة أو حذف عناصر باستمرار، استخدم `MutableList` بدلًا من `Array`.
//
//---
//
//# Primitive Arrays
//
//في Kotlin توجد أنواع خاصة لتخزين القيم البدائية بكفاءة أعلى من `Array<Int>` لأنها لا تقوم بعملية التغليف (Boxing).
//
//| النوع   | الدالة             |
//| ------- | ------------------ |
//| Int     | `intArrayOf()`     |
//| Double  | `doubleArrayOf()`  |
//| Float   | `floatArrayOf()`   |
//| Long    | `longArrayOf()`    |
//| Short   | `shortArrayOf()`   |
//| Byte    | `byteArrayOf()`    |
//| Char    | `charArrayOf()`    |
//| Boolean | `booleanArrayOf()` |
//
//مثال:
//
//```kotlin
//val numbers = intArrayOf(1, 2, 3)
//```
//
//---
//
//# الفرق بين Array و MutableList
//
//| Array                                | MutableList                    |
//| ------------------------------------ | ------------------------------ |
//| حجم ثابت                             | حجم ديناميكي                   |
//| لا يوجد `add()` أو `remove()`        | يوجد `add()` و`remove()`       |
//| أسرع قليلًا للوصول بالعناصر          | أكثر مرونة                     |
//| مناسبة عندما تعرف عدد العناصر مسبقًا | مناسبة عندما يتغير عدد العناصر |
//
//---
//
//# متى أستخدم Array؟
//
//استخدم `Array` عندما:
//
//* عدد العناصر معروف مسبقًا.
//* لا تحتاج إلى إضافة أو حذف عناصر.
//* تريد الوصول للعناصر باستخدام الـ Index بسرعة.
//
//استخدم `MutableList` عندما:
//
//* تحتاج لإضافة عناصر (`add()`).
//* تحتاج لحذف عناصر (`remove()`).
//* حجم البيانات يتغير أثناء تشغيل البرنامج.
//
//## ملخص أهم الدوال والخصائص
//
//| العملية                 | الكود                                       |
//| ----------------------- | ------------------------------------------- |
//| إنشاء Array             | `arrayOf(1, 2, 3)`                          |
//| إنشاء Array فارغة       | `emptyArray<String>()`                      |
//| إنشاء Array بحجم محدد   | `Array(5) { 0 }`                            |
//| قراءة عنصر              | `array[0]` أو `array.get(0)`                |
//| تعديل عنصر              | `array[0] = 100` أو `array.set(0, 100)`     |
//| معرفة الحجم             | `array.size`                                |
//| المرور على العناصر      | `for (item in array)`                       |
//| المرور مع الفهرس        | `for ((index, value) in array.withIndex())` |
//| الحصول على جميع الفهارس | `array.indices`                             |
//
//هذه هي المفاهيم الأساسية والعملية لـ **`arrayOf()`** كما تُقدمها وثائق Kotlin، مع توضيح كيفية الإنشاء، القراءة، التعديل، والفرق بينها وبين `MutableList`.
///////////////////////////////////
//`MutableList` من أهم Collections في Kotlin، وهي **قائمة قابلة للتغيير (Resizable List)**، أي يمكنك إضافة العناصر وحذفها وتعديلها بعد إنشائها.
//
//> **معلومة مهمة من Kotlin Documentation**
//>
//> * `List` = **Read-only** (للقراءة فقط من واجهة الـ API).
//> * `MutableList` = **Mutable** (يمكن القراءة والتعديل والإضافة والحذف).
//
//---
//
//# لماذا نستخدم MutableList؟
//
//لأن الـ `Array` حجمها ثابت.
//
//```kotlin
//val numbers = arrayOf(1,2,3)
//
//// Error
//numbers.add(4)
//```
//
//أما `MutableList`:
//
//```kotlin
//val numbers = mutableListOf(1,2,3)
//
//numbers.add(4)
//
//println(numbers)
//```
//
//الناتج
//
//```
//[1, 2, 3, 4]
//```
//
//---
//
//# إنشاء MutableList
//
//## 1- mutableListOf()
//
//```kotlin
//val names = mutableListOf(
//    "Ali",
//    "Sara",
//    "Mariam"
//)
//```
//
//---
//
//## 2- تحديد النوع
//
//```kotlin
//val names: MutableList<String> =
//    mutableListOf()
//```
//
//---
//
//## 3- قائمة فارغة
//
//```kotlin
//val numbers = mutableListOf<Int>()
//```
//
//---
//
//# الوصول للعناصر
//
//```kotlin
//val names = mutableListOf(
//    "Ali",
//    "Sara",
//    "Mariam"
//)
//
//println(names[0])
//```
//
//```
//Ali
//```
//
//---
//
//أو
//
//```kotlin
//println(names.get(0))
//```
//
//---
//
//# تعديل عنصر
//
//```kotlin
//names[0] = "Ahmed"
//```
//
//أو
//
//```kotlin
//names.set(0, "Ahmed")
//```
//
//الناتج
//
//```
//[Ahmed, Sara, Mariam]
//```
//
//---
//
//# معرفة الحجم
//
//```kotlin
//println(names.size)
//```
//
//```
//3
//```
//
//---
//
//# أهم Functions في MutableList
//
//---
//
//# 1. add()
//
//إضافة عنصر في النهاية.
//
//```kotlin
//val numbers = mutableListOf(1,2,3)
//
//numbers.add(4)
//
//println(numbers)
//```
//
//```
//[1,2,3,4]
//```
//
//---
//
//# 2. add(index, element)
//
//إضافة عنصر في مكان معين.
//
//```kotlin
//numbers.add(1,100)
//```
//
//قبل
//
//```
//[1,2,3]
//```
//
//بعد
//
//```
//[1,100,2,3]
//```
//
//---
//
//# 3. addAll()
//
//إضافة List كاملة.
//
//```kotlin
//val first = mutableListOf(1,2)
//
//val second = listOf(3,4)
//
//first.addAll(second)
//
//println(first)
//```
//
//```
//[1,2,3,4]
//```
//
//---
//
//# 4. remove()
//
//يحذف أول عنصر يساوي القيمة.
//
//```kotlin
//val numbers = mutableListOf(1,2,3)
//
//numbers.remove(2)
//
//println(numbers)
//```
//
//```
//[1,3]
//```
//
//---
//
//# 5. removeAt()
//
//يحذف حسب الـ Index.
//
//```kotlin
//numbers.removeAt(0)
//```
//
//قبل
//
//```
//[1,2,3]
//```
//
//بعد
//
//```
//[2,3]
//```
//
//---
//
//# 6. removeAll()
//
//يحذف مجموعة عناصر.
//
//```kotlin
//val numbers =
//    mutableListOf(1,2,3,4,5)
//
//numbers.removeAll(listOf(2,4))
//
//println(numbers)
//```
//
//```
//[1,3,5]
//```
//
//---
//
//# 7. clear()
//
//يحذف كل العناصر.
//
//```kotlin
//numbers.clear()
//
//println(numbers)
//```
//
//```
//[]
//```
//
//---
//
//# 8. contains()
//
//هل العنصر موجود؟
//
//```kotlin
//println(numbers.contains(2))
//```
//
//```
//true
//```
//
//---
//
//أو
//
//```kotlin
//println(2 in numbers)
//```
//
//---
//
//# 9. containsAll()
//
//```kotlin
//numbers.containsAll(listOf(1,2))
//```
//
//---
//
//# 10. indexOf()
//
//يعيد أول Index.
//
//```kotlin
//val names =
//    mutableListOf(
//        "Ali",
//        "Sara",
//        "Ali"
//    )
//
//println(names.indexOf("Ali"))
//```
//
//```
//0
//```
//
//---
//
//# 11. lastIndexOf()
//
//```kotlin
//println(names.lastIndexOf("Ali"))
//```
//
//```
//2
//```
//
//---
//
//# 12. isEmpty()
//
//```kotlin
//println(numbers.isEmpty())
//```
//
//---
//
//# 13. isNotEmpty()
//
//```kotlin
//println(numbers.isNotEmpty())
//```
//
//---
//
//# 14. first()
//
//```kotlin
//println(numbers.first())
//```
//
//```
//1
//```
//
//---
//
//# 15. last()
//
//```kotlin
//println(numbers.last())
//```
//
//```
//5
//```
//
//---
//
//# 16. firstOrNull()
//
//إذا كانت القائمة فارغة يرجع `null` بدلًا من رمي استثناء.
//
//```kotlin
//val list = mutableListOf<Int>()
//
//println(list.firstOrNull())
//```
//
//```
//null
//```
//
//---
//
//# 17. lastOrNull()
//
//```kotlin
//println(list.lastOrNull())
//```
//
//---
//
//# 18. get()
//
//```kotlin
//println(numbers.get(1))
//```
//
//---
//
//# 19. set()
//
//```kotlin
//numbers.set(1,100)
//```
//
//---
//
//# 20. subList()
//
//جزء من القائمة.
//
//```kotlin
//val numbers =
//    mutableListOf(1,2,3,4,5)
//
//println(numbers.subList(1,4))
//```
//
//```
//[2,3,4]
//```
//
//> يبدأ من `fromIndex` ويستثني `toIndex`.
//
//---
//
//# 21. sort()
//
//ترتيب تصاعدي.
//
//```kotlin
//val numbers =
//    mutableListOf(5,2,8,1)
//
//numbers.sort()
//
//println(numbers)
//```
//
//```
//[1,2,5,8]
//```
//
//---
//
//# 22. sortDescending()
//
//```kotlin
//numbers.sortDescending()
//```
//
//```
//[8,5,2,1]
//```
//
//---
//
//# 23. reverse()
//
//يعكس الترتيب الحالي.
//
//```kotlin
//numbers.reverse()
//```
//
//---
//
//# 24. shuffle()
//
//ترتيب عشوائي.
//
//```kotlin
//numbers.shuffle()
//```
//
//---
//
//# 25. fill()
//
//استبدال جميع العناصر بنفس القيمة.
//
//```kotlin
//val numbers =
//    MutableList(5){0}
//
//numbers.fill(100)
//
//println(numbers)
//```
//
//```
//[100,100,100,100,100]
//```
//
//---
//
//# 26. retainAll()
//
//يبقي عناصر معينة فقط.
//
//```kotlin
//val numbers =
//    mutableListOf(1,2,3,4,5)
//
//numbers.retainAll(listOf(2,3))
//
//println(numbers)
//```
//
//```
//[2,3]
//```
//
//---
//
//# 27. iterator()
//
//```kotlin
//val iterator = numbers.iterator()
//
//while(iterator.hasNext()){
//
//    println(iterator.next())
//
//}
//```
//
//---
//
//# أشهر Extension Functions على List و MutableList
//
//هذه الدوال لا تُعدّ جزءًا من `MutableList` نفسها، لكنها **Extension Functions** من مكتبة Kotlin القياسية وتُستخدم معها باستمرار.
//
//### filter()
//
//```kotlin
//val numbers = mutableListOf(1,2,3,4,5)
//
//val even = numbers.filter { it % 2 == 0 }
//
//println(even)
//```
//
//```
//[2,4]
//```
//
//---
//
//### map()
//
//```kotlin
//val result =
//    numbers.map { it * 2 }
//
//println(result)
//```
//
//```
//[2,4,6,8,10]
//```
//
//---
//
//### forEach()
//
//```kotlin
//numbers.forEach {
//
//    println(it)
//
//}
//```
//
//---
//
//### any()
//
//```kotlin
//numbers.any {
//
//    it > 3
//
//}
//```
//
//```
//true
//```
//
//---
//
//### all()
//
//```kotlin
//numbers.all {
//
//    it > 0
//
//}
//```
//
//---
//
//### count()
//
//```kotlin
//numbers.count()
//```
//
//---
//
//### sum()
//
//```kotlin
//numbers.sum()
//```
//
//---
//
//### maxOrNull()
//
//```kotlin
//numbers.maxOrNull()
//```
//
//---
//
//### minOrNull()
//
//```kotlin
//numbers.minOrNull()
//```
//
//---
//
//### distinct()
//
//يحذف العناصر المكررة.
//
//```kotlin
//val list =
//    mutableListOf(1,2,2,3,3)
//
//println(list.distinct())
//```
//
//```
//[1,2,3]
//```
//
//---
//
//### sorted()
//
//يعيد **List جديدة مرتبة** دون تعديل الأصل.
//
//```kotlin
//val sorted = numbers.sorted()
//```
//
//---
//
//### reversed()
//
//يعيد **نسخة معكوسة** دون تعديل الأصل.
//
//```kotlin
//val reversed = numbers.reversed()
//```
//
//---
//
//# الفرق بين sort() و sorted()
//
//```kotlin
//val list = mutableListOf(5, 3, 1)
//```
//
//| الدالة     | تعدّل القائمة الأصلية؟ | القيمة المرجعة |
//| ---------- | ---------------------- | -------------- |
//| `sort()`   | ✅ نعم                  | `Unit`         |
//| `sorted()` | ❌ لا                   | `List` جديدة   |
//
//مثال:
//
//```kotlin
//list.sort()
//println(list) // [1, 3, 5]
//
//val newList = list.sortedDescending()
//println(newList) // [5, 3, 1]
//println(list)    // [1, 3, 5]
//```
//
//---
//
//# ملخص أهم الدوال
//
//| الدالة                            | الوظيفة                              |
//| --------------------------------- | ------------------------------------ |
//| `add()`                           | إضافة عنصر                           |
//| `add(index, element)`             | إضافة في مكان محدد                   |
//| `addAll()`                        | إضافة مجموعة عناصر                   |
//| `remove()`                        | حذف حسب القيمة                       |
//| `removeAt()`                      | حذف حسب الفهرس                       |
//| `removeAll()`                     | حذف مجموعة قيم                       |
//| `retainAll()`                     | الاحتفاظ بعناصر معينة فقط            |
//| `clear()`                         | حذف جميع العناصر                     |
//| `get()` / `[]`                    | قراءة عنصر                           |
//| `set()` / `[]=`                   | تعديل عنصر                           |
//| `contains()`                      | التحقق من وجود عنصر                  |
//| `indexOf()`                       | أول فهرس للعنصر                      |
//| `lastIndexOf()`                   | آخر فهرس للعنصر                      |
//| `first()` / `last()`              | أول وآخر عنصر                        |
//| `firstOrNull()` / `lastOrNull()`  | أول/آخر عنصر أو `null`               |
//| `isEmpty()` / `isNotEmpty()`      | التحقق من الفراغ                     |
//| `subList()`                       | الحصول على جزء من القائمة            |
//| `sort()` / `sortDescending()`     | ترتيب القائمة نفسها                  |
//| `sorted()` / `sortedDescending()` | إنشاء قائمة مرتبة جديدة              |
//| `reverse()` / `reversed()`        | عكس الترتيب (مع أو بدون تعديل الأصل) |
//| `shuffle()`                       | ترتيب عشوائي                         |
//| `fill()`                          | ملء القائمة بقيمة واحدة              |
//| `filter()`                        | تصفية العناصر                        |
//| `map()`                           | تحويل العناصر                        |
//| `forEach()`                       | تنفيذ عملية على كل عنصر              |
//| `any()` / `all()`                 | التحقق من شرط                        |
//| `count()`                         | عدد العناصر                          |
//| `sum()`                           | مجموع العناصر الرقمية                |
//| `maxOrNull()` / `minOrNull()`     | أكبر/أصغر عنصر                       |
//| `distinct()`                      | إزالة التكرارات                      |
//
//> **ملاحظة:** دوال مثل `filter`, `map`, `sorted`, و`distinct` هي **Extension Functions** متاحة لكل من `List` و`MutableList`، وليست أعضاء (Member Functions) داخل `MutableList` نفسها، لكنها تُستخدم معها بشكل شائع جدًا.
var teachers=mutableListOf<Int>(1,2,3);