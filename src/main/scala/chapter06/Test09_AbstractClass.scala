package chapter06

object  Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    var student = new Student9();
    student.sleep()

    var student2 = new Student9();
    student2.eat()
  }
}
abstract class Person9 {
  //非抽象属性
  val name : String = "person"
  //非抽象属性
  var sex : String = "male"

  //抽象属性
  var age : Int = 1
  //抽象属性
  var heigh : Int

  //非抽象方法
  def eat()={
    println("person eat")
  }
  //抽象方法
  def sleep():Unit

}

/**
 * 抽象类子类
 */
class Student9 extends Person9{
  override val name : String = "Student"
//  override var age: Int = 12

  override var heigh: Int = 22
//  override var sex : String = "female"
  override def sleep(): Unit = {
    println("Student sleep")
  }


}
