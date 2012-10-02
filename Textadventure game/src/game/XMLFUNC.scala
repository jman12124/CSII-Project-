
package game

import scala.swing._
import scala.xml._



//var currentRoom:String
//val description:String
//val exit:List [String]
//val userName:List[String] 
//val inventoryNumber:Int
//val numberOfItems:List[Int]
//var item:List[String]
//var itemUsefullness:List[String] 
object XMLFUNC {

  def main(args: Array[String]): Unit = {
    val data = scala.xml.XML.loadFile("map.xml")
    val rooms = (data \ "room").map(Room(_))
    rooms.foreach(println)
  }

}