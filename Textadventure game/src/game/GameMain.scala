package game

import java.awt.Color
import java.awt.Graphics2D
import scala.swing.MainFrame
import scala.swing.Panel
import java.awt.Dimension
import scala.swing.event.KeyPressed

object GameMain {
  val gamePanel = new Panel {
    override def paint(g: Graphics2D) {
      g.setPaint(Color.white)
      g.fillRect(0,0, size.width, size.height)
    }
   preferredSize = new Dimension(600,600) 
listenTo(mouse.clicks,mouse.moves,keys)
	reactions += {
     case mouseClicked => // char movement 
		
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

