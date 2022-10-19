package Chapter07


/**
 * 衍生集合
 */
object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,3,8,89,7,8,2)
    val list2 = List(23,3,9,89,51,90)

    //1. 获取集合的头
    println("--------------------1. 获取集合的头--------------------")
    println(list1.head)

    //2. 获取集合的尾（除去头剩下的所有的元素）
    println("--------------------2. 获取集合大小--------------------")
    println(list1.tail)

    //3. 集合最后一个数据
    println("--------------------3. 集合最后一个数据--------------------")
    println(list1.last)

    //4. 集合初始数据（除去最后一个元素，其他所有的元素，与之对应的是tail）
    println("--------------------4. 集合初始数据（不包含最后一个）--------------------")
    println(list2.init)

    //5. 反转
    println("--------------------5. 反转--------------------")
    println(list1.reverse)

    //6. 取前、后n个元素
    println("--------------------6. 取前、后n个元素--------------------")
    println(list2.take(3))//从左到右取前三个元素
    println(list2.takeRight(8))//从右到左取前8个元素

    //7. 去掉前、后n个元素
    println("--------------------7. 去掉前、后n个元--------------------")
    println(list1.drop(3))//从左到右取前三个元素
    println(list2.dropRight(4))//从右到左取前4个元素

    //8. 并集
    println("--------------------8. 并集--------------------")
    val union = list1.union(list2)
    val union2 = list1 ::: list2
    println(union)
    println(union2)

    //set 做并集
    val set1 = Set(1,3,8)
    val set2 = Set(23,3)
    println(set1.union(set2))
    println(set1 ++ set2)

    //9. 交集
    println("--------------------9. 交集--------------------")
    val intercetion = list1.intersect(list2)
    println(intercetion)


    //10. 差集
    println("--------------------10. 差集--------------------")
    println("list1差集："+list1.diff(list2))//list1有而list2没有的元素
    println("list2差集："+list2.diff(list1))//list2有而list1没有的元素

    //11. 拉链,两个list对应索引组成一个二元组，多余的元素抛弃
    println("--------------------11. 拉链--------------------")
    println("list1拉链："+list1.zip(list2))//list1元素在前list2元素在后
    println("list2拉链："+list2.zip(list1))//list2元素在前list1元素在后

    //12. 滑窗
    println("--------------------12. 滑窗--------------------")
    for (elem <- list1.sliding(3)){
      println(elem)
    }
    println(list1)
    for (elem <- list1.sliding(3,3)){
      println(elem)
    }
  }
}
