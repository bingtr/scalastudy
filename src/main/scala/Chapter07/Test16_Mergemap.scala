package Chapter07

import scala.collection.mutable

object Test16_Mergemap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a"->2,"b"->4,"c"->9)
    val map2 = mutable.Map("e"->2,"d"->4,"c"->9)

    val map3 = map1.foldLeft(map2)((mergeMap,kv)=>{
      var k = kv._1
      var v = kv._2
      mergeMap(k) = mergeMap.getOrElse(k,0) + v
      mergeMap
    })

    println(map3)


    /* 源码解析：
    def foldLeft[B](z: B)(@deprecatedName('f) op: (B, A) => B): B = { //z为B类型的初始值，op方法有两个参数B类型和A类型，返回B类型
      var acc = z  // 把初始值可变map类型map2赋给acc
      var these = this //this为当前调用对象，当前为map1调用，所以this就是map1
      while (!these.isEmpty) {//如果map1不为空，则循环执行
        acc = op(acc, these.head)//循环调用传入的函数，来判断map2里是否有map1的k，v，有的花叠加，否则新增到map里。
        these = these.tail//每迭代一次把map1计算剩下的赋给these对象
      }
      acc//最终返回map2
    }*/
  }
}
