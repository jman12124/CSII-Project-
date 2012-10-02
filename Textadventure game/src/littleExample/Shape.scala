package littleExample

import java.awt.Color
import java.awt.Graphics2D
import scala.swing.MainFrame
import scala.swing.Panel
import java.awt.Dimension

abstract class Shape(private val color:Color) {
  def area:Double 
  def perimeter:Double
  protected def subdraw(g:Graphics2D):Unit
  final def draw(g:Graphics2D):Unit = {
    g.setPaint(color)
    subdraw(g)
  }
}


object Shape {
  def main(args:Array[String]) {
    val r = new Rectangle(100,40,Color.red)
    val c = new Circle(50,Color.green) 
    printShape(c)
    printShape(r)
    val r2 = new MRectangle(20,30,Color.black)
    r2.width = 70
    val s = new MSquare(30,Color.black)
    s.width = 80
    
    val frame = new MainFrame {
      title = "Inheritance"
      contents = new Panel {
        override def paint(g:Graphics2D) {
          g.setPaint(Color.white)
          g.fillRect(0,0,size.width,size.height)
          r.draw(g)
          c.draw(g)
        }
        preferredSize = new Dimension(200,200)
      }
      centerOnScreen
    }
    frame.open
  }
  
  def printShape(s:Shape) {
    println("Area = "+s.area)
    println("Perimeter = "+s.perimeter)
  }
}