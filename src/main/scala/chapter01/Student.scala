package chapter01

class Student (var name:String,var age:Int){
  def printInfo():Unit={
    println(name+" "+age+" "+Student.school);
  }
}
object Student{
  var school:String="qinghua";

  def main(args: Array[String]): Unit = {
    var xiaoming = new Student("xiaoming",12);
    var xiaohua = new Student("xiaohua",14);

    xiaoming.printInfo();
    xiaohua.printInfo();
  }
}