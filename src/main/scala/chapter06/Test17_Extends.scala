package chapter06

object Test17_Extends {
  def main(args: Array[String]): Unit = {
    var student = new Student17("Alice",18)
    student.sayHi()
    student.study()
    var person : Person17 = new Student17("Jim",23)
    person.sayHi()
    var person2 = new Person17("Kate",22)

    //类型判断
    println("student is Student17 :"+student.isInstanceOf[Student17])
    println("student is Person17 :"+student.isInstanceOf[Person17])
    println("person is Student17 :"+person.isInstanceOf[Student17])
    println("person is Person17 :"+person.isInstanceOf[Person17])
    println("person is Person17 :"+person2.isInstanceOf[Student17])

    //类型转换
    if (person.isInstanceOf[Student17]){
      var newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }
    println(classOf[Student17])//运行结果：class chapter06.Student17

    //枚举类的使用
    println(WorkDay.MONDAY)
  }
}
class Person17(val name:String,val age:Int){
  def sayHi(): Unit ={
    println("say hi from person:"+name)
  }
}
class Student17(name:String,age:Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println("say hi from Student17:"+name)
  }
  def study(): Unit ={
    println("Student17 study")
  }
}

/**
 * 定义枚举类
 */
object WorkDay extends Enumeration{
  val MONDAY = Value("Monday")
  val TUESDAY = Value(2,"Tuesday")
}

/**
 * 定义应用对象
 */
object TestApp extends App{
  println("TestApp is running")
  type MyString = String
  var a : MyString = "1123"
  println("MyString is "+a)
}