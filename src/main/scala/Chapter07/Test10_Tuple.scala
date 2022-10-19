package Chapter07

/**
 * 元组
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    //1. 创建元组
    println("--------------------1. 创建元组--------------------")
    val tuple = ("a",1,true)
    println(tuple)

    //2. 访问数据
    println("--------------------2. 访问数据--------------------")
    println(tuple._2)
    println(tuple.productElement(1))

    //3. 遍历元组数据
    println("--------------------3. 遍历元组数据--------------------")
    for (elem <- tuple.productIterator){
      println(elem)
    }

    //4. 嵌套元组
    println("--------------------4. 嵌套元组--------------------")
    val mulTuple = (12,"ac",'b',("23",19),83)
    for (elem <- mulTuple.productIterator){
      println(elem)
    }
    println(mulTuple._4._1)//获取嵌套数组的值
    println(mulTuple.getClass.getTypeName)//获取对象的数据类型
  }
}
