package kotlin_basic

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