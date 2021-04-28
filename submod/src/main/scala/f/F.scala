package f

import pureconfig._
import pureconfig.generic.auto._

object F {
  case class R(a: String)

  def main(args: Array[String]): Unit = {
    println(ConfigSource.string("a: someval").load[R])
  }
}
