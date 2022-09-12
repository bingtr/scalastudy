package chapter05

import scala.annotation.tailrec

object Test11_TailRecursion {
  def main(args: Array[String]): Unit = {
    println(tailFunc(5))
  }
  //尾递归形式
  def tailFunc(n:Int):Int={
    @tailrec
    def loop(n:Int,currentResult:Int):Int={//定义currentResult保存每次递归循环计算的结果
      if(n==0)
        return currentResult//递归调用循环结束点
      else
        return loop(n-1,currentResult*n)//尾递归：调用放在尾部
    }
    loop(n,1)//调用点
  }
}
