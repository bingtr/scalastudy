package chapter06

/**
 * 混入
 */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    var student = new Student14()
    student.study()
    student.increase()

    student.hello()
    student.increase()

    student.dating()
    student.increase()
    //===动态混入=========================
    println("========================动态混入========================")
    var studentT = new Student14() with Talent{
      override def singing(): Unit = {
        println(s"$name has talent sing")
      }

      override def dance(): Unit = {
        println(s"$name has talent dance")
      }
    }
    studentT.singing()
  }
}
trait Knowlege {
  var amount : Int = 0
  def increase()
}
trait Talent {
  def singing()
  def dance()

}
class Student14 extends Person13 with Young with Knowlege {
  //重写person 和 young里共有的属性
  override val name: String = "student14"
  //实现抽象方法
  override def dating(): Unit = println(s"$age 岁的$name student is dating")
  def study(): Unit = println(s"$age 岁的$name student is study")

  //重写父类方法
  override def hello(): Unit = {
    super.hello()
    println(s"hello from: student $name")
  }

  override def increase(): Unit = {
    amount +=1
    println(s"$name knowlege is amount 1=$amount")
  }
}
