
package game

import scala.xml._
import scala.xml.XML



object XMLFUNC {

  def main(args: Array[String]): Unit = {
    val data = scala.xml.XML.loadFile("map.xml")
    val rooms = (data \ "room").map(Room(_))
    rooms.foreach(println)
  }

  def savemultiplayer(args: Array[String]): Unit = {
//    val savepos = scala.xml.XML.save("saveServer",node)
  
}
}

