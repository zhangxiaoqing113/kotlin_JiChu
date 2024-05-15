/**
 * Lambda 表达式 定义: var 变量名={参数名:参数类型,参数名:参数类型->返回值}
 *                   var sum={x:Int,y:Int->Int}
 *
 * 当lambda表达式作为 方法的形参时写为  变量名:(参数名:参数类型,参数名:参数类型)->返回值类型
 * fun test(x: Int, y: Int, block: (a: Int, b: Int) -> Int): Unit {}
 */




/**
  * 当lamda当作参数传递时, testppp(1,2,{x,y->x+y})
 *  传参 {x,y->x+y}  可以看作为 block: (a: Int, b: Int) -> Int的方法体
 *  形参 block: (a: Int, b: Int) -> Int 和 传参  {x,y->x+y}  在一块可以看成 组成了一个方法
 *
 *  fun ppp(a: Int, b: Int) -> Int{
 *     //return x,y->x+y
 *     return a+b;
 *    }
 *
 *
 *  传参这里做一个参数说明 {x,y->x+y}  其实里边叫 x y m n b d g c v任何变量名都行
 *  只是对形参 block: (a: Int, b: Int) a,b换了个名字叫而已,
 *  最重要的是后边的函数体 x+y
 *
 *
 */
fun testppp(x: Int, y: Int, block: (a: Int, b: Int) -> Int) {
    var result = block(x, y)
    println("result=$result")
}






fun main() {
    var sum = { x: Int, y: Int -> Int }
    var result = sub(5, 2)
    println("result=$result")

    //test(1,2){x,y->x+y}
    //test(1,2,{x,y->x+y})
    //错误 lambda表达式 只能传参数 不能传具体的值
    //test(1,2,{3,5->3+5})




}






//kotlin有出色的推到机制, 函数体只有一行时, 大括号{} 返回值可以不用写

/*fun  add(x:Int,y:Int):Int{
    return x+y
}*/

fun add(x: Int, y: Int): Int = x + y
fun sub(x: Int, y: Int) = x - y
fun printInformation(name: String, age: Int) = println("name= $name,age=$age")
//当lambda表达式作为 方法的形参时写为  变量名:(参数名:参数类型,参数名:参数类型)->返回值类型
fun test(x: Int, y: Int, block: (a: Int, b: Int) -> Int) {
    var result = block(x, y)
    println("result=$result")
}



