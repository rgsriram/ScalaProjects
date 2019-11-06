//package lectures.part2oop

object OOExcercise1  extends App{
  val writer = new Writer("Sriram", "Ganesh", 28)
//  writer.fullname()
  val author = new Writer("Tim", "Berguland", 1980)
  val novel = new Novel("Kafka", 2018, author)
  println(novel.authorAge())
  println(novel.isWrittenBy(author))

  val c = new Counter(0)
  c.inc.inc.inc.inc.print
  c.inc(10).print

}

class Writer(name: String, surname: String, val yearOfBirth: Int) {
  def fullname(): String = s"${this.name} ${this.surname}"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = yearOfRelease - author.yearOfBirth

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val n: Int) {
  def inc() = new Counter(n + 1) // Immutability
  def dec() = new Counter(n - 1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def print = println(n)
}