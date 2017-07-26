package day3;

import javax.swing.JOptionPane;

public class HelloJava {
	
public static void main(String[] args) {
	String ans = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hello " + ans + ". I am Yash Gupta.");		
}
}
