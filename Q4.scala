//Q4)A Bank defines as List of Accounts. So implement the following functions:
//4.1 List of Accounts with negative balances
//4.2 Calculate the sum of all account balances
//4.3 Calculate the final balances of all accounts after apply the interest function as fallows:
//If balance is positive, deposit interest is .05  and if balance is negative, overdraft interest is .1

import Q3.Account;
object Q4 extends App(){
  var Bank:List[Account] = List();

  //Display account details
  var DisplayAccount = (a:List[Account])=>(a.map(x => println(x)));

  //val Find=(n:String,b:List[Account])=>b.filter(x=>x.NIC.equals(n));
  //4.1 List of Accounts with negative balances
  val NegetiveAccount = (b:List[Account])=>b.filter(x => (x.Balance < 0));

  //4.2 Calculate the sum of all account balances
  val Sum  = (b:List[Account])=> b.reduce((x,y) => new Account("",0,"",x.Balance + y.Balance)).Balance;

  //4.3 Calculate the final balances of all accounts
  val Calculate =(x:Account)=>if(x.Balance < 0) x.Balance * 0.1  else x.Balance*0.05;

  // If balance is positive, deposit interest is 0.05  and if balance is negative, overdraft interest is 0.1
  val Interest=(b:List[Account])=>b.map(x => x.Deposit(Calculate(x)));


  var A1 = new Account("990611517v",127123456,"Shan",759.13);
  var A2 = new Account("967937853v",127098765,"Shenuka",-152.20);
  var A3 = new Account("978394915v",127543212,"Janidu",-34.21);
  var A4 = new Account("984383757v",127098765,"Kushan",52.18);

  Bank = List(A1,A2,A3,A4);
  println(NegetiveAccount(Bank));
  println("Sum : Rs." + Sum(Bank));
  Interest(Bank);
  DisplayAccount(Bank);
}
