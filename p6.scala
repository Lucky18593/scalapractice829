object Demo {
  def main(args: Array[String]) {
     println( "Returned Value : " + addInt(10,20) );
  } ;   def addInt( a:Int, b:Int ) : Int = {
     var sum:Int = 0
     sum = a + b;      return sum
  }
}
