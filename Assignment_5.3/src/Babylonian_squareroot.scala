
object Babylonian_squareroot {
  
  def root(n:Float): Float = {
    //Assuming x is the square root of the no
     var x:Float = n
     var y:Float = 1
     
     //To decide the precision
     var e:Float = .00000f
     
     while((x-y)>e){
       //calculate average
       x = (x+y)/2
       y = n/x
     }
     //return output
     x
  }
  def main(args: Array[String]){
    println("Square root of "+args(0)+" is "+root(args(0).toInt))
  }
}