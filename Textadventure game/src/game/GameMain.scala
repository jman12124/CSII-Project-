package game

import java.io.InputStream
import java.io.OutputStream
import java.net.ServerSocket

import scala.actors.Actor
import scala.collection.mutable

object GameMain {
  val users = mutable.Buffer[Player]()
  val rooms = loadMap

  def readFromIS(is: InputStream): String = {
    val buf = new Array[Byte](is.available)
    is.read(buf)
    new String(buf)
  }

  def waitAndReadFromIS(is: InputStream): String = {
    while (is.available() == 0) {}
    readFromIS(is)
  }

  def writeToOS(os: OutputStream, str: String) {
    os.write((str + "\n").getBytes())
    os.flush
  }
  
  def loadMap:Seq[Room] = {
    val data = scala.xml.XML.loadFile("map.xml")
    (data \ "room").map(Room(_))
  }
  
 def saveMultiplayerToXml(node:scala.xml.Node) : Unit = {
	val savepos = scala.xml.XML.save("saveServer",node)
}
  
  
  def main(args: Array[String]) {
    Actor.actor {
      val ss = new ServerSocket(4243)
      while (true) {
        val sock = ss.accept
        val is = sock.getInputStream()
        val os = sock.getOutputStream()
        writeToOS(os, "What is your name?")
        val name = waitAndReadFromIS(is)
        println("name = "+name)
        val user = users.find(_.name == name) match {
          case None =>
            val p = new Player(name,rooms(0)) // TODO found out why is not advancing after println
            p.connect(sock, is, os)
            p
          case Some(p) =>
            println("welcome back" +name)
            p.connect(sock, is, os)
            p
        }
        println("Adding user "+user)
        rooms(0).descPrint(user)
        users += user
      }
    }
    while(true) {
      for(u <- users) {
        u.update
      }
      Thread.sleep(100)
    }
//new Thread(new Runnable {
   //   def run {
   //     for (TelenetClient <- 1 to 50) {
   //       Thread.sleep(200)
   //     }
  //    }
  //  }).start
  }
}

