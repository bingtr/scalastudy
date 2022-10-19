package Chapter07

/**
 * 集合计算简单函数
 */
object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,3,8,89,7,8,2)
    val list2 = List(("a",5),("b",12),("e",12),("d",56),("c",19))

    //1. 求和
    println("--------------------1. 求和--------------------")
    println(list1.sum)
    println(list2.map(_._2).sum)
    //2. 求积
    println("--------------------2. 求积--------------------")
    println(list1.product)

    //3. 最大值
    println("--------------------3. 最大值--------------------")
    println(list1.max)
    println(list2.max)//各元组第一个数进行比较，取最大的数

    println(list2.maxBy((tupleParam : (String,Int))=>tupleParam._2))
    //简写
    println(list2.maxBy(_._2))

    //4. 最小值
    println("--------------------4. 最小值--------------------")
    println(list2.min)
    println(list2.minBy(_._2))

    //5. 排序
    println("--------------------5. 排序--------------------")
    //从小到达排序
    println(list1.sorted)
    println(list2.sortBy(_._2))


    //传入隐式参数，从大到小排序
    println(list1.sorted(Ordering[Int].reverse))

    println("sortWith从小到大："+list1.sortWith((a:Int,b:Int)=>{a<b}))

    println(list2.sortBy(_._2)(Ordering[Int].reverse))
    println("sortWith从大到小："+list1.sortWith((a:Int,b:Int)=>{a>b}))
    //简写：a和b的数据类型已经定了，可以省去，只有一行，可以把{}省去，a和b只出现过一次，可以用_代替参数名
    println("sortWith从大到小简写："+list1.sortWith(_>_))
  }
}
