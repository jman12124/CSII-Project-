package game

import scala.io.Source
import scala.swing._
import event._
import java.awt.event.KeyEvent
object GameMain {

 //   val gameList = new ListView(game.map(_.name)) {

 //  }
  val gamePanel = new Panel {
   //  val newGame = ListView[Game]()
    val gameMenu = new Menu("Game") {
      contents += new Separator
      contents += new MenuItem(Action("exit")(sys.exit(0)))
    }
  }

  
  val frame = new MainFrame {

    title = "Horror Text Adventure"
    contents = gamePanel
    size = new Dimension(900, 900)
    centerOnScreen
  }
  

  def main(args: Array[String]) {
    frame.open
  }
} 