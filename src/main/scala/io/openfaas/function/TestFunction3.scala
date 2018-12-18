package io.openfaas.function

object TestFunction3 {
  def main(args: Array[String]): Unit = {
    println(readStdIn())
  }
}
