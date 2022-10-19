package chapter06

/**
 * 饿汉单例
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    var student1 = Student12.getInstance()
    student1.printInfo()
    var student2 = Student12.getInstance()
    student2.printInfo()

    println(student1)
    println(student2)
  }
}
/**
 * 定义类
 * @param name
 * @param age
 */
class Student12 private(val name:String,val age:Int){
  def printInfo()={
    println(s"Student12: $name $age ${Student11.school}")//伴生类中可以直接调用伴生对象的方法
  }
}

/**
 * 懒汉单例
 */
object Student12{
  private var student : Student12 = _
  def getInstance():Student12 = {
    if(student==null){
      student = new Student12("Alice",18)
    }
    student
  }
}
/**
 * 饿汉单例
 */
/*
object Student12{
  private val student = new Student12("Alice",18)
  def getInstance():Student12 = student
}*/
