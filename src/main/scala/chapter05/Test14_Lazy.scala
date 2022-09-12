package chapter05

/**
 * 懒加载
 */
object Test14_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val rs : Int = sum(12,13)
    println("======")
    println("测试懒加载"+rs)
  }
  def sum(i: Int, i1: Int):Int={
    println("执行：sum")
    i+i1
  }
}
