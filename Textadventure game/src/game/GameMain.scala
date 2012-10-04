package game

import scala.io.Source
import scala.swing._

import event._
object GameMain {
//  val gameList = new ListView(game.map(_.name)) {

 // }
  val gamePanel = new Panel {
    // val newGame = ListView[Game]()
    val gameMenu = new Menu("Game") {
      contents += new MenuItem(Action("start new game")(newGame))
      contents += new MenuItem(Action("s+pen a saved game")(openFile))
      contents += new Separator
      contents += new MenuItem(Action("exit")(sys.exit(0)))
    }

 /*   listenTo(mouse.clicks.moves,keys)
    	reactions += {
      case kp:KeyPressed =>
        if(kp.key==Key.Left)
        if(kp.key==Key.Right)
        if(kp.key==Key.Up)
        if(kp.key==Key.Down)
    }
    */
  }
    def openFile {
    val chooser = new FileChooser
  //  if (chooser.showOpenDialog(gameList) == FileChooser.Result.Approve) {
      val source = Source.fromFile(chooser.selectedFile)
      val lines = source.getLines
  //    game = List.fill(lines.next.toInt)(readGame(lines))
  //    gameList.listdata = game.map(_.name)
      source.close()
    }
 // }
  def saveFile {

  }
  def newGame {


  }
  val frame = new MainFrame {

    title = "Text Adventure"
    contents = gamePanel
    centerOnScreen

  }

  def main(args: Array[String]) {
    frame.open
  }
} 