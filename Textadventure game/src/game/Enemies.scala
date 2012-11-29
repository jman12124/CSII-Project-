package game
//object GameMain extends ("Text adventure game")
// TODO have a domo doll that goes around and kills players after players spawn and ever player killed add movement by one
// takes one turn in eating a player 
//
//Domo

class Enemies /*(val North: Int, val East: Int, val South:Int, val West:Int, val Up:Int, val Down:Int, var time: Int, var movement:Int) extends Player {
 case class Enemy
  val PanelSize = 600
  var enemies = List(Enemy())
  var currentTime = 0
  var enemyMovement = 100
      for (enemy <- enemies) {
        (currentTime - enemy.time) / enemyMovement
        (enemy.North - 5, enemy.South - 5, 
         enemy.East - 5, enemy.West- 5, 
         enemy.Up - 5, enemy.Down - 5)
     //   val dx = enemy.North - Player.North
     //   val dx2 = enemy.South - Player.South
     //   val dy = enemy.East - Player.East
     //   val dy2 = enemy.West - Player.West
     //   val dz = enemy.Up - Player.Up
     //	  val dz2 = enemy.Down - Player.Down
        if (dx * dx + dy * dy < 25) {
        }
      }
 
  
 // 
  // val dx = Enemy.x-Player.x
  // val dy = Enemy.y-Player.y
 
/*  Enemies = (e <- Enemies; if e.time+movement>currentTime) yield {
 * val movement = if (???
 * }
  
  
  */
 
  
  
  
  
  
  def slowSpeed{
  }
  
//	val Domo = new 
 
  
/*  def kill(attack:Enemies) = {
//	  println(" you were eatened by "+p.Enemies") 
	  
  }
 def enemiesAttack{
  //  if (enemies.attack.player)
  }
 */
}


/* case class Enemies(val attack:Int, var movement:Int, time:Int)
  var Enemy = List(Enemies)
  var currentTime = 0 
  var enemySpeed = 0
  for (enemy <- Enemy) {
    (currentTime - enemy) / enemySpeed.toInt )
 
*/
*/
