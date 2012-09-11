package littleExample

import java.awt.Color
import java.awt.Graphics2D



class Circle(val radius:Double,c:Color) extends Shape(c) {


	override def area:Double = math.Pi*radius*radius
	override def perimeter:Double = 2*math.Pi*radius
	def draw(g:Graphics2D) {
	  //g.fill(new )
	}
}
