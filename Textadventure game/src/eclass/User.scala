package eclass

class User(
    val username:String,
    private var name:String,
    private var password:String,
    id:String) {

  def checkPassword(pwd:String):Boolean = pwd == password 
}