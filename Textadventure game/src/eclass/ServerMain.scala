package eclass

object ServerMain {
  private var semesters = List[Semester]()
  
  def getSemester() = semesters
  
  def main(args:Array[String]) {
    println("running server")
    semesters ::= new Semester("2012","fall")
	}
}