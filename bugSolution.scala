```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    value match {
      case v: Int => println(v) 
      case v: String => println(v)
      case v: List[_] => println(v.mkString("[", ", ", "]"))
      case _ => println("Unsupported type for printing")
    }
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue()

    val myString = new MyClass("Hello")
    myString.printValue()

    val myList = new MyClass(List(1,2,3))
    myList.printValue()

    val myUnsupported = new MyClass(new Object())
    myUnsupported.printValue()
  }
}
```