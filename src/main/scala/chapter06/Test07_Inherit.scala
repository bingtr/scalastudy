package chapter06

object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    var student1 = new Student7("Alice",18)
    println("======================================")
    var student2 = new Student7("Jim",22,"NO.1231231")

    var teacher = new Teacher
    teacher.printerInfo()

    printerInfo(student1);
    def printerInfo(person: Person7): Unit ={
      person.printerInfo()
    }
  }
}

/**
 * 定义父类
 */
class Person7{
  var name : String =_
  var age : Int = _

  println("1. 父类主构造器")

  //定义子构造器
  def this(name:String ,age:Int){
    this()//调用主构造器
    println("2. 父类辅助构造器")
    this.name = "小花"
    this.age = 18
  }
  def printerInfo(): Unit ={
    println(s"Person7 $name $age")
  }
}

class Student7(name:String,age:Int) extends Person7{
  var stuNo : String = _
  println("3. 子类主构造器")

  def this(name:String,age:Int,stuNo:String){
    this(name,age)
    println("4. 子类辅助构造器")
    this.stuNo = stuNo
  }

  override def printerInfo(): Unit ={
    println(s"Student7 $name $age $stuNo")
  }
}

class Teacher extends Person7{
  override def printerInfo(): Unit ={
    println(s"Teacher=====")
  }
}