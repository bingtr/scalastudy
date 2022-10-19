package Chapter08

/**
 * 定义样例类
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("jack",18)
    val rs = student match {
      case Student1("jack",18) => "this is jack 18"
      case _ => "Others"
    }
    println(rs)
  }
}
//定义样例类，用case修饰，自动生成伴生对象和apply方法
case class Student1(val name:String ,val age:Int)