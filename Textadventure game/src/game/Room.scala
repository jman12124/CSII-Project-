package game

class Room (val currentRoom:String, val description:String, val exit:List [String], val userName:List[String], 
  val inventoryNumber:Int, val numberOfItems:List[Int], var item:List[String], var itemUsefullness:List[String]) {

}