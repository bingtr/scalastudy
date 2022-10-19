package Chapter09

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val a = 10/0
    }catch {
      case e:ArithmeticException =>{
        println("------ArithmeticException-------")
      }
      case e:Exception =>{
        println("------Exception-------")
      }
    }finally {
      println("------finally-------")
    }
  }
}
