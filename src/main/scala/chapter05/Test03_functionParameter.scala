package chapter05

object Test03_functionParameter {
  def main(args: Array[String]): Unit = {
    //可变参数
    def f1(str:String*) : Unit = {
      println(str)
    }
    f1("s1","s2","s3","s4")

    //多个参数，且包含可变参数的函数，可变参数放在最后
    def f2(str1:String,str:String*) : Unit = {
      println(str1,str)
    }
    f2("s1","s2","s3","s4")

    //默认参数
    def f3(str:String = "xiaohua"):Unit ={
      println(str)
    }
    f3()

    //默认参数+无默认值的参数
    def f4(name:String = "dahei",age:Int):Unit = {
      print(s"${age}岁的${name}同学学习大数据")
    }
    f4(age=15)
  }
}
