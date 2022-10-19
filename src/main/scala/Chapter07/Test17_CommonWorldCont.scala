package Chapter07

/**
 * 案例：字符串strList句子进行分词，统计前三个出现次数最多的单词
 * 简单实现
 */
object Test17_CommonWorldCont {
  def main(args: Array[String]): Unit = {
    val strList = List("hello","hello pepole","ni hao","ni hen piao liang","hello man")
    val worldSplitList = strList.flatMap(_.split(" "))
    println(worldSplitList)

    val Student14List = worldSplitList.groupBy(word => word)
    val group = Student14List.map(kv => (kv._1,kv._2.size))
    println(group)

    /*println(group.toList.sortWith((a:Tuple2[String,Int],b:Tuple2[String,Int])=>{
      if (a._2 > b._2)
        true
      else
        false
    }))*/
    println(group.toList.sortWith(
      _._2 > _._2).take(3))

    //    println(group.toList.sortWith(_._2>_._2))
  }
}
