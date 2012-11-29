package game

import java.net.Socket
import scala.actors.Actor

object TelnetClient {
  def main(args:Array[String]) {
    val host = "localhost" 
    val port = 4243 
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