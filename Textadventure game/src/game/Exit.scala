package game

import xml._

class Exit() {
  
  def toXML:Node = <exit></exit>
}

object Exit {
  def apply(xml:Node):Exit = {
    null  //TODO
  }
}