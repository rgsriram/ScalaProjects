package lectures.part1basics

object StringOps extends App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumString = "2"
  val aNum = aNumString.toInt

  println('a' +: aNumString :+ 'z')

  // Scala specific: String interpolators

  // S-interpolators

  val name = "Sriram"
  val age = 28
  val greeting = s"Hello, my name is $name, and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age +1}"

  println(anotherGreeting)

  // F-interpolators

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f"
  println(myth)

  // raw - interpolators
  println(raw"This is \n newline")
  val escaped = "This is \n newline"
  println(raw"$escaped")

}
