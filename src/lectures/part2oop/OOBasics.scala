//package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Sriram", 28)
  println(person.age)
  person.greet("Rocky")
}

// Constructor
class Person(name: String, val age: Int = 0) {
  // body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John")
}

// class parameters are NOT FIELDS
// To convert class parameters to fields use val/var