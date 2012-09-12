package game


abstract class Enemies (attacker:Int, defense :Int)

//object GameMain extends ("Text adventure game")

class enemy {
  val enemy_radius =  ("enemy.radius", 15)
  val num_enemies = ("enemy.amount", 50)
}
  
//private val Enemies = ArrayBuffer[Enemy]()

init{
  
for (i <- 1 to num_enemies) enemies += new Enemy()
	action {
  if(!player.isAlive) pause()
  val dead_enemies = enemies.filter(!_.isAlive)
  enemies --=dead_enemies
  if(enemies.size < math.random*num_enemies) enemies += new Enemy()
 
	}
}
