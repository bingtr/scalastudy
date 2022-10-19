package Chapter07

import scala.collection.mutable.ArrayBuffer


object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    //1. 创建可变数组
    var arr1 = new ArrayBuffer[Int]()
    var arr2 = ArrayBuffer(19,22,323,64)

    println(arr2.mkString("-"))
    println(arr2.toString())
    println(arr2)

    //访问元素
    println(arr2(1))
    //修改元素
    arr2(1) = 78
    println("修改元素："+arr2)

    //追加元素
    var newArr = arr1 :+ 15//:+ 此种方式一般用在不可变数组
    println(newArr)
    println(arr1==newArr)
    println("---------------追加在最后一个位置-------------------")
    println(newArr += 15)//追加在最后一个位置，ArrayBuffer(15, 15)
    println(arr1==newArr)//arr1和newArr引用地址相同，所以他们为同一个对象


    //追加在最后一个位置
    arr2.append(8)
    arr2.append(20,202)//append添加多个
    arr2.appendAll(arr1)
    println(arr2)//运行结果：ArrayBuffer(19, 78, 323, 64, 8, 20, 202)

    println("---------------追加在第一个位置-------------------")

    //追加在第一个位置
    arr2.+=:(0)
    arr2.+=(90)
    println(arr2)//运行结果：ArrayBuffer(0, 19, 78, 323, 64, 8, 20, 202, 90)

    1998 +=:arr2
    println(arr2)//运行结果：ArrayBuffer(1998, 0, 19, 78, 323, 64, 8, 20, 202, 90)

    arr2.prepend(78)
    println(arr2)//运行结果：ArrayBuffer(78, 1998, 0, 19, 78, 323, 64, 8, 20, 202, 90)

    println("---------------在某一个位置插入一个数-------------------")
    //在某一个位置插入一个数
    arr2.insert(2,567)
    println(arr2)//运行结果：ArrayBuffer(78, 1998, 567, 0, 19, 78, 323, 64, 8, 20, 202, 90)

    arr2.insertAll(2,newArr)
    println(arr2)//运行结果：ArrayBuffer(78, 1998, 15, 15, 567, 0, 19, 78, 323, 64, 8, 20, 202, 90)

    println("---------------删除一个数-------------------")
    arr2.remove(0)//0是数组的Index
    println("删除一个数："+arr2)

    arr2.remove(0,1)//从0开始，删1个数
    println("删除n个数："+arr2)

    arr2 -= 15//按值删除，第一次出现的15（数组中最前面的那个数）
    println("删除某个数："+arr2)

    //取出除了第一个元素之后的所有元素
    var arr3 = arr2.tail
    println("arr3：" + arr3)//运行结果：arr3：ArrayBuffer(1998, 567, 0, 19, 78, 323, 64, 8, 20, 202, 90)
    var arr4 = ArrayBuffer(1)
    println("arr4：" + arr4.tail)//运行结果：arr4：ArrayBuffer()

    println("---------------拷贝一个数组-------------------")
    var arr2_2 = new Array[Int](arr2.size);
    arr2.copyToArray(arr2_2)
    println("arr2_2："+arr2_2.mkString("-"))

    println("---------------可变数组 转 为不可变数组-------------------")
    //可变数组转为不可变数组
    val arrA = ArrayBuffer(21,28,90)
    var arrB = arrA.toArray
    println("arrB："+arrB.mkString("-"))
    println(arrB.isInstanceOf[Array[Int]])

    println("---------------不可变数组 转 可变数组-------------------")
    //不可变数组转可变数组
    val arrA_1 = Array(21,28,90)
    var arrB_1 = arrA_1.toBuffer
    println("arrB_1："+arrB_1.mkString("-"))
    println(arrB_1.isInstanceOf[ArrayBuffer[Int]])

  }
}
