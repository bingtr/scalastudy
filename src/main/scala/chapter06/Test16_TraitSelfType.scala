package chapter06

/**
 * selfType自身类型
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    var user = new RegisterUser("Alice","123456")
    user.insert()
  }
}
class User(var name:String,var password:String)

trait UserDao{
  _: User => //selfType自身类型，相当于trait中的方法能狗拿到：with这个trait的对象
  def insert(): Unit ={
    println(s"insert into db:${this.name}  ${this.password}")
  }
}
//定义注册用户类
class RegisterUser(name:String,password:String) extends User(name,password) with UserDao
