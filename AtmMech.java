import java.util.Scanner;

class AtmMachine{
  Scanner sc = new Scanner(System.in);
  int bal=0;
  int apin=8959;
  int tran;
  int d;
  int w;
    
  void bal_info(){
    System.out.println("enter your 4 digit pin");
    int pin=sc.nextInt();
      if  (pin==apin){
      System.out.println("your balance is : "+bal);
      }
      else
      {
        System.out.println("wrong passward");
      }
    }
  void depo(){
    System.out.println("Enter Amount");
    d =sc.nextInt();

    System.out.println("enter your 4 digit pin");
    int pin=sc.nextInt();
      if  (pin==apin){
        bal=bal+d;
        System.out.println("your transaction is secussefull");
        System.out.println("your balance is : "+bal);
      }
      else{
        System.out.println("wrong passward");
      }
    }
  void wit(){
    System.out.println("enter your 4 digit pin");
    int pin=sc.nextInt();
      if  (pin==apin){
        System.out.println("enter amount ");
        w =sc.nextInt();
        bal=bal-w;
        System.out.println( " withrwal succsefull and you balanace is : " +bal);
      }
      else{
        System.out.println("wrong passward");
      }
    }
  void lastt(){
    System.out.println("enter your pin");
    int pin=sc.nextInt();
    if (pin == pin) {
      if(d > 0) {
        System.out.println("Last transaction: Deposit of "+ d +" and your balance is : "+bal);
      } 
      if (w<d) {
        System.out.println("Last transaction: Withdrawal of "+ w + " your balamce is : " +bal);
      } 
      else {
        System.out.println("No previous transaction.");
      }
    }
  }
}

public class AtmMech extends AtmMachine{
  public static void main(String[] args) {
    int i;
    Scanner r = new Scanner(System.in);
    System.out.println("hello");
    try { System.out.println("enter your card ");
      Thread.sleep(3000);
      System.out.println("card Reading dont remove");
      System.out.println("please wait");
      for(int j=0; j<100; j++)
      {
          System.out.print(".");
      }
      Thread.sleep(3000);
      System.out.print("walcomes");
    }
    catch (InterruptedException e) {
      e.printStackTrace();
      System.out.println("walcomes");
    }

    AtmMachine atms= new AtmMachine();
    char c;
    
    do {
      System.out.println("enter your choise");
      System.out.println("1 : balance");
      System.out.println("2 : deposit");
      System.out.println("3 : withrawal");
      System.out.println("4 : last transection");
      i =r.nextInt();
      switch (i) {
        case 1:
          atms.bal_info();
          break;

        case 2:
          atms.depo();
          break;

        case 3:
          atms.wit();
          break;

        case 4:
          atms.lastt();
          break;

        default:
          System.out.println("invalid");
          break;
      }
      System.out.println("if want to continue so press Y");
      c=r.next().charAt(0);
    }

    while( c=='y' | c=='Y');
  }   
}
    

