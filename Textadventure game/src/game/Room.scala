package game

import xml._

class Room(name:String, description:String, roomnumber:Int,exits:Seq[Exit],North:Int,South:Int,East:Int,West:Int,Up:Int,Down:Int) {
  def toXML:Node = 
    <room name={name} roomnumber={roomnumber.toString}>
		<description>{description}</description>
	</room>
		
  override def toString = name+"\n"+description

  def descPrint(user:Player) {
    user.println("")
    user.println("you are in the" + name + ", " +
        description)
    
  }
}

object Room {
  def apply(xml:Node):Room = {
    val name = (xml \ "@name").text
    val desc = (xml \ "description").text
    val number = (xml \ "@roomnumber").text.toInt
    val exits = (xml \ "exit").map(Exit(_))
    val North = (xml \ "@North").text.toInt
    val South = (xml \ "@South").text.toInt
    val East = (xml \ "@East").text.toInt
    val West = (xml \ "@West").text.toInt
    val Up = (xml \ "@Up").text.toInt
    val Down = (xml \ "@Down").text.toInt
 
    new Room(name,desc,number,exits,North,South,East,West,Up,Down)
  } 
}