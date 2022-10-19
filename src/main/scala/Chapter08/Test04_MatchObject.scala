package Chapter08

/**
 * 类匹配
 */
object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("jacks",18)
    val rs = student match {
      case Student("jack",18) => "this is jack 18"
      case _ => "Others"
    }
    println(rs)
  }
}
//定义类
class Student(val name:String ,val age:Int)

//定义伴生对象
object Student {

  def apply(name: String, age: Int): Student = new Student(name, age)

  //必须实现拆解对象
  def unapply(arg: Student): Option[(String, Int)] = {
    if (arg == null){
      None
    }else{
      Some((arg.name,arg.age))
    }
  }
}
