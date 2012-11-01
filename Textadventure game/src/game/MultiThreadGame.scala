package game

object MultiThreadGame{

  def main(args: Array[String]): Unit = {
  new Thread(new Runnable {
     def run {
       for (playerMovement <- 1 to 50) {
         println(playerMovement)
         Thread.sleep(10)
       }
    }
  }).start 
 }
}