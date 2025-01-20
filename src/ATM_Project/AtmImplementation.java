package ATM_Project;

import java.util.*;

public class AtmImplementation implements Atminterface{
     Atm atm=new Atm();
     Map<Double,String> minstmt=new HashMap<>();
    public void viewBalance() {
System.out.println(" Available balance :"+atm.getBalance());
    }

    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<= atm.getBalance()){
                System.out.print("Collect your cash "+withdrawAmount+"\n");
                atm.setBalance(atm.getBalance()-withdrawAmount);
                minstmt.put(withdrawAmount,"withdrawn from your account");
                viewBalance();
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Enter the amount interns of 500 ");
        }
    }

    public void depositAmount(double depositAmount) {
   System.out.print("DepositAmount :"+ depositAmount+"\n");
   atm.setBalance(atm.getBalance()+depositAmount);
        minstmt.put(depositAmount,"Deposited Successfully....");
        viewBalance();
    }
    public void ministatement() {
  Set<Double> set = minstmt.keySet();
  for(Double d: set){
      System.out.println(d+" is "+minstmt.get(d));
  }
    }
}
