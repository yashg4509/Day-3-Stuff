package day5;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Geography QUIZ");
		String ans1 = JOptionPane.showInputDialog("What country has the least GDP?");
		String ans2 = JOptionPane.showInputDialog("Where did zero originate from?");
		String ans3 = JOptionPane.showInputDialog("What country is between India and China?");
		String ans4 = JOptionPane.showInputDialog("What is the most central power of Asia?");
		String ans5 = JOptionPane.showInputDialog("What is the richest country in Europe?");
		
		if (ans1 == "Moldova") {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		
		if (ans2 == "India") {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		
		if (ans3 == "Bhutan") {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		
		if (ans4.equals("China") || ans4.equals("Irkutsk")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		
		if (ans5 == "Romania") {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
	}
}