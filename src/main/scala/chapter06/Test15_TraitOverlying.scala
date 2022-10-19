package chapter06

/**
 * 钻石特质叠加
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    /*var student15 = new Student15()
    student15.increase()*/

    //钻石问题叠加
    val myBall = new MyBall()
    println(myBall.describ())
  }
}
trait Ball {
  def describ ():String = "ball"
}
trait ColorBall extends Ball {
  var color = "red"
  override def describ(): String = color+"-"+super.describ()
}
trait CatogryBall extends Ball {
  var catogry = "foot"
  override def describ(): String = catogry+"-"+super.describ()
}
class MyBall extends CatogryBall with ColorBall {
  override def describ(): String ="My ball is a " + super[CatogryBall].describ()
}

trait Knowlege15 {
  var amount : Int = 0
  def increase(): Unit ={
    println("Knowlege15  increase")
  }
}
trait Talent15 {
  def singing()
  def dance()
  def increase(): Unit ={
    println("Talent15  increase")
  }
}
class Student15 extends Person13 with Talent15 with Knowlege15 {
  override def singing(): Unit = {
    println("Student15  singing")
  }

  override def dance(): Unit = {
    println("Student15  dance")
  }

  override def increase(): Unit = super.increase()
}

