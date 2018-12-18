package io.openfaas

import scala.annotation.tailrec
import scala.io.StdIn

package object function {

  @tailrec
  def readStdIn(start:String=""):String = {
    StdIn.readLine() match {
      case null => start
      case line:String => readStdIn(s"$start$line\n")
    }
  }

}
