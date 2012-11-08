package game

import java.net.Socket
import scala.actors.Actor

object TelnetClient {
  def main(args:Array[String]) {
    println("What host machine?")
    val host = readLine
    println("What port?")
    val port = readInt
    val sock = new Socket(host,port)
    val is = sock.getInputStream
    val os = sock.getOutputStream
    Actor.actor {
      while(true) {
        while(is.available==0) {
          Thread.sleep(10)
        }
        val buf = new Array[Byte](is.available)
        is.read(buf)
        println(new String(buf))
      }
    }
    while(true) {
      os.write((readLine+"\n").getBytes)
    }
  }
}