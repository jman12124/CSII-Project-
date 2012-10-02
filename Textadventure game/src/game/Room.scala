package game

import xml._

class Room(name:String, description:String, roomnumber:Int,exits:Seq[Exit]) {
  def toXML:Node = 
    <room name={name} roomnumber={roomnumber.toString}>
		<description>{description}</description>
	</room>
		
  override def toString = name+"\n"+description
}

object Room {
  def apply(xml:Node):Room = {
    val name = (xml \ "@name").text
    val desc = (xml \ "description").text
    val number = (xml \ "@roomnumber").text.toInt
    val exits = (xml \ "exit").map(Exit(_))
    new Room(name,desc,number,exits)
  } 
  // Does this commit
}