package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2
  println(x)

  // Instructions (DO) vs Expressions (Values)
  // Instructions are executed vs Expressions are evaluated.


  val aConditioned = true

  val aConditionedValue = if (aConditioned) 5 else 3

  println(aConditionedValue)

  var i = 0

  while (i< 10) {
    println(i)
    i += 1
  }

  // NEVER USE LOOPS in SCALA.

  // Everything in scala is Expression.

  var aVariable = 1
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {

    // all varibales only visible inside code blocks
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

}
