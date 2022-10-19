package chapter06

/**
 * 构造器参数
 */
object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    var student3 = new Student3("xiaohua",18)
  }
}

class Student2(){
  var name:String = _
  var age:Int = _
}

/**
 *
 * @param name var修饰了name,则name为Student3的属性
 * @param age var修饰了age,则age为Student3的属性
 */
class Student3(var name:String ,var age:Int){

}
/**
 *
 * @param name val修饰了name,则name为Student3的属性，但属性一旦赋值则值不可再改变
 * @param age val修饰了age,则age为Student3的属性，但属性一旦赋值则值不可再改变
 */
class Student4(val name:String ,val age:Int){

}
/**
 *
 * @param name 无var修饰了name,则name为Student4的形参而非属性
 * @param age 无var修饰了age,则age为Student4的形参而非属性
 */
class Student5(name:String ,age:Int){

}