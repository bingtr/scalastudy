package Chapter07

/**
 * 集合计算简单函数
 */
object Test14_HighLeverFunction {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,3,8,89,7,8,2)
    val list2 = List(("a",5),("b",12),("e",12),("d",56),("c",19))

    //1. 过滤
    println("--------------------1. 过滤--------------------")
    //例子：过滤取偶数
    println(list1.filter(_ % 2 ==0))

    //2. map映射
    println("--------------------2. map映射--------------------")
    //例子：把集合中每个数乘以二
    println(list1.map(_*2))
    println(list1.map {_*2})

    //3. 扁平化
    println("--------------------3. 扁平化--------------------")
    val nestedlist = List(List(1,3,8),List(89,7),List(8,2))
    println(nestedlist.flatten)

    //4. 扁平映射
    println("--------------------4. 扁平映射--------------------")
    //例子：将一组字符串分词，并保存单词列表
    val stringlist = List("hello world","ni hao","ok bye","thank you")
    println(stringlist.flatMap(_.split(" ")))

    //5. 分组group by
    println("--------------------5. 分组group by--------------------")
    //例子：分成奇数组、偶数组，根据函数：_%2分组
    println(list1.groupBy(_%2))

  }
}
