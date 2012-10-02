package littleExample

import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.Ellipse2D



final class Circle(val radius:Double,c:Color) extends Shape(c) {


	override def area:Double = math.Pi*radius*radius
	override def perimeter:Double = 2*math.Pi*radius
	override protected def subdraw(g:Graphics2D) {
	  g.fill(new Ellipse2D.Double(0,0,radius,radius) )
	}
}
