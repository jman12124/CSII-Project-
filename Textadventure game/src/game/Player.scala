package game

import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

import scala.collection.mutable

//player walks around the house trying to find things only have one life but have multiple players with him/her
// if about to get eaten can trip other player to get away and the one that is tripped and gets eaten
//TODO player picks a number from 1-10 and the closest one to the number wins
class Player(val name: String, private var room: Room) {

  private var sock: Socket = null
  private var is: InputStream = null
  private var os: OutputStream = null

  def connect(s: Socket, nis: InputStream, nos: OutputStream) {
    sock = s
    is = nis
    os = nos
  }

  def println(o: Any) {
    GameMain.writeToOS(os, o.toString)
  }
  // TODO change below to make it into a tree 
/*val info = "escape from the horror house using these input:"
val input = List ("North","South","East","West","Up","Down")
println ("input")
println ("info")
*/
  class Map[info, input](comp: (info, info) => String) extends mutable.Map[info, input] {                             
    private var root: Node = null
    private class Node(var info: info, var input: input)
    
    def +=(inip: (info, input)) = {
      def recurAdd(n:Node): Node = {
        if (n == null) {
          new Node(inip._1, inip._2)
        } else {
          val c = comp(inip._1, n.info)
          if (c == 0) n.info = inip._2
          else if (c < 0) n.left = recurAdd(n.left)
          else n.right = recurAdd(n.right)
        }
      }
    }	
  } 
} 

// create new player at the beginning of room player name 
