package littleExample

import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.Rectangle2D

class MRectangle(private var lWidth:Double, 
	private var lHeight:Double, 
	c:Color) extends Shape(c) {
  
  def width = lWidth
  def height = lHeight
  def width_=(w:Double) = lWidth = w
  def height_=(h:Double) = lHeight = h
  
 override def area:Double = width*height
 override def perimeter:Double = 2*(width+height)
 override def subdraw(g:Graphics2D) {
	  g.fill(new Rectangle2D.Double(0,0,width,height ))
 	}
 
 }