
package game

import scala.xml._
import scala.xml.XML
import scala.xml.Node


object XMLFUNC {

  def main(args: Array[String]): Unit = {
    val data = scala.xml.XML.loadFile("map.xml")
    val rooms = (data \ "room").map(Room(_))
    rooms.foreach(println)
  }

  // TODO save a players position in a room
 /* def saveMultiplayer(node:Node): Player = {
   	val player = (node \ "@player").text 
  }
  
  def saveRoom(node:Node): Room = {
    val room = (node \ "@room").text
  }
  */
  def saveMultiplayerToXml(node:scala.xml.Node) : Unit = {
	val savepos = scala.xml.XML.save("saveServer",node)
}
  
}

