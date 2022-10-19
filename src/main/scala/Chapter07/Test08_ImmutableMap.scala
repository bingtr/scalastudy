package Chapter07

/**
 * 不可变Map
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //1. 创建Map
    val map1 = Map("a"->13,"b" -> 28)
    println(map1)
    println(map1.getClass)

    //2. 遍历元素
    map1.foreach(println)
    //元组类型kv:(String,Int)
    map1.foreach((kv:(String,Int))=>println(kv))

    //3. 取Map中所有的key和values
    for(key <- map1.keySet){
      println(s"$key   ${map1.get(key)}")
    }
    for(key <- map1.keys){
      println(s"$key   ${map1.get(key)}")
    }

    //4. 访问某一key里的值
    println(map1.get("a").get)//可简写成：map1(a)
    println(map1.getOrElse("d",0))
  }
}
