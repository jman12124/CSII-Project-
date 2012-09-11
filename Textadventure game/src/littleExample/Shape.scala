package littleExample

import java.awt.Color
import java.awt.Graphics2D

abstract class Shape(private val color:Color) {
  def area:Double 
  def perimeter:Double 
  //def draw(g:Graphics2D):Unit {}
}


object Shape {
  def main(args:Array[String]) {
    val r = new Rectangle(10,4,Color.red)
    val c = new Circle(5,Color.green) 
    printShape(c)
    printShape(r)
  }
  
  def printShape(s:Shape) {
    println("Area = "+s.area)
    println("Perimeter = "+s.perimeter)
  }
}