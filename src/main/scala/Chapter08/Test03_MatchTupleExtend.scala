package Chapter08

/**
 * 模式匹配元组扩展
 */
object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    //1. 在变量声明时匹配
    val (x,y) = ("age",10)
    println(s"$x $y")

    val List(first,second,_*) = List(12,34,232,123,12)
    println(s"$first $second")

    val a :: b :: c = List(12,34,232,123,12)
    println(s"$a $b $c")


    //2. for推导式中匹配
    println("---------------------2. for推导式中匹配---------------------")
    val list1 = List(("a",5),("b",12),("e",12),("d",56),("b",88),("c",19))

    //2.1 原遍历方式
    for (elem <- list1){
      println(elem._1+" "+elem._2)
    }

    //2.2 将list元素直接定义为元组，对变量赋值
    println("---------------------2.2---------------------")
    for ((a,b) <- list1){
      println(a+" "+b)
    }
    //2.3 可以不考虑某个位置上的变量，只遍历Key或者value
    println("---------------------2.3---------------------")
    for ((a,_)<-list1){
      println(a)
    }

    //2.4 可以指定某个位置的值必须时多少
    println("---------------------2.4---------------------")
    for (("b",b)<-list1){
      println(b)
    }

  }
}
