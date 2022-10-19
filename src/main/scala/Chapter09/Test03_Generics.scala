package Chapter09

/**
 * 泛型协变、逆变、上下限
 */
object Test03_Generics {
  def main(args: Array[String]): Unit = {
    //1. 协变
    val child:Parent = new Child()
    //Child 与Parent为父子类关系，但是MyCollection[Child] 与MyCollection[Parent]则没有父子类关系，如果不协变，则报错。
    // 协变即：class MyCollection[+E],使得MyCollection[Child]与MyCollection[Parent]成为父子类关系
    val childList:MyCollection[Parent] = new MyCollection[Child]()

    //2. 逆变
    //SubChild 与Child是父子类关系，逆变后，MyCollection2[Child]为MyCollection2[SubChild]子类
    val childList2:MyCollection2[SubChild] = new MyCollection2[Child]

    //3. 泛型上下限:泛型A是Child或者Child子类
    def test[A <: Child](a:A)={
      println(a.getClass.getName)
    }
    test[Child](new Child)
    test[Child](new SubChild)
    test(new Child)
    test(new SubChild)
  }
}

class Parent{}
class Child extends Parent {}
class SubChild extends Child {}

//定义带泛型的集合类型
class MyCollection[+E] {}
class MyCollection2[-E] {}