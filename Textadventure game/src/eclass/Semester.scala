package eclass

class Semester(val year:String, val sem:String) {
	private var courses = List[Course]()

 override def toString:String = year+" "+sem
}