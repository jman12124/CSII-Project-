package game

import scala.swing.FileChooser

class Rooms (val currentRoom:String, val description:String, val exit:List [String], val userName:List[String], 
val inventoryNumber:Int, val numberOfItems:List[Int], var item:List[String], var itemUsefullness:List[String]) {


var Room = List [Rooms] ()

 //val RoomList = new ListView (currentRoom.map(_.title))





def room (node:Node): Room = {
		val Room1 = (node \ "@Room1").text
		val Room2 = (node \ "@Room2").text
		val Room3 = (node \ "@Room3").text
		val Room4 = (node \ "@Room4").text
		val Room5 = (node \ "@Room5").text
		val Room6 = (node \ "@Room6").text
		val Room7 = (node \ "@Room7").text
		val Room8 = (node \ "@Room8").text
		val Room9 = (node \ "@Room9").text
		val Room10 = (node \ "@Room10").text
		val Room11 = (node \ "@Room11").text
		val Room12 = (node \ "@Room12").text
		val Room13 = (node \ "@Room13").text
		val Room14 = (node \ "@Room14").text
		val Room15 = (node \ "@Room15").text
  
  Room(Room1,Room2,Room3,Room4,Room5,Room6,Room7,Room8,Room9,Room10,Room11,Room12,Room13,Room14,Room15) 
}

def openFile {
  val chooser = new FileChooser
  if (chooser.showOpenDialog)(//roomlist) == FileChooser.Result.Approve) {
      val data = XML.loadFile(chooser.selectedFile)
}
}