package chapter05

/**
 * 练习
 */
object Test08_FunExp {
  def main(args: Array[String]): Unit = {
    //练习1
    val fun = (a:Int,b:String,c:Char)=>{
      if (a==0 && "".eq(b) && c=='0') {
        false
      }else{
        true
      }
    }
    println(fun(0,"",'0'))

    //练习2
    val func = (a:Int) =>{

    }
  }

}
