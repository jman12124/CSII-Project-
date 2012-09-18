package game

import java.awt.Color
import java.awt.Dimension
import java.awt.Graphics2D
import scala.swing.MainFrame
import scala.swing.Panel
import javax.swing.text.html.ListView

object GameMain {
  var Enemies = List[enemy]()
  val gamePanel = new Panel {
    override def paint(g: Graphics2D) {
      g.setPaint(Color.white)
      // import image of enemy
     // Enemies.foreach(_.draw(g))
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
