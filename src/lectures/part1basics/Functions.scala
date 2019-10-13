package lectures.part1basics

object Functions extends App {

  def aRepeatedFunction(aString:String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // When you need loops use recursive function


  def greetingFunction(name: String, age: Int): Unit = println("Hi, my name is " + name + " and my age is " + age)

  greetingFunction("Sriram", 28)


  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n-1)
  }

  println(factorial(5))

  def fibonacciFunction(n: Int): Int = {
    if(n <= 1) 1
    else fibonacciFunction(n-1) + fibonacciFunction(n-2)
  }

  println(fibonacciFunction(6))

  def isPrime(n: Int): Boolean = {

    def checkIsDivisble(i: Int): Boolean = {
      if (i <= 1) true
      else n % i != 0 && checkIsDivisble(i - 1)
    }

    checkIsDivisble(n/2)
  }

  println(isPrime(6))
}
