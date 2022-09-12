package chapter02

object Test08_TestDataTypeConvert {
  def main(args: Array[String]): Unit = {
    val a4 : Byte = 1;
    val b4 : Short = a4
    val c4 : Short = (a4 + b4).toShort
    println(c4)

    val b5 : Short = 256;
    println(b5.toByte)

    val b6 = 15;
    val b7 = 18;
    println(b6+b7+"sss")

    //String 转称数值
    val m : Int = "12".toInt;
    val f : Float = "12.3".toFloat;
    val f2: Int = "12.3".toDouble.toInt;//12.3需要先转为Double，所再转成Float
    println(f2)
  }
}
