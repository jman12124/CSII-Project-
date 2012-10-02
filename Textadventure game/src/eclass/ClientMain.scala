package eclass

import scala.swing.Action
import scala.swing.BorderPanel
import scala.swing.BorderPanel.Position.West
import scala.swing.Dimension
import scala.swing.GridPanel
import scala.swing.ListView
import scala.swing.MainFrame
import scala.swing.Menu
import scala.swing.MenuBar
import scala.swing.MenuItem
import scala.swing.ScrollPane
import scala.swing.Separator

object ClientMain {
  val semesterList = new ListView[Semester]()
  val courseList = new ListView[Course]()
  val instructorMenu = new Menu("Instructor Options") {
    contents += new MenuItem(Action("add Semester")(addSemester))
    contents += new MenuItem(Action("add Course")(addCourse))
    enabled = false
  }

  val frame = new MainFrame {
    title = "eletronics classroom"
    contents = new BorderPanel {
      layout += new GridPanel(1, 2) {
        contents += new ScrollPane(semesterList)
        contents += new ScrollPane(courseList)
      } -> West
    }
    menuBar = new MenuBar {
      contents += new Menu("File") {
        contents += new MenuItem(Action("Login") {
          login
          instructorMenu.enabled = true
        })
        contents += new Separator
        contents += new MenuItem(Action("Exit")(sys.exit(0)))
      }
      contents += instructorMenu
    }
    size = new Dimension(980, 600)
    centerOnScreen
  }

  def login {
    // TODO 
    semesterList.listData = ServerMain.getSemester()
  }

  def addSemester {
    //todo

  }

  def addCourse {
    //todo
  }

  def main(args: Array[String]) {
    println("Running client")
    frame.open
    ServerMain.main(null)
  }
}