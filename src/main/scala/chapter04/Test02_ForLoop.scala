package chapter04

import scala.util.control.Breaks

/**
 * for循环
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    //for循环遍历1到10，10次
    for (i <- 1 to(10)){
      //println(i)
    }
    //for循环遍历,不包含边界10
    for (m <- 1.until(10)){
      //println(m)
    }
    //for循环遍历
    val k = 10;
    for (m <- 1.to(k)){
      //println(m)
    }

    //for循环守卫
    for (i<-1 to 10 if i==5 || i==8){
      println(i)
    }
    //循环步长
    for (i <- 1 to 10 by 2){
      println(i)
    }
    for (i <- 1 to 10 reverse){
      println(i)
    }
    for (i <- 10 to 1 by -2){
      println(i)
    }

    //嵌套循环
    for (i <- 1 to 4;j <- 1 to 5){
      println(i+"     "+j)
    }

    //9x9乘法表
    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(s"$i x $j = ${i * j} \t")
      }
      println();
    }

    //9x9乘法表
    for (i <- 1 to 9;j <- 1 to i){
      print(s"$i x $j = ${i * j} \t")
      if (i == j){
        println();
      }
    }

    //循环引入变量
    for {i <- 1 to 9
         j <- 1 to i}{
      print(s"$i x $j = ${i * j} \t")
      if (i == j){
        println();
      }
    }
    //for循环集合返回值类型
    var b = for (i <- 1 to 9) yield i;
    println(b);

    //退出循环
    Breaks.breakable(for(i <- 1 to 10){
      if (i > 5)
      Breaks.break();
      print(i+" \t");
    })
  }
}
