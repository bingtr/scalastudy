package chapter06

object Test04_ClassForAccess {

}

/**
 * 定义个父类
 */
class Person{
  private var idCard:String = "123456"
  protected var name:String = "Alice"
  var sex:String = "female"
  private[chapter06] var age:Int = 10

  def printInfo()={
    println(s"Person: $idCard $name $sex $age")
  }
}
