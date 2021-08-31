//Q1)Implement a Data Structure for Rational Number and create a method neg to class Rational that is used like this: x.neg // evaluates to -x
object Q1 extends App(){
  import scala.io.StdIn.{readInt} // get input from console
  print("Enter numer:");
  val i=readInt();
    print("Enter denom:");
  val j= readInt();
  val R1 = new Rational(i,j);
  println(R1);

  val R2 = R1.neg;
  print(R2);
}

class Rational(a:Int,b:Int){
  def numer = a;
  def denom=b;
  def neg = new Rational(- this.numer,this.denom);//getting the neg value of given

  override def toString= "[" + numer + "/" + denom + "]";
}
