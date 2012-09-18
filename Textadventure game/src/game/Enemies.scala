package game

import java.awt.Graphics2D
import java.awt.Color
import java.awt.geom.Rectangle2D


abstract class Enemies (attacker:Int, defense :Int)

//object GameMain extends ("Text adventure game")

class enemy { 
  val enemy_radius =  ("enemy.radius", 15)
  val num_enemies = ("enemy.amount", 50)
  
 

  override def paint (g:Graphics2D) {
    g.setPaint (Color.white)
    g.fill (new Rectangle2D.Double (0,0,size.width,size.height))
    val //panda = ImageIO.read(new File("panda.jpg"))
    
  }
}
