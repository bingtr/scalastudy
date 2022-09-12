package chapter05

object Test07_Pratice_CollectionOper {
  def main(args: Array[String]): Unit = {
    def arrayOperation(arry:Array[Int],op:Int=>Int):Array[Int]={
      for (elem <- arry) yield op(elem)
    }

    //定义函数
    val addOne = (a:Int)=>{a+1}

    //调用
    val arr:Array[Int] = Array(1,2,3,4);
    println(arrayOperation(arr,addOne))
    println(arrayOperation(Array(2,3,4,5),addOne).mkString(","))

    //传入匿名函数
    println(arrayOperation(arr,_*3).mkString("、"))
  }
}
