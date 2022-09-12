package chapter05

object Test09_ClouseAndCurrying {
  def main(args: Array[String]): Unit = {
    //闭包
    def funcA (a:Int):Int=>Int={
      def funcB(b:Int):Int={
        a+b
      }
      funcB
    }
    //闭包调用
    println(funcA(1)(2))

    //闭包简写
    def funcA1 (a:Int):Int=>Int={
      b=>a+b
    }
    def funcA2 (a:Int):Int=>Int=a+_

  }
}
