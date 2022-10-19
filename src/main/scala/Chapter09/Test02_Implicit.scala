package Chapter09

object Test02_Implicit {
  def main(args: Array[String]): Unit = {

    //1. 隐式函数
    implicit def convert(num:Int):MyRichInt = new MyRichInt(num)
    println(12.myMax(6))

    //2. 隐式类
    println(12.myMax2(6))

    //3. 隐式参数
    implicit val nameStu = "haha"//在同一作用域，相同类型的隐式参数只能有一个。
    def sayHello()(implicit name:String)={
      println(name)
    }

    sayHello
    sayHello()
    sayHello()("simon")

    def sayHi(implicit name:String)={
      println(name)
    }
    sayHi
    sayHi("Baden")

    def sayBaba(implicit name:String="JackJonse")={//隐式参数级别高于参数默认值
      println(name)
    }
    sayBaba

    //简便写法
    def sayGoodBay(): Unit ={
      println(">>>>"+ implicitly[String])
    }
    sayGoodBay()
  }
  //自定义类
  implicit class MyRichInt2(val self:Int){
    def myMax2(n:Int):Int =if (n<self) self else n
    def myMin2(n:Int):Int =if (n<self) n else self
  }
}
//自定义类
class MyRichInt(val self:Int){
  def myMax(n:Int):Int =if (n<self) self else n
  def myMin(n:Int):Int =if (n<self) n else self
}