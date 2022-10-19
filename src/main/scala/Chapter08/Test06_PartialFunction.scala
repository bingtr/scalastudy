package Chapter08

object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list1 = List(("a",5),("b",12),("e",12),("d",56),("b",88),("c",19))
    //把list1里的tuple._2都乘以2

    //1. map实现
    val list2 = list1.map(tuple => (tuple._1,tuple._2*2))
    println(list2)

    //2. tuple模式匹配
    val list3 = list1.map(tuple => tuple match {
      case (a,b) => (a,b*2)
    })
    println(list3)

    //偏函数
    //3. 2的实现方式省去lambda表示写法，简写就是偏函数形式
    val list4 = list1.map {
      case (a,b) => (a,b*2)
    }
    println(list4)

    //偏函数的应用，求绝对值
    //对输入的数据进行不同的处理，偏函数组成在一起
    val positiveAbs:PartialFunction[Int,Int] = {
      case x if(x>0) => x
    }
    val negaitiveAbs:PartialFunction[Int,Int] = {
      case x if(x<=0) => x
    }

    def abs(x:Int):Int = (positiveAbs orElse negaitiveAbs)(x)
  }
}
