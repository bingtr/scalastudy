package chapter06

/**
 * 伴生类和伴生对象不分彼此，可相互访问
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
    /*var student = new Student11("jack",12)
    student.printInfo()*/
    var student2 = Student11.newStudent("jimi",23)
    student2.printInfo()

    //调用伴生对象的apply方法，对于apply方法，scala可以省去此方法明
    var student3 = Student11("simon",18)
    student3.printInfo()
  }
}
/**
 * 定义类
 * @param name
 * @param age
 */
class Student11 private(val name:String,val age:Int){
  def printInfo()={
    println(s"Student11: $name $age ${Student11.school}")//伴生类中可以直接调用伴生对象的方法
  }
}

/**
 * 伴生对象
 */
object Student11{
  var school : String = "rainya" //伴生对象里的属性或者方法，相当于java中用static修饰的属性

  def newStudent(name:String,age:Int): Student11 ={
    new Student11(name, age)
  }

  def apply(name:String,age:Int): Student11 ={
    new Student11(name, age)
  }
}
