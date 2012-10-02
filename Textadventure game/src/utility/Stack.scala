package utility

trait Stack[A] {
  def push(o:A)
  def pop():A
  def isEmpty:Boolean
  def peek:A

}