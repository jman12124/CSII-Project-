package eclass

import scala.swing._
import scala.swing.BorderPanel.Position._
import scala.swing.BorderPanel._
import event._


object ClientMain {
  val semesterList = new ListView[Semester]()
  val courseList = new ListView[Course]()
  val InstructorMenu = new Menu("Instructor Options") {
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
          InstructorMenu.enabled = true
        })
        contents += new Separator
        contents += new MenuItem(Action("Exit")(sys.exit(0)))
      }
      contents += InstructorMenu
    }
    size = new Dimension(980, 600)
    centerOnScreen
  }

  def login {
    var username = ""
    var password = ""
      
    // TODO 
    val dialog = new Dialog {
      title = "Login"
        modal = true
        val usernameField = new TextField
        val passwordField = new PasswordField
        contents = new GridPanel(3,1) {
        contents += new BorderPanel {
    	layout += new Label("Username") -> West
    	layout += usernameField -> Center
    	  }
         contents += new BorderPanel {
    	layout += new Label("Password") -> West
    	layout += passwordField -> Center
    	  } 
         contents += new FlowPanel {
           contents += Button("Done"){
             username = usernameField.text
             password = passwordField.password.mkString
             close
             dispose
           }
           contents += Button("Cancel"){
             close
             dispose
           }
         }
      }
     centerOnScreen
    }
    dialog.open

  if(ServerMain.validUser(username, password)) {
   semesterList.listData = ServerMain.getSemester()
     }
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