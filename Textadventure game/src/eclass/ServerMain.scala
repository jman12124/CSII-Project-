package eclass

object ServerMain {
  private var semesters = List[Semester]()
  private var users = List(
 //     new Instructor("jman","jean","super user","001"),
      new Student("johnw","john wu","password","101"))

  def getSemester() = semesters

  def validUser(name: String, password: String): Boolean = {
    //  	users.find(_.username == name) match {
    // 	  case None => false
    //  	  case Some(user) => user.checkPassword(password)
    //  	}
    true
    // }
  }
    def main(args: Array[String]) {
      println("running server")
      semesters ::= new Semester("2012", "fall")
    }
  
}
