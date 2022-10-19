package Chapter07

import scala.collection.mutable.ListBuffer

/**
 * seq类型：列表，listBuffer可变列表
 */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    //1. 创建可变列表
    println("--------------1. 创建可变列表--------------")
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(12,23,34)
    println(list1)
    println(list2)

    //2. 添加元素
    println("--------------2. 添加元素--------------")
    list1.append(12,34)
    list2.append(90)

    list1.insert(1,19,39)
    println(list1)
    println(list2)

    list1 += 12 +=23
    78 +=: 35 +=: list2
    println(list1)
    println(list2)

    78 +=: 35 +=: list1 += 12 +=23
    println(list1)
    //3. 合并listBuffer
    println("--------------3. 合并listBuffer--------------")
    val list3 = list1 ++ list2
    println("list1："+list1)
    println("list2："+list2)
    println("list3："+list3)

    list1 ++= list2//++=表示list1合并list2，覆盖list1，此次计算不创建新的对象
    println("list1："+list1)

    list1 ++=: list2//++=:表示（冒号向右，表示时list2调用此方法）list2合并list1，覆盖list2，此次计算不创建新的对象
    println("list2："+list2)

    //4. 修改元素
    println("--------------4. 修改元素--------------")
    list2(2)=3
    list2.update(3,1)
    println(list2)

    //5. 删除元素
    println("--------------5. 删除元素--------------")
    list2.remove(2)
    println(list2)

    list2 -= 90//删除90这个元素
    println(list2)

    list2.remove(2,3)//从第二个元素删除3个
    println(list2)


  }
}
