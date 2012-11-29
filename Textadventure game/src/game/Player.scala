package game

import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

import scala.collection.mutable

//player walks around the house trying to find things only have one life but have multiple players with him/her
// if about to get eaten can trip other player to get away and the one that is tripped and gets eaten
class Player(val name: String, private var room: Room) {

  private var sock: Socket = null
  private var is: InputStream = null
  private var os: OutputStream = null

  def connect(s: Socket, nis: InputStream, nos: OutputStream) {
    sock = s
    is = nis
    os = nos
  }
  def update {
    if (is.available > 0) {
      val command = GameMain.readFromIS(is)
      println("User entered " + command)
    }
  }
  def println(o: Any) {
    GameMain.writeToOS(os, o.toString)
  }
  def movement(North: String, East: Int,
    South: Int, West: Int,
    Up: Int, Down: Int,
    time: Int, movement: Int) {
    println("which direction do you want to go?")
    var option = 0
    option = readInt()
    //  option match{}
  }
  var keyCollected = 0;
  var keyDropped = 0;
  /*  def keyCollected(player:Int){
    if (player == 1) {
    	var keyCollected += 1 { 
    	 keyCollected += 1
         } else if (player.keyCollected)
    }
  }
  */
  var life = 1
  def isAlive = life -> 0

  def Death(n: Int = 1) {
    if (n > 0) {
      life -= 1
      if (life == 0) {
        die
      }

    }
  }
  def die = {
    println(name + "was eatened by a Domo")
  }

} 
//have it prints out to other player if one player is eaten "you hear a scream from a distance followed by nom nom nom nom noise"
// create new player at the beginning of room player name 
 // TODO change below to make it into a tree 
/*val info = "escape from the horror house using these input:"
val input = List ("North","South","East","West","Up","Down")
println ("input")
println ("info")
*/
