package chapter06

object Test13_Trait {
  def main(args: Array[String]): Unit = {
    var student = new Student13()
    student.hello()
  }
}

/**
 * 定义类
 */
class Person13{
  val name : String = "person"
  var age : Int = 18
  def hello(): Unit ={
    println("hello from:" + name)
  }
}

/**
 * 特质
 */
trait Young{
  //声明抽象属性和非抽象属性
  var age:Int
  val name:String = "young"

  //定义非抽象方法
  def play(): Unit ={
    println("young person is play....")
  }

  //定义抽象方法
  def dating()
}

class Student13 extends Person13 with Young{
  //重写person 和 young里共有的属性
  override val name: String = "student"
  //实现抽象方法
  override def dating(): Unit = println(s"$age 岁的$name student is dating")
  def study(): Unit = println(s"$age 岁的$name student is study")

  //重写父类方法
  override def hello(): Unit = {
    super.hello()
    println(s"hello from: student $name")
  }
}