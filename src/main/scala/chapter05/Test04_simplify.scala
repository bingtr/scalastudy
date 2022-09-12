package chapter05

/**
 * 函数至简原则
 */
object Test04_simplify {
  def main(args: Array[String]): Unit = {
    //1. 可以省略return关键字，scala会使用最后一行代码作为返回值

    //2. 如果函数体只有一行代码可以省略花括号
    def f2(name:String):String = name+"您好"
    //3. 返回值如果可以推断出来，则可以省略（：和返回值类型一起省略）
    def f3(name:String) = name+"您好"
    //4. 如果有return关键字，则返回值类型不能省略

    //5. 如果明确指定函数返回值为Unit，那么函数体中return的值不起作用
    def f5(name:String): Unit ={
      return name+"您好"
    }
    //6. scala如果期望无返回值类型，则等号可以省略(可以称之为过程)
    def f6(name:String) {
      name+"您好"
    }
    print(f6("小明"))
    //7。 如果定义为无参函数，则调用的时候可以不屑小括号
    def f7():String = {
      "1024"
    }
    println(f7)

    //8. 如果函数没有参数，则声明时可以省略小括号，调用时也不能加小括号
    def f8 : String = {
      "计算机2048"
    }
    println(f8)

    //9. 如果只关心函数执行，不需要定义函数名称和关键字def，如lambda表达式、匿名函数既是如此
    (name:String)=>{
      "计算机3046"
    }
  }
}
