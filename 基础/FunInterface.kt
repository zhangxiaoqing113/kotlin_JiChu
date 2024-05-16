/**
 * 定义:只有一个抽象方法的接口被称为函数接口，或者称为单一抽象方法（SAM）接口。
 * 函数接口可以有多个非抽象成员，但只能有一个抽象成员。
 */
//在Kotlin中要声明一个函数式接口，需要使用 fun来对接口进行修饰。
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

/**
 * SAM 转换
 * 对于函数式接口，可以使用SAM转换，通过 lambda表达式使代码更加的简洁并且能够提高代码的可读性。
 * 你可以使用lambda表达式，而不是手动创建函数式接口的实现类。通过SAM转换，Kotlin 可以将 lambda表达式转换为对应的函数式接口的实现。
 */

//如果你不使用SAM转换，你需要写像下面这样的代码：

val isEven = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}
//使用Kotlin的SAM转换，实例化IntPredicate 你可以通过下面的代码等价替换上面的代码：
val isEven2=IntPredicate { it%2==0 }

/*其实这种转换可以 跟lambda表达式联系起来  IntPredicate { it%2==0 }
* { it%2==0 }可以看成是 accept函数的方法体.
*
* 然后拿着对象调用该函数  isEven2.accept(7)
* */

fun main() {
    println("7 is even? - ${isEven2.accept(7)}")
}