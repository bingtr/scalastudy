package Chapter07

object Test03_MultiArray {
  def main(args: Array[String]): Unit = {
    //创建两行三列的二维数组
    var multiArray = Array.ofDim[Int](2,3)
    // 赋值
    multiArray(0)(0) = 100
    multiArray(0)(1) = 101
    multiArray(0)(2) = 102

    multiArray(1)(0) = 110
    multiArray(1)(1) = 111
    multiArray(1)(2) = 112

    //输出元素
    for (i <- multiArray.indices; j<-multiArray(i).indices){
      print(multiArray(i)(j)+"\t")
      if((j+1) == multiArray(i).length){
        println()
      }
    }
  }
}
