
package game

import scala.swing._
import scala.xml._

case class Room(name:String, description:String, roomnumber:Int)

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
    val roomnumber = (data \ "room" \ "@roomnumber").text.toInt
    val roomnumber2 = (data \ "room2" \ "@room2number2").text.toInt
    val roomnumber3 = (data \ "room3" \ "@room3number3").text.toInt
    val roomnumber4 = (data \ "room4" \ "@room4number4").text.toInt
    val roomnumber5 = (data \ "room5" \ "@room5number5").text.toInt
    val roomnumber6 = (data \ "room6" \ "@room6number6").text.toInt
    val roomnumber7 = (data \ "room7" \ "@room7number7").text.toInt
    println(roomnumber)
    println(roomnumber2)
    println(roomnumber3)
    println(roomnumber4)
    println(roomnumber5)
    println(roomnumber6)
     println(roomnumber7)
  }

}