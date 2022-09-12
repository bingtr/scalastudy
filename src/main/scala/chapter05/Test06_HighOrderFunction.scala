package chapter05

object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {

    def f (a:Int,b:Int):Int = {
      println("f 被调用")
      a+b
    }
    def func() = {
      println("func 被调用")
    }
    val result:Int = f(2,3);
    println(result)

    //函数作为值进行传递
    val f1 : (Int,Int) => Int = f//函数引用赋值给指定常量f1
    val f2 = f _//函数引用赋值给f2

    val f3=func _//函数引用赋值给f3
    val f4 : ()=>Unit = func//函数引用赋值给f4
    println(f2(1,2))

    //函数作为形参参数
    def f5(ops : (Int,Int)=>Int,a:Int,b:Int):Int={
      ops(a, b);
    }
    println(f5(f,2,3))

    //直接传递匿名函数
    println(f5((a,b)=>{a*b},2,3))
    println(f5(_*_,2,3))

    //函数作为函数的返回值
    def f7(a:Int): (Int,Int)=>Unit ={
      println("f7 被调用"+a)
      def f8(b:Int,e:Int)={
        println("f8 被调用"+(b+e+a))
      }
      f8
    }
    println(f7(1)(8,9))
  }
}
