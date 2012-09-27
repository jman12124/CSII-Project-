package game

import java.awt.Dimension

import scala.swing.MainFrame
import scala.swing.Panel

object GameMain {
  var Enemies = List[enemy]()
  val gamePanel = new Panel {
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
