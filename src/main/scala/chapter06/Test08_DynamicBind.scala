package chapter06

/**
 * 动态绑定
 */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    var student = new Student8()
    student.hello()
  }
}

/**
 * 定义父类
 */
class Person8{
  val name:String = "Person"
  def hello(): Unit ={
    println("hello person")
  }
}
/**
 * 定义子类
 */
class Student8 extends Person8 {
  override val name:String = "Student"
  override def hello(): Unit ={
    println(s"hi Student $name")
  }
}
