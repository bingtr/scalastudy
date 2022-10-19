package Chapter07

/**
 * 不可变的数组
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    //1. 不可变的数组
    val arr = new Array[Int](5)
    println(arr.size)
    //   直接创建数组
    val arr2 = Array(1,2,3,4,5)
    //new Array[Int](5)和Array(5)的区别
    //new Array[Int](5)是创建长度为5的int数组
    //和Array(5)是创建一个数组长度是1，数组数据是5

    //2. 访问数组中的元素
    println(arr2(2))
    arr2(2) = 23
    println(arr2(2))
    println("--------------1）1-----------------------")
    //3. 数组遍历
    //1） for循环
    for (i <- 0 until arr2.length){
      println(arr2(i))
    }
    println("---------------1）2----------------------")
    for (i <- arr2.indices){
      println(arr2(i))
    }
    println("----------------2）---------------------")
    //2） 增强for循环，直接遍历所有元素
    for (elem <- arr2) println(elem)
    println("----------------3）---------------------")
    // 3） 迭代器
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())
    println("----------------4）---------------------")
    //4）foreach
    arr2.foreach(println(_))//或者
    arr2.foreach(println)
    println("----------------5）---------------------")
    println(arr2.mkString("-"))
    println("----------------4.1---------------------")
    //4. 添加元素
    var newArr = arr2.:+(90)//在数组最后边添加一个元素，返回信new出来的数组
    println(arr2.mkString("-"))
    println(newArr.mkString("~"))

    println("----------------4.2---------------------")
    var newArr2 = arr2.+:(90)//在数组最前边添加一个元素，返回信new出来的数组
    println(arr2.mkString("-"))
    println(newArr2.mkString("~"))

    println("----------------4.3---------------------")
    var newArr3 = arr2 :+ 90//在数组最后边添加一个元素，返回信new出来的数组
    var newArr4 = 90 +: arr2 :+ 88//在数组最前边添加一个元素,后边加一个元素，返回信new出来的数组
    println(newArr3.mkString("~"))
    println(newArr4.mkString("~"))
  }
}
