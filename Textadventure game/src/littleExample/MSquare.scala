package littleExample

import java.awt.Color

class MSquare(length:Double,c:Color) extends MRectangle(length,length,c) {

  override def width_=(w:Double) {
    super.width = w
    super.height = w
  }


  override def height_=(w:Double) {
    super.width = w
    super.height = w
  }
}