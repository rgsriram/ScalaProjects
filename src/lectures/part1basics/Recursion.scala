package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  // Tail Recursion = Use recursive call as the last expression

  def factorial(n: Int): BigInt = {

    @tailrec
    def factHelper(x:Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(n, 1)
  }

  println(factorial(10))

  def concatenateString(a: String, n: Int): String = {

    @tailrec
    def concatenateStringHelper(i: Int, accumulator: String): String = {
      if (i <= 0) accumulator
      else concatenateStringHelper(i-1, a + " " + accumulator)
    }

    concatenateStringHelper(n, "hello")
  }

  println(concatenateString("hello", 10))

  def isPrime(n: Int): Boolean = {

    def checkIsDivisble(i: Int, isStillPrime: Boolean): Boolean = {
      if (i <= 1) isStillPrime
      else checkIsDivisble(i - 1, n % i != 0 && isStillPrime)
    }

    checkIsDivisble(n/2, true)
  }

  println(isPrime(629))

  def fibonacciFunction(n: Int, a: Int, b: Int): Int = {
    if (n == 1) b
    fibonacciFunction(n-1, b, a + b)
  }

  println(fibonacciFunction(10, 0, 1))
}
