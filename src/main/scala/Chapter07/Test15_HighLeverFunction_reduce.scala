package Chapter07

/**
 * 集合计算简单函数
 */
object Test15_HighLeverFunction_reduce {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4)
    //1. reduce规约：容器内元素两两运算，将其“规约”为一个值
    println(list1.reduce(_+_))
    println(list1.reduceLeft((a:Int,b:Int)=>{
      a+b
    }))
    println(list1.reduceRight(_+_))

    println(list1.reduce(_-_))//1-2-3-4=-8
    println(list1.reduceRight(_-_))//1-(2-(3-4))=-2

    //2. fold折叠，比reduce多了一个初始值
    println(list1.fold(10)(_+_))
    println(list1.fold(10)(_-_))//此处等于foldLeft
    println(list1.foldLeft(10)(_-_))
    println(list1.foldRight(10)(_-_))//1-(2-(3-(4-10))) =8

  }
}
