package Chapter08

/**
 * 模式匹配不同的类型
 */
object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    //1. 匹配常量
    def describeConstant(x:Any):String = x match {
      case 1 => "one"
      case "Hello" => "this is word"
      case true => "this is boolean"
      case '+' => "this is a char"
      case _ => "not match"
    }

    //2. 匹配类型
    println("---------------------2. 匹配类型---------------------")
    def describeType(x:Any):String = x match {
      case i:Int => "Int "+i
      case s:String => "String "+s
      case l:List[String] => "List "+l  //List会有泛型擦除，所以此处泛型不传Int也能匹配上
      case arr:Array[Int] => "Array "+arr.mkString("-") //Array不会泛型擦除，泛型传不对时，无法匹配
      case b => "somthing else ... "+b  //此处需要返回传入的值，不能用_
    }
    println(describeType(23))
    println(describeType("hello"))
    println(describeType(List("ab","cd","ef")))
    println(describeType(List(1,23,5)))
    println(describeType(Array(34,231,45)))
    println(describeType(Array("a","c","ef")))
    println(describeType(true))

    //3. 数组匹配
    println("---------------------3. 数组匹配---------------------")
    for (arr <- List(
      Array(0),
      Array(1,0),
      Array(1,1,0),
      Array(2,3,5),
      Array("hello",1,23)
    )){
      val result = arr match {
        case Array(0) => "0"
        case Array(1,0) => "Array(1,0)"
        case Array(x,y) => "Array: "+x+","+y
        case Array(0,_*) => "以0开头的数组"
        case Array(x,1,z) => "中间为1的三元素数组"
        case _ => "some thing else...."
      }
      println(result)
    }
    //4. 匹配列表
    println("---------------------4. 匹配列表---------------------")
    //方式一
    for (arr <- List(
      List(0),
      List(99),
      List(1,0),
      List(1,1,0),
      List(2,3,5),
      List("hello",1,23)
    )){
      val result = arr match {
        case List(0) => "0"
        case List(a) => "List 只有一个元素"+a
        case List(1,0) => "List(1,0)"
        case List(x,y) => "List: "+x+","+y
        case List(0,_*) => "以0开头的列表"
        case List(x,1,z) => "中间为1的三元素列表"
        case _ => "some thing else...."
      }
      println(result)
    }
    //方式二
    val list1 = List(2,12,123,343,4,2)
    list1 match {
      case first :: second :: rest => println(s"first：${first} second：${second} rest：${rest}")
      case _ =>  "some thing else...."
    }

    //5. 匹配元组
    println("---------------------5. 匹配元组---------------------")
    for (tuple <-List(
      (0),
      (0,1),
      (99),
      (1,0),
      (1,1,0),
      (2,3,5),
      ("hello",1,23)
    )){
      val result = tuple match {
        case (a,b) => a+","+b
        case (0,_) => "(0,_)"
        case (0,a) => "(0,a)"+a
        case (a,1,_) => "(a,1,_)"+a
        case _ => "some thing else...."
      }
      println(result)
    }
  }
}
