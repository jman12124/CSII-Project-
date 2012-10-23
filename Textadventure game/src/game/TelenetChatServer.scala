package game

import java.io.InputStream
import java.net.ServerSocket
import java.net.Socket
import scala.actors.Actor
import java.io.OutputStream

import collection.mutable

object TelenetChatServer {  
  val users = mutable.Buffer[User]()
  
  case class User(sock: Socket, is: InputStream, os: OutputStream, name: String) {

  }
  
  def readFromIS(is: InputStream): String = {
    val buf = new Array[Byte](is.available)
    is.read(buf)
    new String(buf)
  }

  def waitAndReadFromIS(is: InputStream): String = {
    while (is.available() == 0) {}
    readFromIS(is)
  }
  
  def writeToOS(os:OutputStream,str:String) {
    os.write((str+"\n").getBytes())
    os.flush
  }

  def main(args: Array[String]) {
    Actor.actor {
      val ss = new ServerSocket(6666)
      while (true) {
        val sock = ss.accept
        val is = sock.getInputStream()
        val os = sock.getOutputStream()
        writeToOS(os, "What is your name?")
        val user = User(sock, is, os, waitAndReadFromIS(is))
        users.foreach(u => writeToOS(u.os,user.name+" has arrived to this room."))
        users += user
      }
    }
    while(true) {
      for(user <- users) {
        if(user.is.available()>0) {
          val message = readFromIS(user.is)
          for(u2 <- users) writeToOS(u2.os,user.name+" : "+message)
        }
      }
    }
  }
}