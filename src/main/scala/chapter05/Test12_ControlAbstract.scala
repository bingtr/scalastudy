package chapter05

/**
 * 抽象控制
 */
object Test12_ControlAbstract {
  def main(args: Array[String]): Unit = {
    func0(func1())
    println("=============================");
    func2(func1())
  }
  //值调用
  def func0(a:Int) = {
    println("传入了"+a);
    println("传入了"+a);
  }
  def func1():Int = {
    println("调用了func1");
    23
  }

  /**
   * 传名参数，传递的不再是具体的值，而是代码块
   * @param a
   */
  def func2(a: => Int)={
    println("执行了"+a);
    println("执行了"+a);
  }
}
