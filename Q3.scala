//Q3)Implement a Data Structure for Account and create a method transfer which transfer the money from this account to a given account.

object Q3 extends App{
  import scala.io.StdIn.{readInt}

  var A1 = new Account("990611157v",127123456,"shan",750.13)
  var A2 = new Account("996878562v",127098765,"sandaru",255.20)
  println(A1);
  println(A2);

  print("Amount:")
  val y= readInt()
  A1.Transfer( A2 , y);//A1 transfer money to A2
  println(A1);
  println(A2);

  class Account(a:String,b:Int,c:String,d:Double){
    val NIC = a;
    val Account_no = b;
    val Name = c;
    var Balance = d;

    def Deposit(m:Double) = (this.Balance += m)
    def Withdraw(m:Double) = (this.Balance -= m)

    def Transfer(m1:Account,m2:Double) = {this.Withdraw(m2)
      m1.Deposit(m2)}
    override def toString = "[" + NIC + "," + Account_no + "," + Name + ", Rs." + Balance + "]"
  }
}
