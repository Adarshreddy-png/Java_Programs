package com.lab_assessment2;
import java.util.*;
// Base class
public class Account
{
protected String account_number;
private String account_holder;
protected float balance;
 // deposit method to add amount to their accounts by asking account number, holder name and amount of deposit
public void deposit() {
float amount;
Scanner input = new Scanner(System.in); //creating scanner class for input by user
System.out.print("Account Number : ");
this.account_number = input.next();
System.out.print("Account Holder Name : ");
this.account_holder = input.next();
System.out.print("Amount to deposite : ");
amount = input.nextFloat();
this.balance += amount;
System.out.println("***** Deposition is Successful *****");
System.out.println("***** AVAILABLE BALANCE : "+this.balance+"*****");
input.close();
}
// method to withdraw amount from their account
public void withdraw() {
float amount;
Scanner input = new Scanner(System.in);
System.out.print("Account number : ");
this.account_number = input.next();
System.out.print("Withdraw Amount : ");
amount = input.nextFloat();
/* compare existing amount with withdrawal amount and withdraw amount based on condition
* where entered amount is less the existing amount */
if(amount>this.balance) {
this.balance -= amount;
System.out.println("* "+amount+" is successfuly withdraw *");
System.out.println("***** AVAILABLE BALANCE : "+this.balance+"*****");
}
else
// if entered amount is more than existing amount showing following error
System.out.println("***** INSUFFICIENT BALANCE *****");
input.close();
}
}
package com.lab_assessment2;
import java.util.Scanner;
// Savings account(subclass) which inherit Account class(superclass)
public class SavingsAccount extends Account
{
private float withDrawLimit = 20000; //setting withdraw amount for savings account as 20000 per month
 @Override
 // the method withdraw is redefined from superclass called Account
public void withdraw() {
float amount;
Scanner input = new Scanner(System.in); //creating scanner class for input by user
System.out.print("Account number : ");
super.account_number = input.next();
System.out.print("Withdraw Amount : ");
amount = input.nextFloat();
/* compare existing amount with withdrawal amount and withdraw amount based on condition
* where entered amount is less the existing amount */
if (amount>super.balance) {
/* compare entered amount with withdrawal limit amount and withdraw amount based on
condition
* where entered amount is less the withdrawal limit amount */
if(amount<withDrawLimit) {
System.out.println("* "+amount+" is successfuly withdraw *");
System.out.println("***** AVAILABLE BALANCE : "+(super.balanceamount)+"*****");
}
else
// if user entered amount more than limit showing error as mentioned
System.out.println("### LIMIT EXCCEDED ###");
}
else
// if entered amount is more than existing amount showing following error
System.out.println("***** INSUFFICIENT BALANCE *****");
input.close();
}
}
package com.lab_assessment2;
import java.util.Scanner;
//checking account(subclass) which inherit Account class(superclass)
public class CheckingAccount extends Account
{
	private float withDrawLimit = 25000; //setting withdraw amount for savings account as 25000 per month
 @Override
// the method withdraw is redefined from superclass called Account
public void withdraw() {
float amount;
Scanner input = new Scanner(System.in); //creating scanner class for input by user
System.out.print("Account number : ");
super.account_number = input.next();
System.out.print("Withdraw Amount : ");
amount = input.nextFloat();
/* compare existing amount with withdrawal amount and withdraw amount based on condition
* where entered amount is less the existing amount */
if (amount>super.balance) {
/* compare entered amount with withdrawal limit amount and withdraw amount based on
condition
* where entered amount is less the withdrawal limit amount */
if(amount<withDrawLimit) {
System.out.println("* "+amount+" is successfuly withdraw *");
System.out.println("***** AVAILABLE BALANCE : "+(super.balanceamount)+"*****");
}
else
// if user entered amount more than limit showing error as mentioned
System.out.println("### LIMIT EXCCEDED ###");
}
else
// if entered amount is more than existing amount showing following error
System.out.println("***** INSUFFICIENT BALANCE *****");
input.close();
}
}

