package littleExample

import java.awt.Color


class Rectangle(
    val width:Double, 
    val height:Double, 
    c:Color) extends Shape(c) {
 override def area:Double = width*height
 override def perimeter:Double 2*(width+height)
}