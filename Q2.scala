//Q2)Create a method sub to subtract two rational numbers and find an answer  x-y-z where x=3/4, y=5/8, z=2/7.
object Q2 extends App(){
  import scala.io.StdIn.{readInt}// for get input from console

          println("Enter Numbers for R1")
          print("a:")
          val i=readInt()
          print("b:")
          val j=readInt()
          val R1 = new Rational(i,j);

          println("Enter Numbers for R2")
          print("a:")
          val m=readInt()
          print("b:")
          val n=readInt()
          val R2 = new Rational(m,n);

          println("Enter Numbers for R2")
          print("a:")
          val x=readInt()
          print("b:")
          val y=readInt()
          val R3 = new Rational(x,y);
// displaying R1,R2,R3
          println("R1: " + R1)
          println("R2: " + R2)
          println("R3: " + R3)

  val result = R1.sub(R2).sub(R3);
  println ("Final result : " + result); //Display final result

  class Rational(a:Int,b:Int){
    def numer = a;
    def denom=b;
    def +(r:Rational) = new Rational(this.denom*r.numer + this.numer*r.denom,this.denom*r.denom); // Method for subtract two rational numbers

    def neg = new Rational(- this.numer,this.denom); //getting the neg value of calculated rational number
    def sub(r:Rational) = this + r.neg ; 
    override def toString= "[" + numer + "/" + denom + "]";
  }


}
