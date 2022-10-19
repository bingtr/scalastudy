package chapter06

/**
 * 匿名子类
 */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    val person = new Person10 {
      override var name: String = "Simons"

      override def eat(): Unit = {
        println(s"$name eat......")
      }
    }
    person.eat()
  }
}

/**
 * 定义抽象类
 */
abstract class Person10{
  var name : String
  def eat():Unit
}
