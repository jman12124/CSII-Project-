package utility

object Sorts {
  def bubbleSort[A <% Ordered[A]](a:Array[A]) {
    for (i <- 0 until a.length-1)
      for (j <- 0 until a.length-1-i) {
        if(a(j+1)<a(j)) {
          val temp = a(j)
          a(j) = a(j+1)
          a(j+1) = temp
        } 
      }
  }
  
  def bubbleSort2[A](a:Array[A])(lt: (A,A)=>Boolean) {
    for (i <- 0 until a.length-1)
      for (j <- 0 until a.length-1-i) {
        if(lt(a(j+1),a(j))) {
          val temp = a(j)
          a(j) = a(j+1)
          a(j+1) = temp
        } 
      }
  }

  	def main(args:Array[String]) {
  	  val nums = Array.fill(20)(util.Random.nextInt(100))
  	  println(nums.mkString(", "))
  	  bubbleSort2(nums)(_ < _)
  	  println(nums.mkString(", "))
  	  
  	}
}