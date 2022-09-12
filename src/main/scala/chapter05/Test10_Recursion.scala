package chapter05

object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    //递归调用
    println(recursionMultiFunc(4))
    println(recursionAddFunc(5))
  }
  //递归1
  def recursionMultiFunc(n:Int):Int={
    if (n==0)
      1
    else
      recursionMultiFunc(n-1)*n
  }
  //递归2
  def recursionAddFunc(n:Int):Int={
    if (n<=0)
      0
    else
      recursionAddFunc(n-2)+n
  }

}
