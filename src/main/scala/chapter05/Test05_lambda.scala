package chapter05

/**
 * 匿名函数
 */
object Test05_lambda {
  def main(args: Array[String]): Unit = {
    var addFun = (a:Int,b:Int)=>{a+b}
    var addFun1 = (a:Int,b:Int)=>{a+b}
    var minFun = (a:Int,b:Int)=>{a-b}

    def f(func : (Int,Int) => Int):Int = {
      func(1,2)
    }

    //简化写法
    println(f(addFun))
    println(f((a:Int,b:Int)=>{a-b}))//直接写匿名函数
    println(f((a,b)=>a-b))//由于在f方法中已经定义了参数类型和返回值，则此处参数不需要写类型
    println(f(_-_))//两个参数可以用_表示形参
  }
}
