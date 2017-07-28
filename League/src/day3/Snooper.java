package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "COMPLETE THIS SURVEY TO EAT A POTATO!!!!");
	String name = JOptionPane.showInputDialog("Hello there. What is your name?");
	String location = JOptionPane.showInputDialog("Hello "+ name + ". What is your full address?");
	String SSN = JOptionPane.showInputDialog("Hello " + name + "from " + location + ". What is your Social Security Number?");
	String bank = JOptionPane.showInputDialog("Hello " + name + "from " + location + " with the Social Security Number " + SSN + ". What is your bank account number?");
	System.out.println("Thank You for Taking the Survey!!! An assasin will be there in ... 20 mins");
}
}
