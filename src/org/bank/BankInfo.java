package org.bank;

public class BankInfo extends AxisBank {
public void savings() {
	System.out.println("200000");
}
public void fixed() {
	System.out.println("700");
}
public static void main(String[] args) {
	BankInfo b = new BankInfo();
	b.savings();
	b.fixed();
	b.deposit();
	
}
}
