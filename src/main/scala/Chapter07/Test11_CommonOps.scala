package Chapter07

/**
 * 集合常用方法
 */
object Test11_CommonOps {
  def main(args: Array[String]): Unit = {
    val list = List(1,3,8,65,7,8)
    val set = Set(4,265,675,33,4)

    //1. 获取集合长度
    println("--------------------1. 获取集合长度--------------------")
    println(list.length)//线性序列才有此方法

    //2. 获取集合大小
    println("--------------------2. 获取集合大小--------------------")
    println(list.size)
    println(set.size)

    //3. 循环遍历
    println("--------------------3. 循环遍历--------------------")
    for (elem <- list){
      println(elem)
    }

    set.foreach(println(_))

    //4. 迭代器
    println("--------------------4. 迭代器--------------------")
    for (elem <- list.iterator){
      println(elem)
    }
    //5. 生成字符串
    println("--------------------5. 生成字符串--------------------")
    println(list)
    println(set)
    println(list.mkString("-"))

    //6. 是否包含
    println("--------------------6. 是否包含--------------------")
    println(list.contains(8))
    println(set.contains(8))
  }
}
