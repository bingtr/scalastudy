package chapter02

import chapter01.Student

/**
 * 常量与变量
 */
object Test02_Variable {
  def main(args: Array[String]): Unit = {
    //1. 声明变量时，类型可以省略，编译器自动推导其类型
    var a1 = 12;//变量：必须要赋初始值；
    val b1 = 22;//常量：必须要赋初始值；

    //2. 类型确定后就不能再修改类型
    //a1 = "abc" 将会报错

    //3. 对象类型
    var xiaoming = new Student("xiaoming",10);
    xiaoming = new Student("Xiaohua",20);
    //xiaoming.name = "xiaohua"; //报错，必须在Student类中声明name为var类型方可
    xiaoming.name = "jenny";

    val bob = new Student("bob",18);
//    bob = new Student("ketty",20); //报错，val 常量无法重新赋值引用对象
    bob.age = 20;

    bob.printInfo();

    //字串拼接
    var a2 : String = "judy";
    println(a2 * 3);

    var a3 : String = "11";
    println(a3 * 3);

    var a4 = 12;
    println(a4 * 3);
    var a5 : String = "后台管理系统";
    //占位符：%s字串，%d数字，%f浮点
    printf("%d岁的%s您好，欢迎登录%s",a4,a2,a5)//println不支持占位符写法
    println();
    //字符串模板,${}来获取变量值
    print(s"${a4}岁的${a2}您好，欢迎登录${a5}")
    println(s"${a4}岁的${a2}您好，欢迎登录${a5}")

    //带格式化的字串模板，%n换行
    var price : Float = 2.856f;
    println(f"${a4}岁的${a2}您好，欢迎登录${a5},%n金额：${price}%2.1f");//会四舍五入

    //字串原始输出
    println(raw"${a4}岁的${a2}您好，欢迎登录${a5},%n金额：${price}%2.1f")

    //三引号输出字符串
    var sql =
      s"""
         |select * from shcool_db
         |where id = ${a4}
         |""".stripMargin
    println(sql)


  }
}
