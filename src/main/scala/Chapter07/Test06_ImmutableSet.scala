package Chapter07

/**
 * 不可变Set:无序，不重复
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    println("--------------1. 创建Set--------------")
    //1. 创建Set
    val set1 = Set(1,3,2,3)
    println(set1)

    println("--------------2. 添加元素--------------")
    //2. 添加元素
    val set2 = set1.+(20)//也可写成：set1 +120
    println(set2)

    println("--------------3. 合并set--------------")
    //3. 合并set
    val set3 = Set(5,3,9,8)
    val set4 = set3 ++ set1
    println(set4)

    //4. 删除元素
    println("--------------4. 删除元素--------------")
    val set5 = set4 - 3
    println(set5)
  }
}
