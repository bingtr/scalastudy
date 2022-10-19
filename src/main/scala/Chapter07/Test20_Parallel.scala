package Chapter07

/**
 * 并行集合
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    //
    val result = (1 to 100).map(x => Thread.currentThread().getId)
    println(result)

    //并行计算
    val result2 = (1 to 100 ).par.map(x => Thread.currentThread().getId)
    println(result2)
  }
}
