package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * 文件的输入输出
 */
object Test06_FileIo {
  def main(args: Array[String]): Unit = {
    //1. 从文件中读取数据
    Source.fromFile("src/main/resources/test06.txt").foreach(print);

    //2. 写入文件
    var writer = new PrintWriter(new File("src/main/resources/test06_output.txt"))
    writer.write("你好我现在用scala写入文件");
    writer.close();
  }
}
