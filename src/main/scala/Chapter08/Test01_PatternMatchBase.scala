package Chapter08

/**
 * 模式匹配
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //1. 基本定义语法
    val x = 5
    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "unknow"
    }
    println(y)

    //2. 示例：用模式匹配实现二元运算

    //3. 模式守卫（即：带判断条件），例子
    def abs(num:Int):Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
    println(abs(3))
  }
}
