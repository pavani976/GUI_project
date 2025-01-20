package ATM_Project;

import java.util.Scanner;

public class User_Interface {
    private static int status;

    public static void main(String[] args) {
        AtmImplementation atmimpl = new AtmImplementation();
        Scanner sc = new Scanner(System.in);
        int atmNo = 123456;
        int atmPin = 1234;
        System.out.println("-----------------------------------");
        System.out.println("WELCOME TO THE ATM ");
        System.out.println("-----------------------------------");
        System.out.print("ENTER THE ATM NUMBER : ");
        int atmNo2 = sc.nextInt();
        System.out.print("ENTER YOUR PIN NUMBER : ");
        int atmPin2 = sc.nextInt();
            if (atmNo == atmNo2 && atmPin == atmPin2) {
                while (true) {
                    System.out.println(".......................");
                    System.out.println(" 1.ViewBalance\n 2.withdrawAmount\n 3.DepositAmount\n 4.Transaction History\n 5.Exit");
                    System.out.print("Enter your choice : ");
                    int ch = sc.nextInt();
                    if (ch == 1) {
                        atmimpl.viewBalance();
                    } else if (ch == 2) {
                        System.out.print("Enter your withdraw amount :  ");
                        double withdrawAmount = sc.nextDouble();
                        atmimpl.withdrawAmount(withdrawAmount);
                    } else if (ch == 3) {
                        System.out.print("Enter the amount to deposit :  ");
                        double DepositAmount = sc.nextDouble();
                        atmimpl.depositAmount(DepositAmount);
                    } else if (ch == 4) {
                        atmimpl.ministatement();
                    } else if (ch == 5) {
                        System.out.println("...Please Collect Your ATM Card...\n -----------THANK YOU-------------");
                        System.exit(status);
                    }
                }
            } else {
                System.out.println(" Your entered wrong ATM or PIN number...");
            }
            sc.close();
        }
    }