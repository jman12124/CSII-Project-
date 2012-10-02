package littleExample

import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.Rectangle2D


 class Rectangle(
    val width:Double, 
    val height:Double, 
    c:Color) extends Shape(c) {
 override def area:Double = width*height
 override def perimeter:Double = 2*(width+height)
 override def subdraw(g:Graphics2D) {
	  g.fill(new Rectangle2D.Double(0,0,width,height ))
 	}
}