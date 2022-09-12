package chapter02

import scala.io.StdIn

/**
 * 控制台标砖输入测试
 */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入您的名字：")
    var name : String = StdIn.readLine();
    println("请输入您的年龄：")
    var age : Int = StdIn.readInt();

    printf(s"欢迎%s,来到管理后台系统，您的年龄为%d",name,age)
  }
}
