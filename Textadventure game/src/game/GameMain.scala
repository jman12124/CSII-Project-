package game

import scala.actors.Actor
import java.io.InputStream
import java.io.OutputStream
import java.net.ServerSocket
import collection.mutable

object GameMain {
  val users = mutable.Buffer[Player]()

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

  def main(args: Array[String]) {
    Actor.actor {
      val ss = new ServerSocket(4243)
      while (true) {
        val sock = ss.accept
        val is = sock.getInputStream()
        val os = sock.getOutputStream()
        writeToOS(os, "What is your name?")
        val name = waitAndReadFromIS(is)
        val user = users.find(_.name == name) match {
          case None =>
            println("please enter your name")
         // find out how to enter a new username and 
            // TODO new player
            new Player(name,null) // TODO second argument should be starting room
          case Some(p) =>
            println("welcome back" +name)
            p.connect(sock, is, os)
            p
        }
        users += user
      }
    }
new Thread(new Runnable {
      def run {
        for (TelenetClient <- 1 to 50) {
          Thread.sleep(200)
        }
      }
    }).start
  }
}

