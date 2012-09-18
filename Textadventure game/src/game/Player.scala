package game

import java.awt.Color
import java.awt.Graphics2D
import java.io.File

import javax.imageio.ImageIO

//player attack and defence against the AI
abstract class Player (attack:Int, defense :Int){
  
}

// create new player / player name 
class Player {
	//val character = new 
	override def paint (g:Graphics2D) {
	  g.setPaint (Color.blue)
	  val player = ImageIO.read(new File ("player.jpg"))
	  g.drawImage (player,0,0,null)
	}
	
}