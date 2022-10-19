package Chapter07

import scala.collection.mutable

/**
 * 可变Map
 */
object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    //1. 创建Map
    val map1 = mutable.Map("a"->13,"b" -> 28)
    println(map1)
    println(map1.getClass)

    //2. 添加元素
    map1.put("c",29)
    map1 += (("e",39))
    println(map1)

    //3. 删除元素
    println(map1("c"))
    map1.remove("c")
    println(map1.getOrElse("c",0))

    map1 -= "e"
    println(map1)

    //4. 修改元素
    map1.update("c",99)
    map1.update("e",78)
    println(map1)


    //5. 合并Map，可变合并不可变Map
    val map2 = Map("aaa"->13,"b" -> 38)
    map1 ++= map2//map2 覆盖map1的值，map1中没有的值新增进去。
    println(map1)

    /*val map3 = map1 ++ map2
    println(map3)*/

    val map4 = mutable.Map("aaa"->1,"b" -> 3)
    map4 ++= map1//map1 覆盖map4的值，map4中没有的值新增进去。
    println(map4)
  }
}
