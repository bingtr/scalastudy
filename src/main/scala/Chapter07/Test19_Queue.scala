package Chapter07

import scala.collection.mutable

object Test19_Queue {
  def main(args: Array[String]): Unit = {
    //1. 创建一个可变队列
    println("-------------------------1. 创建一个可变队列-----------------------")
    val queue = mutable.Queue[String]()
    queue.enqueue("a")
    queue.enqueue("b")
    queue.enqueue("c")
    println(queue)
    println(queue.dequeue())//返回出队的元素
    println(queue)

    queue.enqueue("b")
    println(queue)

    //2. 创建一个不可变队列
    println("-------------------------2. 创建一个不可变队列-----------------------")
    val queue2 = mutable.Queue("a",1,'c',12.3)
    println(queue2)
    println(queue2.dequeue())
    println(queue2)

  }
}
