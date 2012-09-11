package game

import java.awt.Color
import java.awt.Graphics2D
import scala.swing.MainFrame
import scala.swing.Panel

object GameMain {
  val gamePanel = new Panel {
    override def paint(g: Graphics2D) {
      g.setPaint(Color.white)
      g.fillRect(0, 0, size.width, size.height)
    }
  }

  val frame = new MainFrame {
    
    title = "Text Adventure"
    contents = gamePanel
    centerOnScreen
  }

  def main(args: Array[String]) {
    frame.open
  }
}
// val randomRoomXML = Xml.loadFile("map.xml")
// val murdermap = (randomRoomXML \ "Random").map(randomRoom).toArray
//
//var nowRoom = (map(0))
//var troll = ""
//var pocket: List[String] = List()
//
//		event {
//        println("\n" + nowRoom.username)
//        println(nowRoom.description)
//        println("\n" + " there is something on the floor (grab it or leave it)" + "\n")
//        nowRoom.item.foreach(i =>
//                println(i +"\n")
//        )
//
//var pcRules = readline
//val emergencyexit = nowRoom.pi.filter(y => pcRules troll == y)
//val exit = currentRoom.item.filter(y => pcRules.endsWith(y))
//  if (troll.startsWith("grab it")) {
//val itemList = nowRoom.item.filter(y => user.endsWith(y))
//        if( itemList.isEmpty) {
//                println("that did nothing")
//        }        else {
//        nowRoom.item = itemList(0) :: nowRoom.item
//        pocket = pocket.remove(itemList(0) == _)
//                 }
//  }
//  else if(pcRules=="pocket")
//        println(pocket)
//  else {
//        if(inventory.contains("knife"))
//        if(exit.isEmpty)
//        println("IT'S A TRAP!!!!!!!!!!\n")
//        else nowRoom = map(nowRoom.newnumber(nowRoom.pi.indexOf(troll)))
//  }
//while (troll != "have a nice day ")
//}
//}

