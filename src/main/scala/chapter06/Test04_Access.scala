package chapter06

object Test04_Access {
  def main(args: Array[String]): Unit = {
    var worker : Person = new Worker()
    worker.printInfo()
  }
}

class Worker extends Person {
  override def printInfo()={
    name = "jack"
    age = 29
    sex = "male"
//    idCard = "1242345665"
    println(s"Worker: $name $sex $age")
  }
}