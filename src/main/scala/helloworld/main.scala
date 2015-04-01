package helloworld

object Fib {

  val fibs: Stream[BigInt] =
    0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)

}

object Main extends App {
  println(Fib.fibs.take(10).toList.mkString(" "))
}
