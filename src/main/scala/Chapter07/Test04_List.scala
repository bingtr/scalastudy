package Chapter07

import scala.::

/**
 * seq类型：列表，list不可变列表
 */
object Test04_List {
  def main(args: Array[String]): Unit = {
    //1. 创建一个List
    println("---------1. 创建一个List----------")
    val list1 = List(11,12,13)
    println(list1)

    val list5 = Nil.::()//创建一个空列表
    println(list5)
    val list6 = 32 ::Nil
    println(list6)
    val list7 = 1 :: 2 :: 3 :: Nil//列表从右往左，依次在列表的最前面添加元素
    println(list7)

    //列表合并
    val list8 = list6 :: list7

    val list9 = list6 ::: list7//或者可以用list9 = list6 ++ list7
    println(list9)

    val list10 = List(11,9,12,13)
    //从左往右丢弃元素直到dropWhile不成立时停止，返回剩下的列表
    val list11 =list10.dropWhile(_ > 10)
    println(list11)

    //2. 访问遍历list
    println("---------2. 访问遍历list----------")
    //获取某一个索引的元素
    println(list1(1))
    //不可修改一个list元素的值
    //list1(1) = 23 报错

    //循环遍历list
    println("---------循环遍历list----------")
    list1.foreach(println)

    //3. 添加元素
    println("---------3. 添加元素----------")
    val list2 = 10 +: list1//在list1前面添加元素
    println(list2)
    val list3 = list1 :+ 20 //在list1后面添加元素
    println(list3)



  }
}
