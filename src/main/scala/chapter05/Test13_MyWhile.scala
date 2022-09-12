package chapter05

object Test13_MyWhile {
  def main(args: Array[String]): Unit = {

  }

  /**
   * 因为whileFunc返回的是loop函数，即返回:loop参数+loop返回值类型
   * loop参数：代码块(=>Unit)
   * loop返回类型：Unit
   * @param condition
   * @return
   */
  def whileFunc(condition: => Boolean): (=>Unit)=>Unit ={
    def loop(ops: =>Unit):Unit={
      if (condition){
        ops
        whileFunc(condition)(ops)
      }
    }
    loop _
  }

  /**
   * 简化
   * @param condition
   * @return
   */
  def whileFunc2(condition: => Boolean): (=>Unit)=>Unit ={
    //内层函数需要递归调用，参数就是循环体
    ops=>{
      if (condition){
        ops
        whileFunc2(condition)(ops)
      }
    }
  }

  /**
   * 函数柯里化方式
   * @param condition
   * @param ops
   */
  def whileFunc3(condition: => Boolean)(ops: =>Unit):Unit={
    //内层函数需要递归调用，参数就是循环体
    if (condition){
      ops
      whileFunc3(condition)(ops)
    }
  }
}
