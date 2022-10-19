package chapter06

import scala.beans.BeanProperty

object Test03_Class {
  def main(args: Array[String]): Unit = {
    //创建一个类的对象
    var student = new Student;
    println(student.age)
    println(student.getAge)
    student.sex = "male"
    student.setNameCn("李刚")
    println(student.sex+"  "+student.getNameCn)
  }
}

/**
 * 定义一个类，默认为public，但不能指定public
 */
class Student{
  //定义类的属性
  private var name = "alice"

  @BeanProperty
  val age = 10;//@BeanProperty 类似lombook，编译时自动生成getter和setter方法

  var sex:String = _//定义变量sex，_表示初始值为null
  @BeanProperty
  var nameCn:String = _

}