package Chapter07

import scala.collection.mutable

/**
 * 可变set集合
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //1. 创建Set
    println("--------------1. 创建Set--------------")
    val set1 = mutable.Set(1,3,2,3)
    println(set1)

    //2. 添加元素
    println("--------------2. 添加元素--------------")
    set1 += 11
    println(set1.add(28))//返回是否添加成功true or false，不成功的原因只能是已存在添加的元素
    println(set1.add(28))
    println(set1)

    //3. 删除元素
    println("--------------3. 删除元素--------------")
    set1 -= 11
    println(set1)
    println(set1.remove(28))//返回是否删除成功true or false，不成功的原因只能是不存在要删除的元素
    println(set1)
    println(set1.remove(28))

    //4. 合并set
    println("--------------4. 合并set--------------")
    val set3 = mutable.Set(19,3,22,5)
    val set4 = set3 ++ set1
    println(set4)

    println("set1："+set1)
    println("set3："+set3)
    set1 ++= set3//++=表示set1合并set3，覆盖set1，此次计算不创建新的对象
    println("set1："+set1)
    println("set3："+set3)
  }
}
