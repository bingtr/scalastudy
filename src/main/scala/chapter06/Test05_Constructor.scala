package chapter06

object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    println("-----------student 1--------------")
    var student1 = new Student1()
    println("-----------student 2--------------")
    var student2 = new Student1("小明")
    println("-----------student3--------------")
    var student3 = new Student1("Jack",18)
  }
}
class Student1{
  var name:String = _
  var age:Int = _

  println("1 调用了主构造器")

  def this(name:String){
    this()
    println("2 调用了辅助构造器")
    this.name = name;
  }
  def this(name:String,age:Int){
    this(name)
    println("3 调用了辅助构造器")
    this.age = age
  }

}
